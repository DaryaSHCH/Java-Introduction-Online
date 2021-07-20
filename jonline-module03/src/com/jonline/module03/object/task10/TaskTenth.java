package com.jonline.module03.object.task10;

/*
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X.
 */
public class TaskTenth {
	public static void main(String[] args) {

		String x = " An apple is green. Strawberry is red! What's color of orange?";

		System.out.println("quantity of sentences in this String >> " + countSentences(x));
	}

	public static int countSentences(String str) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?') {
				counter++;
			}

		}
		return counter;
	}
}
