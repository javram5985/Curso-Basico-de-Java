package com.javram.amazonviewer.model;

import java.util.ArrayList;

//no pusimos metodo main en la class porque este metodo solo lo debe llevar el main.java, los demas no
public class Chapter extends Movie{
	
	private int id;
	private int sessionNumber;
	
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionNumber) {
		super(title, genre, creator, duration, year);
		this.sessionNumber = sessionNumber;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.getId();
	}

	public int getSessionNumber() {
		return sessionNumber;
	}

	public void setSessionNumber(int sessionNumber) {
		this.sessionNumber = sessionNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ":: Chapter ::"
				+ "\nTitle: " + getTitle()
				+ "\nGenre: " + getGenre()
				+ "\nCreator: " + getCreator()
				+ "\nDuration: " + getDuration()
				+ "\nYear: " +getYear();
	}	
	
	
	public static ArrayList<Chapter> makeChaptersList()
	{
		ArrayList<Chapter> chapters = new ArrayList<Chapter>();
		
		for (int i = 1; i <= 5; i++) 
		{
			chapters.add(new Chapter("Titulo" + " " + i, "Genre" + " " + i, "Creator" + " " + i, 45, (short)2017, i));
		}
		
		return chapters;
	}
	
}
