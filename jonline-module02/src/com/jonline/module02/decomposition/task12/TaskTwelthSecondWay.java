package com.jonline.module02.decomposition.task12;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не больше N.
 */
public class TaskTwelthSecondWay {
	public static void main(String[] args) {

		int k;
		int n;

		int randomArrayLength = 100;
		k = inputNumberToConsole("integer K >>");

		n = inputNumberToConsole("integer N >>");

		int[] arrayRequiredNumbers = new int[10];
		//Random rand = new Random();
		
		for (int i = 0; i <= n; i++) {
			if ( findSumDigits(i) == k && i < n) {
				arrayRequiredNumbers[i] = i;
			}
		}

		System.out.println(Arrays.toString(arrayRequiredNumbers));

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

//	public static int findArraySize (int number) {
//		char[] arrayDigits = ("" + number).toCharArray();
//		int arraySize = arrayDigits.length;
//		return arraySize;
//	}
	public static int[] formArrayDigitsFromNumber(int number) {
		char[] arrayDigitsFromNumber = ("" + number).toCharArray();
		int[] digits = new int[arrayDigitsFromNumber.length];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = arrayDigitsFromNumber[i] - '0';
		}

		return digits;

	}

	public static int findSumDigits(int number) {
		int sum = 0;
		int[] currentArrayDigits = formArrayDigitsFromNumber(number);
		for (int i = 0; i < currentArrayDigits.length; i++) {
			sum += currentArrayDigits[i];
		}
		return sum;
	}
}
