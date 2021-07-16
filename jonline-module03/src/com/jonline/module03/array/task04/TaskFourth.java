package com.jonline.module03.array.task04;

/*
 * В строке найти количество чисел.
 */
public class TaskFourth {
	public static void main(String[] args) {

		String sentence = "\"House 12 is located between 13 and 14\"";
		System.out.println("Initial string \n" + sentence);

		int quantityNumbers = countIntegers(sentence);

		System.out.printf("In the string %s are %d numbers", sentence, quantityNumbers);
	}

	private static int countIntegers(String s) {
		int counter = 0;

		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if (Character.isDigit(array[i])) {
				while (i < array.length && Character.isDigit(array[i])) {
					i++;
				}
				counter++;
			}
		}
		return counter;
	}

}
