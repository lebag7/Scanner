package com.accenture.gamechangers.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Movie {

	public void addingMovieRow(String inputMovie, Scanner scanner) {

		
		TextReader.movies.add(inputMovie);
	}

	public void showingMovies() {
		TextReader.movies.forEach((element)->System.out.println(element));
		
	}

}
