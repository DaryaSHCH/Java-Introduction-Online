package com.jonline.module02.sorting.task03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 *  Selection sort. Given a sequence of numbers a1 <= a2 <= ... an.
 *  Need to move elements descending. The biggest element moves to first place, and first element moves to that place.
 *  Next time this action repeats from second element. 
 */
public class TaskThird {
	public static void main(String[] args) {

		int arraySize;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input array length>>");

		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Input Integer>>");
		}

		arraySize = scan.nextInt();

		while (arraySize <= 0) {
			System.out.println("Input integer more then 0 >>");
			arraySize = scan.nextInt();
		}

		Random rand = new Random();

		int[] array = new int[arraySize];
		for (int i = 0; i < array.length; i++) {

			array[i] = rand.nextInt(100);
		}

		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {

			int position = i;

			int minValue = array[i];

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < minValue) {
					position = j;
					minValue = array[j];
				}
			}

			array[position] = array[i];
			array[i] = minValue;

		}

		System.out.println("\n result \n" + Arrays.toString(array));

	}

}
