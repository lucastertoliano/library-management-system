package com.libraryManagementSystemV2.terminal.entities;

public class Magazine extends Material {

	private int number;

	public Magazine(String title, String author, int number) {
		super(title, author);
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return super.toString() + ", Number: " + number;
	}
	
}
