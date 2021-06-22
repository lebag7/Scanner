package com.accenture.gamechangers.Scanner;

import java.util.Scanner;

public class Commandos {

	
	public void importFile (String input, Scanner scanner) {
		if("IMPORT".equals(input)) {
		new	TextReader().fileReader("Movies.txt");
//		"C:/Users/yasmine.gabel/eclipse-workspace/scanner/Movies.txt"
		}
	}
	
	
	public void addMovie (String input, Scanner scanner) {
		if("ADD".equals(input)){
			System.out.println("Type in the movie");
			String inputMovie = scanner.nextLine(); 
			new Movie().addingMovieRow(inputMovie, scanner);
			}
		
		
		
	}

	public void showMovies (String input) {
		if("SHOW".equals(input)){
			new Movie().showingMovies();
			}
		
		
		
	}
}
