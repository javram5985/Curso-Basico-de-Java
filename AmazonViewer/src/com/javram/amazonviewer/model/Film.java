package com.javram.amazonviewer.model;

public class Film {
	
	private String title; //String no es primitiva por eso va con mayuscula
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	
	public Film(String title, String genre, String creator, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}
	
	public String getTitle() {//metodo, getter - va a retornar un dato, por eso el return y el String
		return title;
	}
	public void setTitle(String title) {//metodo, setter no va a retornar un dato, por eso usamos void 
		this.title = title;//this hace referencia a la clase o metodo que estamos ubicados y no a la variable global
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	public String isViewed() {
		String visto = "";
		if(viewed == true)
		{
			visto = "Si";
		}
		else
		{
			visto = "No";
		}
		return visto;
	}
	public boolean getIsViewed() {
		return viewed;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
	
		
}
