package com.giffgaff.money.cucumber.data;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public final class WordGenerator {

	private static ArrayList<String> words = new ArrayList<String>();

	public static void populateWords() throws FileNotFoundException {
		Scanner reader = new Scanner(new File("src/test/resources/dictionary.txt"));
		while (reader.hasNext()) {
			words.add(reader.next());
		}
		reader.close();
	}

	public static String getRandomWord() {
		if (words.size() < 10) {
			try {
				populateWords();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				fail("Unable to find dictionary file");
			}
		}
		return words.get(Math.abs(new Random().nextInt(words.size())));
	}

	public static String getRandomTwoWords() {
		if (words.size() < 10) {
			try {
				populateWords();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				fail("Unable to find dictionary file");
			}
		}
		return words.get(Math.abs(new Random().nextInt(words.size()))) + "_" + words.get(Math.abs(new Random().nextInt(words.size())));
	}
}