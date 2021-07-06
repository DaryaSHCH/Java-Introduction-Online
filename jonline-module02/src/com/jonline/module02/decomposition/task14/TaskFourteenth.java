package com.jonline.module02.decomposition.task14;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 */
public class TaskFourteenth {
	public static void main(String[] args) {

		int k;

		k = inputNumberToConsole(" K>>");

		int[] arrayBeforeArmstrong = createArrayAllNumbers(k);
		System.out.println("Числа армстронга");
		for (int i = 0; i < arrayBeforeArmstrong.length; i++) {
			findAndPrintNumberArmstrong(arrayBeforeArmstrong[i]);

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

	public static int[] createArrayAllNumbers(int k) {
		int arrayStart = 1;

		int[] array = new int[k];
		for (int i = 0; i < array.length; i++) {

			array[i] = arrayStart++;
		}

		return array;
	}

	public static int[] splitNumberToArray(int numberFromArrayBeforeArmstrong) {
		char[] arrayDigitChar = ("" + numberFromArrayBeforeArmstrong).toCharArray();

		int[] digits = new int[arrayDigitChar.length];
		for (int i = 0; i < digits.length; i++) {
			digits[i] = arrayDigitChar[i] - '0';
		}

		return digits;

	}

	public static int searchNumber(int number, int length) {
		return (int) Math.pow(number, length);

	}

	public static void findAndPrintNumberArmstrong(int elementArray) {
		int numberArmstrong = 0;
		int checkedNumberArmstrong = 0;
		int[] digitsArray = splitNumberToArray(elementArray);
		for (int i = 0; i < digitsArray.length; i++) {
			numberArmstrong += searchNumber(digitsArray[i], digitsArray.length);
			if (numberArmstrong == elementArray) {
				checkedNumberArmstrong = elementArray;
				System.out.print(checkedNumberArmstrong + "/ ");
			} else {
				System.out.print("");
			}
		}
	}

}
