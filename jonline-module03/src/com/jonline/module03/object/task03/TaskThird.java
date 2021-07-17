package com.jonline.module03.object.task03;

import java.util.Scanner;

/*
 * Проверить, является ли заданное слово палиндромом
 */
public class TaskThird {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		String firstWord;
		
		System.out.println("Input word >>");
		
		firstWord = reader.nextLine();
		System.out.println("This word \"" + firstWord + "\" " + findPalindrome(firstWord));
	}

	private static String findPalindrome(String firstWord) {
		boolean palindrome = false;
		for (int i = 0; i < firstWord.length() / 2; i++) {
			char first = firstWord.charAt(i);
			char second = firstWord.charAt(firstWord.length() - i - 1);
			if (first == second) {
				palindrome = true;
			} else {
				palindrome = false;
			}

		}
		return palindrome ? "it's palindrome" : "isn't palindrome";
	}
}
