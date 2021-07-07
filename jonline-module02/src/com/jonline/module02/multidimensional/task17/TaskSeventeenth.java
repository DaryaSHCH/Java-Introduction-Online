package com.jonline.module02.multidimensional.task17;

import java.util.Scanner;

/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class TaskSeventeenth {
	public static void main(String[] args) {

		int n;
		int currentSumDigits;
		int counter = 0;
		n = inputNumberToConsole(" Number >>");

		while (n > 0) {
			currentSumDigits = findSumDigits(n);
			System.out.println(
					" From Number " + n + " had been substructed " + currentSumDigits + " (sum of this digits) ");
			n -= findSumDigits(n);
			counter++;
		}

		System.out.println(" Result " + counter + " reps to get 0");
	}

	public static int findSumDigits(int number) {
		int sum = 0;
		int[] arrayDigits = splitNumberToArray(number);
		for (int i = 0; i < arrayDigits.length; i++) {
			sum += arrayDigits[i];
		}
		return sum;

	}

	public static int[] splitNumberToArray(int numberFromArrayBeforeArmstrong) {
		char[] arrayDigitChar = ("" + numberFromArrayBeforeArmstrong).toCharArray();

		int[] digits = new int[arrayDigitChar.length];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = arrayDigitChar[i] - '0';
		}

		return digits;
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
}
