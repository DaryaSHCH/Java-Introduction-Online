package com.jonline.module03.object.task09;

import java.util.Scanner;

/*
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
 * буквы.
 */
public class TaskNinth {
	public static void main(String[] args) {
		String sentence;
		int quantityLowerСase;
		int quantityUpperCase;

		sentence = inputStringToConsole("input english language sentence >>");

		quantityLowerСase = countLowerCase(sentence);
		quantityUpperCase = countUpperCase(sentence);

		System.out.println("The number of lowercase letters in the entered string is " + quantityLowerСase
				+ " \n and number of uppercase letters in the entered string is  " + quantityUpperCase);
	}

	public static String inputStringToConsole(String message) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println(message);

		return reader.nextLine();
	}

	public static int countLowerCase(String str) {
		int counterLC = 0;
		for (int i = 0; i < str.length(); i++) {
			char symbolCh = str.charAt(i);
			if (symbolCh >= 'a' && symbolCh <= 'z') {
				counterLC++;
			}
		}
		return counterLC;
	}

	public static int countUpperCase(String str) {
		int counterUC = 0;
		for (int i = 0; i < str.length(); i++) {
			char symbol = str.charAt(i);
			if (symbol >= 'A' && symbol <= 'Z') {
				counterUC++;
			}
		}
		return counterUC;
	}
}
