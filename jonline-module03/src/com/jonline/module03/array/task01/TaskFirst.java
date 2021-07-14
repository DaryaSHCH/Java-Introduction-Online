package com.jonline.module03.array.task01;

import java.util.Arrays;

/*
 * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */
public class TaskFirst {
	public static void main(String[] args) {

		String[] arrayCamelCase = { "firstHouse", "secondHouse", "thirdHouse" };

		System.out.println("<< INITIAL ARRAY >>\n" + Arrays.toString(arrayCamelCase));

		for (int i = 0; i < arrayCamelCase.length; i++) {
			arrayCamelCase[i] = turnCamelToSnake(arrayCamelCase[i]);
		}

		System.out.println("<< RESULT >>\n" + Arrays.toString(arrayCamelCase));

	}

	private static String turnCamelToSnake(String element) {

		char[] arrayChars = element.toCharArray();

		String snake = "";

		for (int i = 0; i < arrayChars.length; i++) {

			if (Character.isUpperCase(arrayChars[i])) {
				snake = snake + "_" + Character.toLowerCase(arrayChars[i]);
			} else {
				snake = snake + arrayChars[i];
			}
		}

		return snake;
	}

}
