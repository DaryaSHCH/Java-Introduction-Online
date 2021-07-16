package com.jonline.module03.array.task03;

/*
 * В строке найти количество цифр.
 */
public class TaskThird {
	public static void main(String[] args) {

		String sentence = "\"In the house of 1276 inhabitants\"";

		System.out.println("Initial string \n" + sentence);

		int counterDigits = countDigits(sentence);

		System.out.printf("In the string %s are %d digits", sentence, counterDigits);

	}

	private static int countDigits(String s) {
		int counter = 0;
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i])) {
				counter++;
			}
		}
		return counter;
	}
}
