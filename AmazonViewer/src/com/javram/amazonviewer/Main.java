package com.javram.amazonviewer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.javram.amazonviewer.model.Chapter;
import com.javram.amazonviewer.model.Movie;
import com.javram.amazonviewer.model.Serie;
import com.javram.makereport.Report;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
	}
	
	public static void showMenu() 
	{

		int exit = 0;
		
		do
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println("");
			System.out.println("Selecciona el numero de la opcion deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			
			//int response = sc.nextInt();
			int response = Integer.valueOf(sc.nextLine());
			
			switch(response)
			{
				case 0:
					exit = 0;
					break;
				case 1:
					showMovies();
					break;
				case 2:
					showSeries();
					break;
				case 3:
					showBooks();
					break;
				case 4:
					showMagazines();
					break;
				case 5:
					makeReport();
					break;
				case 6:
					//Date date = new Date()
					makeReport(new Date());//lo de arriba es lo mismo que lo que esta en esta linea
					break;
				default:
					System.out.println("Opcion no disponible");
					break;
			}
		}
		while(exit != 0);
	}
	
	static ArrayList<Movie> movies;
	public static void showMovies() 
	{
		int exit = 1;
		movies = Movie.makeMoviesList();
		
		do
		{
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();
			
			for (int i = 0; i < movies.size(); i++) {
				System.out.println(i + 1 + ". " + movies.get(i).getTitle() + " Visto: " + movies.get(i).isViewed());
			}
			
			System.out.println("0. Regresar al Menu anterior");
			System.out.println();
			
			//Leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response != 0 && response > 0) 
			{
				Movie movieSelected = movies.get(response - 1);
				movieSelected.setViewed(true);
				Date dateI = movieSelected.startToSee(new Date());
			
				for (int i = 0; i < 1000; i++) {
					System.out.println("..........");
				}
			
				movieSelected.stopToSee(dateI, new Date());
				System.out.println("Viste: " + movieSelected);
				System.out.println("Por: " + movieSelected.getTimeViewed() + " milisegundos");
			}
			else 
			{
				showMenu();
				exit = 0;
			}
			
		}
		while(exit != 0);
		
	}
	
	public static void showSeries() 
	{
		
		int exit = 1;
		ArrayList<Serie> series = Serie.makeSeriesList();
		
		do
		{
			System.out.println();
			System.out.println(":: SERIES ::");
			System.out.println();
			
			for (int i = 0; i < series.size(); i++) 
			{
				System.out.println(i + 1 + ". "+ series.get(i).getTitle() + " " + "Visto: " + series.get(i).isViewed() );
			}
			
			System.out.println("0. Regresar al Menu anterior");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response != 0)
			{
				showChapters(series.get(response-1).getChapters());
			}
			else 
			{
				showMenu();
				exit = 0;
			}
		}
		while(exit != 0);
		
	}
	
	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) 
	{
		
		int exit = 1;
		
		do
		{
			System.out.println();
			System.out.println(":: CHAPTERS ::");
			System.out.println();
			
			for (int i = 0; i < chaptersOfSerieSelected.size() ; i++) 
			{
				System.out.println(i + 1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " " + "Visto: " + chaptersOfSerieSelected.get(i).isViewed());
			}
			System.out.println("0. Regresar a Series");
			System.out.println();
			
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			
			if(response != 0)
			{
				Chapter chapterSelected = chaptersOfSerieSelected.get(response -1);
				chapterSelected.setViewed(true);
				Date dateI = chapterSelected.startToSee(new Date());
				
				for (int i = 0; i < 1000; i++) 
				{
					System.out.println("..........");
				}
				
				chapterSelected.stopToSee(dateI, new Date());
				System.out.println("Viste: " + chapterSelected);
				System.out.println("Por: " + chapterSelected.getTimeViewed() + " milisegundos");
				
			}
			else
			{
				showSeries();
				exit = 0;
			}
		}
		while(exit != 0);
		
	}
	
	public static void showBooks() 
	{
		
		int exit = 0;
		
		do
		{
			System.out.println();
			System.out.println(":: BOOKS ::");
			System.out.println();
		}
		while(exit != 0);
		
	}
	
	public static void showMagazines() 
	{
		
		int exit = 0;
		
		do
		{
			System.out.println();
			System.out.println(":: MAGAZINES ::");
			System.out.println();
		}
		while(exit != 0);
		
	}
	
	public static void showExit()
	{
		System.out.println("Has salido de AmazonViewer");
	}
	
	public static void makeReport()//ejemplo de sobrecarga makeReport, makeReport
	{
		Report report = new Report();
		report.setNameFile("reporte");
		report.setTitle(":: VISTOS ::");
		report.setExtension("txt");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contentReport += movie.toString();
			}
		}
		report.setContent(contentReport);
		report.makeReport();
	}
	
	public static void makeReport(Date date)
	{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = df.format(date);
		Report report = new Report();
		
		report.setNameFile("reporte" + dateString);
		report.setTitle(":: VISTOS ::");
		report.setExtension("txt");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if (movie.getIsViewed()) {
				contentReport += movie.toString();
			}
		}
		report.setContent(contentReport);
		report.makeReport();
	}
}

