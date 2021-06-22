package com.accenture.gamechangers.Scanner;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Boolean quit = true;
		Commandos commando = new Commandos();

		while (quit) {
			System.out.println("Available commands: \"SHOW\" | \"IMPORT\" | \"ADD\" | \"QUIT\"");
			String input = scanner.nextLine();

			commando.importFile(input, scanner);
			commando.addMovie(input, scanner);
			commando.showMovies(input);

			if ("QUIT".equals(input)) {
				System.out.println("You quit the programm");
				quit = false;
				scanner.close();
			}
		}

	}
}