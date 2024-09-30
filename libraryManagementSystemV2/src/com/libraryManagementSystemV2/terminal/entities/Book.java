package com.libraryManagementSystemV2.terminal.entities;

public class Book extends Material {
	
	private Genre genre;

	public Book(String title, String author, Genre genre) {
		super(title, author);
		this.genre = genre;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return super.toString() + ", Genre: " + genre;
	}
	
	

	
	
	
	
	

}
