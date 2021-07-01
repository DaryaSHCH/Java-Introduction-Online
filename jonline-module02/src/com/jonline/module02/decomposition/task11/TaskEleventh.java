package com.jonline.module02.decomposition.task11;

import java.util.Scanner;

/*
 *  Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class TaskEleventh {
	public static void main(String[] args) {

		int first;
		int second;

		first = inputNumberToConsole(" first integer more then 0 >>");
		second = inputNumberToConsole(" second integer more then 0 >>");

		int[] arrayFirst = splitToArray(first);
		int[] arraySecond = splitToArray(second);

		if (arrayFirst.length > arraySecond.length) {
			System.out.println("the first number contains more digits than the second");
		} else {
			System.out.println("the second number contains more digits than the first");
		}

	}

	public static int inputNumberToConsole(String message) {
		Scanner reader;
		int number;

		reader = new Scanner(System.in);

		do {
			System.out.println("Input " + message);

			while (!reader.hasNextInt()) {
				System.out.println("Input integer>>");
				reader.next();
			}
			number = reader.nextInt();
		} while (number <= 0);

		return number;
	}

	public static int[] splitToArray(int number) {
		int[] array;
		int counter = 0;
		int element = number;

		while (number != 0) {
			number = number / 10;
			counter++;
		}

		array = new int[counter];

		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = number % 10;
			number = number / 10;
		}

		return array;
	}

}
