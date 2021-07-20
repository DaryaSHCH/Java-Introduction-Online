package com.jonline.module03.object.task07;

import java.util.Scanner;

/*
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
 * def", то должно быть выведено "abcdef".
 */
public class TaskSeventh {
	public static void main(String[] args) {
		
		String sentence = inputStringToConsole();
		removeRepeatSpacesSymbols(sentence);

	}

	public static String inputStringToConsole() {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);

		System.out.println("Input string with repeated spaces and symbols >>");
		String line = reader.nextLine();

		return line;
	}

	private static void removeRepeatSpacesSymbols(String s) {

		String tempStr = "";

		for (int i = 0; i < s.length(); i++) {
			String letter = Character.toString(s.charAt(i));
			if (s.charAt(i) != ' ' && !(tempStr.contains(letter))) {
				tempStr = tempStr.concat(String.copyValueOf(s.toCharArray(), i, 1));
			}
		}

		System.out.println(tempStr);
	}
}
