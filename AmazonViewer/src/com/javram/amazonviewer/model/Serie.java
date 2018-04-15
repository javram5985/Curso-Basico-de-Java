package com.javram.amazonviewer.model;

import java.util.ArrayList;

//no pusimos metodo main en la class porque este metodo solo lo debe llevar el main.java, los demas no
public class Serie extends Film{
	
	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> chapters;

	public Serie(String title, String genre, String creator, int duration, int sessionQuantity, ArrayList<Chapter> chapters){
		super(title, genre, creator, duration);
		this.sessionQuantity = sessionQuantity;
		this.chapters = chapters;
	}

	public int getId() {
		return id;
	}

	public int getSessionQuantity() {
		return sessionQuantity;
	}

	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}

	public ArrayList<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ":: SERIE ::"
				+ "\nTitle: " + getTitle()
				+ "\nGenre: " + getGenre()
				+ "\nCreator: " + getCreator()
				+ "\nDuration: " + getDuration();
	}
	
	public static ArrayList<Serie> makeSeriesList()
	{
		ArrayList<Serie> series = new ArrayList<Serie>();
		
		for (int i = 1; i <= 5; i++) {
			series.add(new Serie("Serie" + " " + i, "Genre" + " " + i, "Creator" + " "+ i, 120, 5, Chapter.makeChaptersList()));
		}
		
		return series;
	}
	
}
