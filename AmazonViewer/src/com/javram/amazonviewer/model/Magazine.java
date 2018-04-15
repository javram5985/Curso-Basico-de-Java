package com.javram.amazonviewer.model;

import java.util.Date;

//no pusimos metodo main en la class porque este metodo solo lo debe llevar el main.java, los demas no
public class Magazine extends Publication{

	private int id;
	
	//Metodo Constructor
	public Magazine(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial, authors);
	}
	
	//Getters y Setters
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ":: Magazine ::"
				+ "\nTitle: " + getTitle()
				+ "\nEditorial: " + getEditorial()
				+ "\nEdition Date: " + getEditionDate();
	}
	
}
