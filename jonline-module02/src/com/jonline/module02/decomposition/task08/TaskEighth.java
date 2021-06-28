package com.jonline.module02.decomposition.task08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */
public class TaskEighth {
	public static void main(String[] args) {

		int lengthArray;

		lengthArray = inputNumberToConsole(" array length >>");

		int[] arrayD = createArray(lengthArray);
		System.out.println("Array >>");
		System.out.println(Arrays.toString(arrayD));
		int k;

		k = inputNumberToConsole(
				" the index of the element from which to start counting the sum of the next 3 array elements>>");

		System.out.println(prepareMessageResult(k, arrayD));

		k += 3;
		System.out.println(prepareMessageResult(k, arrayD));

		k += 3;
		System.out.println(prepareMessageResult(k, arrayD));

	}

	public static int inputNumberToConsole(String message) {
		Scanner reader;
		int number;

		reader = new Scanner(System.in);

		do {
			System.out.println("Input " + message);

			while (!reader.hasNextInt()) {
				System.out.println("Input integer more then 0 >>");
				reader.next();
			}
			number = reader.nextInt();
		} while (number <= 0);

		return number;
	}

	public static int[] createArray(int lengthArr) {
		Random rand = new Random();
		int[] array = new int[lengthArr];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
		return array;
	}

	public static int sumThreeElements(int[] arrays, int index) {
		int sum = 0;

		for (int i = 0; i < 3; i++) {
			sum += arrays[index + i];
		}
		return sum;
	}

	public static String prepareMessageResult(int index, int[] array) {
		String lineResult = "Sum of " + array[index] + " + " + array[index + 1] + " + " + array[index + 2] + " = "
				+ sumThreeElements(array, index);
		return lineResult;

	}

}
