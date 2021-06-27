package com.jonline.module02.decomposition.task06;

import java.util.Scanner;

/*
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class TaskSixth {
	public static void main(String[] args) {

		int a;
		int b;
		int c;
		boolean result;

		System.out.println("Input 3 integers more then 0 >>");
		a = inputNumberToConsole("First number >>");
		b = inputNumberToConsole("Second number >>");
		c = inputNumberToConsole("Third number >>");

		result = checkRelativePrimeNumber(a, b, c);

		if (result) {
			System.out.println("This numbers are relative-prime");
		} else {
			System.out.println("This numbers are not relative-prime");
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

	private static int findGlobalFactor(int x, int y) {
		int factor = 0;
		while (x != 0 && y != 0) {
			if (x > y) {
				x = x % y;
			} else {
				y = y % x;
			}
			factor = x + y;
		}

		return factor;
	}

	private static boolean checkRelativePrimeNumber(int firstNumber, int secondNumber, int thirdNumber) {

		int globalFactor;

		globalFactor = findGlobalFactor(firstNumber, secondNumber);

		globalFactor = findGlobalFactor(globalFactor, thirdNumber);

		return globalFactor == 1;
	}
}
