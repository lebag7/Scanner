package com.accenture.surfershells.GuessTheMovie;

// Todo
// import a list: check
// get a random movie out of the list: check
// convert movie titel to underscores: check
// send introduction to the user
// define the letter input
// insert a int with the 10 start points, possible guesses
// get the input of the user
// save the input letter of the user
// compare if input is in the random movie title
// define which place has the letter in the movie string
// if in the movie titel replace underscore with letter and print put new titel and let user guess again
// create new output random movie  after reveiving the right letter
// if not in the movie titel tell user and let him guess again
// decrease the lasting points when letter is not in the random movie title
// tell when you loose incl the final movie title
// tell when you win incl the final Movie Title
// start game
// show when the game ends

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.io.FileNotFoundException;

public class Game {

	private ArrayList<String> movieList;
	String randomMovieString;

	Game() throws Exception {

		// File INhalt in ein Array kopieren um besser darauf zugreifen zu können

		try {
			File file = new File("Movies.txt");
			Scanner fileScanner = new Scanner(file);
			movieList = new ArrayList<>();
			while (fileScanner.hasNextLine()) {
				movieList.add(fileScanner.nextLine());
			}
			fileScanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// random Movie aus Array auswählen

		int randomIndex = (int) (Math.random() * movieList.size());
		String randomMovie = movieList.get(randomIndex).toLowerCase();

		System.out.println(randomMovie);

		String randomMovieString = randomMovie.replaceAll("[a-z]", "-");
		System.out.println(randomMovieString);
	}

}
