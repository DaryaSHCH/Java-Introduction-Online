package com.jonline.module02.sorting.task04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 *  Bubble sort. Given a sequence of numbers a1 <= a2 <= ... an;
 *  Need to move numbers in ascending. 
 *  For this need to compare two adjacent numbers ai and ai+1; 
 *  If ai > ai+1 then relocate numbers. Do it before all elements will be 
 *  ascending. Count the number of permutations.
 *  
 *  
 */
public class TaskFourth {
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

		System.out.println("Initial array \n" + Arrays.toString(array));

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int element = array[j];
					array[j] = array[j + 1];
					array[j + 1] = element;
				}
			}
		}

		System.out.println("\n Sorted array \n" + Arrays.toString(array));

	}

}
