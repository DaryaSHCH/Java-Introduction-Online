package com.jonline.module02.decomposition.task16;

import java.util.Scanner;

/*
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class TaskSixteenth {
	public static void main(String[] args) {

		int n;
		int minimal;
		int maximal;

		int[] digitsArray;
		int sumEvenNumber = 0;
		int sumOddNumber = 0;

		n = inputNumberToConsole(" number of digits in a integer (from 1 to 9)  N >>");
		minimal = findMinimalNumber(n);
		maximal = findMaximalNumber(n);

		for (int i = minimal; i <= maximal; i++) {
			int temporaryVar = i;
			digitsArray = new int[n];
			if (maximal > 9) {
				for (int j = 0; j < n; j++) {
					digitsArray[j] = temporaryVar % 10;
					temporaryVar /= 10;
					if (digitsArray[j] % 2 == 0) { // переходим к следующему числу.
						break;
					}
				}
			} else if (i % 2 == 1) {
				digitsArray[0] = i;
			}
			sumOddNumber += findSumNumbers(digitsArray);
		}
		sumEvenNumber = findEvenNumber(sumOddNumber);

		System.out.println("Sum " + n + " - digit numbers, contains only odd numbers is  " + sumOddNumber);
		System.out.println("Even digits in the found sum >> " + sumEvenNumber);
	}

	public static int findSumNumbers(int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
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

	public static int findEvenNumber(int number) {
		int counterEvenNumber = 0;
		int digit;

		if (number > 9) {
			while (number > 0) {
				digit = number % 10;
				number /= 10;
				if (digit % 2 == 0) {
					counterEvenNumber++;
				}
			}
		} else {
			if (number % 2 == 0) {
				counterEvenNumber++;
			}
		}
		return counterEvenNumber;
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

}
