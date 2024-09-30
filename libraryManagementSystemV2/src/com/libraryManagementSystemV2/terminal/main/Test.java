package com.libraryManagementSystemV2.terminal.main;

import java.util.Scanner;

import com.libraryManagementSystemV2.terminal.entities.Library;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int option;
		Library library = new Library();
		
		do {
			System.out.println("\n Options: \n 1) Add Material \n 2) Search Material \n 3) Delete Material \n 4) List Materials \n 5) Exit");
			option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				library.addMaterial();
				break;
			case 2:
				library.searchMaterial();
				break;
			case 3:
				library.deleteMaterial();
				break;
			case 4:
				library.listMaterial();
				break;
			case 5:
				System.out.println("Thank you for using our library system!");
				break;
			
			}
		} while (option != 5);

	}

}
