package com.jonline.module03.object.task05;

/*
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”;
 */
public class TaskFifth {
	public static void main(String[] args) {

		String sentence = "\"This art is amazing\"";

		int quantityA = countLetter(sentence);

		System.out.printf("In the string %s are %d letters \"a\"", sentence, quantityA);
	}

	private static int countLetter(String s) {
		int counter = 0;
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'a') {
				counter++;
			}
		}
		return counter;
	}
}
