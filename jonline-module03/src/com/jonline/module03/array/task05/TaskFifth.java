package com.jonline.module03.array.task05;

/*
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */
public class TaskFifth {
	public static void main(String[] args) {
		String sentence = "\"   First second      Third  Fourth\"";

		System.out.println("Initial string \n" + sentence);

		sentence = deleteSpaces(sentence);

		System.out.println(sentence);

	}

	private static String deleteSpaces(String s) {
		char[] array = s.toCharArray();
		String someSpaces = "";
		int index = 0;

		while (index < array.length) {
			if (Character.isSpaceChar(array[index])) {
				while (index < array.length && Character.isSpaceChar(array[index])) {
					index++;
				}
				someSpaces += " ";
			} else {
				someSpaces += array[index];
				index++;
			}
		}
		
		String modifiedString = "";

		array = someSpaces.toCharArray();

		for (int i = 1; i < array.length - 1; i++) {
			modifiedString += array[i];
		}

		return modifiedString;
	}
}

