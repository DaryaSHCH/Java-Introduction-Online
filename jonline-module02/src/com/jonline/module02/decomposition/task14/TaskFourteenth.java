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
		int power;

		k = inputNumberToConsole(" K>>");
		power = inputNumberToConsole(" power >>");

		int[] arrayBeforeArmstrong = createArrayAllNumbers(k);

		System.out.println(Arrays.toString(arrayBeforeArmstrong));

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

	public static int[] splitNumberToArray(int number) {
		int arraySize;
		arraySize = number /= 10;
		int[] arrayDigits = new int[arraySize];
		for (int i = 0; i < arrayDigits.length; i++) {
			while (number > 0) {
				arrayDigits[i] = number % 10;
				number /= 10;
			}
		}
		return arrayDigits;

	}
	
	public static int searchNumber(int x, int length) {
        return (int) Math.pow(x, length);

    }

}
