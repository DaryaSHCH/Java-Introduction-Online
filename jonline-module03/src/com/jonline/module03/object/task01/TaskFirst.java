package com.jonline.module03.object.task01;

/*
 *  Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class TaskFirst {
	public static void main(String[] args) {

		String sentence;
		sentence = " The first tongue-twister >> \" There those thousand thinkers    were thinking how did the other three thieves go through.\" \n"
				+ " The second   tongue-twister >> \" The   thirty-three thieves thought           that they thrilled the throne throughout Thursday.\"";

		System.out.println(" Maximal spaces >> " + countSpace(sentence));

	}

	private static int countSpace(String text) {
		int counter = 0;
		int quantityMaxSpace = 0;

		for (int i = 0; i < text.length(); i++) {
			char element = text.charAt(i);
			if (Character.isWhitespace(element)) {
				counter++;
			} else if (counter > quantityMaxSpace) {
				quantityMaxSpace = counter;
			} else {
				counter = 0;
			}
		}

		return quantityMaxSpace;
	}
}
