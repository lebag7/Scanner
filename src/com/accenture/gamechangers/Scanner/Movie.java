package com.accenture.gamechangers.Scanner;


public class Movie {

	public void addingMovieRow(String inputMovie) {

		TextReader.movies.add(inputMovie);
	}

	public void showingMovies() {
		TextReader.movies.forEach((element) -> System.out.println(element));

	}

}
