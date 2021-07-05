package com.jonline.module02.decomposition.task13;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию.
 */
public class TaskThirteenth {
	public static void main(String[] args) {
		int start;
		int end;

		start = inputNumberToConsole(" integer segment start >> ");
		end = inputNumberToConsole(" integer segment end >> ");

		if (start <= 2) {
			start = inputNumberToConsole(" integer more then 2 for segment start >> ");
		}

		if (end < start) {
			System.out.println(" integer end must be more then start");
			end = inputNumberToConsole(" integer segment end >> ");
		}

		int[] segmentArray = getSegmentArray(start, end);

		System.out.printf(Arrays.toString(segmentArray));

		System.out.println("\n Number-twins >>");
		findAndPrintNumberTwins(0, segmentArray);
		System.out.println("\n Number-twins next pairs>>");
		findAndPrintNumberTwins(1, segmentArray);
	}

	@SuppressWarnings("resource")
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

	public static void findAndPrintNumberTwins(int index, int[] array) {
		for (int i = index; i < array.length; i += 2) {
			System.out.print(array[i] + " ");
		}
	}

	public static int[] getSegmentArray(int startArray, int endArray) {
		int segmentLength = (endArray - startArray) + 1;

		int[] array = new int[segmentLength];

		for (int i = 0; i < array.length; i++) {
			array[i] = startArray++;
		}
		return array;
	}

}
