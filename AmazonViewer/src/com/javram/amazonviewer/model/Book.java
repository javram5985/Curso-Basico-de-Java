package com.javram.amazonviewer.model;
import java.util.Date;
//no pusimos metodo main en la class porque este metodo solo lo debe llevar el main.java, los demas no
public class Book extends Publication implements IVisualizable{
	
	private int id;
	private String isbn;
	private boolean read;
	private int timeRead;
	
	//Metodo Constructor 
	public Book(String title, Date editionDate, String editorial, String[] authors, String isbn, boolean read,
			int timeRead) {
		super(title, editionDate, editorial, authors);
		this.isbn = isbn;
		this.read = read;
		this.timeRead = timeRead;
	}

	//Getters y Setters
	public int getId() {
		return id;
	}
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	public int getTimeRead() {
		return timeRead;
	}

	public void setTimeRead(int timeRead) {
		this.timeRead = timeRead;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String detailBook = ":: Book ::"
							+ "\nTitle: " + getTitle()
							+ "\nEditorial: " + getEditorial()
							+ "\nEdition Date: " + getEditionDate()
							+ "\nAuthors: ";
		for(int i = 0; i < getAuthors().length; i++)
		{
			detailBook += "\t" + getAuthors()[i];
		}
		return detailBook;
	}

	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}

	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getSeconds() > dateI.getSeconds())
		{	
			setTimeRead(dateF.getSeconds() - dateI.getSeconds());
		}
		else
		{
			setTimeRead(0);
		}
	}
	
}
