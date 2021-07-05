package com.jonline.module02.decomposition.task12;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не больше N.
 */
public class TaskTwelth {
	public static void main(String[] args) {

		int k;
		int n;

		k = inputNumberToConsole("integer K >>");

		n = inputNumberToConsole("integer N >>");

		int arrayLength = findArrayLength(k, n);
		createFinalArray(k, n, arrayLength);

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

	public static int findArrayLength(int k, int n) {
		int counter = 0;
		int buff;
		int sum;

		for (int i = 0; i < n; i++) {
			buff = i;
			sum = 0;

			while (buff < 0) {
				sum += buff % 10;
				buff /= 10;
			}
			if (sum == k) {
				counter++;
			}

		}
		return counter;

	}

	public static int[][] formNumbers(int k, int n) {

		int[][] arrayMultidimensional = new int[2][k - 1];

		for (int i = 1, j = k - 1; i < k; i++, j--) {

			arrayMultidimensional[0][i - 1] = i;
			arrayMultidimensional[1][i - 1] = j;
		}
		return arrayMultidimensional;
	}

	public static int[] createFinalArray(int k, int n, int arrayLength) {
		int[] array = new int[arrayLength];
		int[][] sourceNumbers = formNumbers(k, n);
		System.out.println(Arrays.deepToString(sourceNumbers));
		int counter = 0;
		while (counter != array.length) {

		}

		return array;
	}

}
