package com.jonline.module03.object.task04;

/*
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class TaskFourth {
	public static void main(String[] args) {

		String initialWord = "информатика";

		String cake = String.valueOf(initialWord.charAt(initialWord.indexOf("т")))
				+ String.valueOf(initialWord.charAt(initialWord.indexOf("о")))
				+ String.valueOf(initialWord.charAt(initialWord.indexOf("р")))
				+ String.valueOf(initialWord.charAt(initialWord.indexOf("т")));

		System.out.println(cake);
	}
}
