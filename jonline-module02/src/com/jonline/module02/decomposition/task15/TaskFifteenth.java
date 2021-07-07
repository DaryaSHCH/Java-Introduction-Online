package com.jonline.module02.decomposition.task15;

import java.util.Scanner;

/*
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class TaskFifteenth {
	public static void main(String[] args) {

		int n;
		int minimal;
		int maximal;

		int[] digitsFromNumber;

		n = inputNumberToConsole(" number of digits in a integer N >>");

		minimal = findMinimalNumber(n);
		maximal = findMaximalNumber(n);

		for (int i = minimal; i <= maximal; i++) {
			int temporaryVar;
			temporaryVar = i;
			digitsFromNumber = new int[n];

			for (int j = 0; j < n; j++) {
				digitsFromNumber[j] = temporaryVar % 10;
				temporaryVar /= 10;
			}
			if (searchRequiredNumber(digitsFromNumber)) {
				System.out.print(i + ", ");
			}
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
		} while (number <= 1 || number > 9);

		return number;
	}

	public static int findMinimalNumber(int number) {
		int min = 1;
		for (int i = 1; i < number; i++) {
			min = min * 10 + 1;
		}

		return min;

	}

	public static int findMaximalNumber(int number) {
		int max = 9;
		for (int i = 1; i < number; i++) {
			max = max * 10 + 9;
		}

		return max;

	}

	public static boolean searchRequiredNumber(int[] array) {
		int counter = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1] + 1) {
				counter++;
			} else
				break;
		}
		return counter == array.length - 1;
	}

}
