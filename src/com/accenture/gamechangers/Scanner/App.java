package com.accenture.gamechangers.Scanner;
import java.util.Scanner;

public class App {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Boolean quit = true;

		while (quit) {
			System.out.println("Available commands: \"SHOW\" | \"IMPORT\" | \"ADD\" | \"QUIT\"");
			String input = scanner.nextLine();
			switch (input) {
				case "SHOW":
					new Movie().showingMovies();
					break;
				case "IMPORT":
					new TextReader().readingFile("Movies.txt");
					break;
				case "ADD":
					System.out.println("Type in the movie");
					String inputMovie = scanner.nextLine();
					new Movie().addingMovieRow(inputMovie);
					break;
				case "QUIT":
					System.out.println("You quit the programm");
					quit = false;
					scanner.close();
					break;
				default:
					System.out.println("Command not found, please check your spelling");
			}

		
		}

	}
}