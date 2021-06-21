package com.accenture.gamechangers.Scanner;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class FileReader {

	private ArrayList<String> movieList;
	
	FileReader() throws Exception {

		// File Inhalt in ein Array kopieren um besser darauf zugreifen zu können

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
System.out.println(movieList);
	}

}
