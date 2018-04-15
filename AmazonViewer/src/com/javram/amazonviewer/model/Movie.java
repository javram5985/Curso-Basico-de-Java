package com.javram.amazonviewer.model;
import java.lang.reflect.Array;
import java.util.ArrayList;
//no pusimos metodo main en la class porque este metodo solo lo debe llevar el main.java, los demas no	
import java.util.Date;

public class Movie extends Film implements IVisualizable{
	//primer paso, variables primitivas, string no es una variable primitiva, las variables primitivas van con minusculas
	private int id;
	private int timeViewed;
	
	//click derecho, source, generate constructor using fields
	public Movie(String title, String genre, String creator, int duration, short year) //constructor
	{
		super(title, genre, creator, duration);
		setYear(year);
	}
	
	public void showData()//metodo, siempre son public
	{
		//System.out.println("Title:" + title);
		//System.out.println("Genre:" + genre);
		//System.out.println("Year:" + year);
	}
	
	public int getId() //source, generate getters and setters
	{
		return id;
	}

	public int getTimeViewed() 
	{
		return timeViewed;
	}

	public void setTimeViewed(int timeViewed) 
	{
		this.timeViewed = timeViewed;
	}
	
	@Override //polimorfismo y sobreescritura porque estamos cambiando lo que ejecuta este metodo
	public String toString() {
		return ":: MOVIE ::"
			   + "\nTitle: " + getTitle()
			   + "\nGenre: " + getGenre() 
			   + "\nYear: " + getYear() 
			   + "\nCreator: " + getCreator() 
			   + "\nDuration: " + getDuration() + "\n" + "\n";
	}
	
	//esto debe estar siempre implementado a la hora de hacer interfaces
	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getTime() > dateI.getTime())
		{	
			setTimeViewed((int)(dateF.getTime() - dateI.getTime()));
		}
		else
		{
			setTimeViewed(0);
		}
	}	
	
	public static ArrayList<Movie> makeMoviesList()
	{
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		for(int i = 1; i <= 5; i++) {
			movies.add(new Movie("Movie" + " " + i, "Genre" + " "+ i, "Creator" + " " + i, 120, (short)(2017 + i)));
		}
		
		return movies;
	}
	
	
}
