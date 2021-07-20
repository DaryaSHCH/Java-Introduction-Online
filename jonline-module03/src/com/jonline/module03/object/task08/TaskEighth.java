package com.jonline.module03.object.task08;

import java.util.Scanner;

/*
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
 * длинных слов может быть несколько, не обрабатывать.
 */
public class TaskEighth {
	public static void main(String[] args) {
		String sentence;
		String longestWord;

		sentence = inputStringToConsole("Input any sentence >>");
		longestWord = searchLongestWord(sentence);

		System.out.println("The longest word in this sentence \"" + longestWord + "\"");
	}

	public static String inputStringToConsole(String message) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.println(message);

		return reader.nextLine();
	}

	public static String searchLongestWord(String s) {
		int counterLetters = 0;
		String longWord = null;
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > counterLetters) {
				counterLetters = words[i].length();
				longWord = words[i];
			}
		}
		return longWord;
	}
}
