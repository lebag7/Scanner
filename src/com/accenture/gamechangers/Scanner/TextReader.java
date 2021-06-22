package com.accenture.gamechangers.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextReader {
	static ArrayList<String> movies = new ArrayList();

	public void readingFile(String path) {

		try (Scanner scanner = new Scanner(new File(path));) {

			while (scanner.hasNextLine()) {

				String film = scanner.nextLine();
				movies.add(film);

				System.out.println(film);
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
