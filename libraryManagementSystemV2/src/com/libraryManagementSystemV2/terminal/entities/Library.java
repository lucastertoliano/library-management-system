package com.libraryManagementSystemV2.terminal.entities;

import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Library {
	
	Scanner sc = new Scanner(System.in);
	private ArrayList<Material> materials = new ArrayList<Material>();
	
	public void addMaterial() {
        System.out.println("Enter the Title: ");
        String title = sc.nextLine();
        if (title.isEmpty()) {
            System.out.println("Please enter the title! \n Try Again");
            return;
        }
        System.out.println("Enter the Author: ");
        String author = sc.nextLine();
        if (author.isEmpty()) {
            System.out.println("Please enter the author! \n Try Again");
            return;
        }
        System.out.println("What kind of material you want to add? (1-Book and 2-Magazine)");
        int option = sc.nextInt();
        sc.nextLine();
        if (option == 1) {
            Genre.printAllGenres();
            System.out.println("Enter the Genre Option: ");
            int genreOption = sc.nextInt();
            sc.nextLine();
            Genre genre = Genre.getGenreByOption(genreOption);
            Book book = new Book(title, author, genre);
            materials.add(book);
            System.out.println("Book added successfully");
        }
        else if (option == 2) {
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            sc.nextLine();
            Magazine magazine = new Magazine(title, author, number);
            materials.add(magazine);
            System.out.println("Magazine added successfully");
        }

    }

	
	public void searchMaterial() {
		System.out.println("Enter the title material would you like search? ");
		String title = sc.nextLine();
		if (title.isEmpty()) {
			System.out.println("Please enter the title! \n Try Again");
			return;
		}
		boolean found = false;
		for (Material material : materials) {
			if (material.getTitle().equalsIgnoreCase(title)) {
				System.out.println(material);
				System.out.println("Material found successfully!");
				found = true;
				return;
			}
		}
		if(!found) {
			System.out.println("The library does not have this material! \n Try Again");
			return;
		}
	}
	
	public void deleteMaterial() {
		System.out.println("Enter the title of material would you like delete? ");
		String title = sc.nextLine();
		if (title.isEmpty()) {
			System.out.println("Please enter the title! \n Try Again");
			return;
		}
		boolean found = false;
		for (Material material : materials) {
			if (material.getTitle().equalsIgnoreCase(title)) {
				materials.remove(material);
				System.out.println("Material deleted successfully!");
				return;
			}
		}
		if (!found) {
			System.out.println("Material not found! \n Try Again");
			return;
		}
	}
	
	public void listMaterial() {
		if (materials.isEmpty()) {
			System.out.println("The library is empty. \n Try again another time! ");
		}
		else {
			for (Material material : materials) {
				System.out.println(material);
			}
		}
	}
				
}
			
		
	

