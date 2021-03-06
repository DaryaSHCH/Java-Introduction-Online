package com.jonline.module02.sorting.task05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Insertion Sort. Given a sequence of number a1, a2,...an;
 * need to move numbers in ascending. 
 * let it be an ordered sequence (a1 <= a2 <=...<=an).
 *  this number ai+1 is inserted into the sequence so that the new
 * the sequence was also increasing.
 * The process is carried out until all elements from i +1 to n
 * will not be iterated. 
 * 
 * Note:  Place the next element in the sorted part to perform
 * using binary search. Binary search should be presented as a separate function.
 */
public class TaskFifth {
	public static void main(String[] args) {

		int arraySize;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input array size >>");

		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Input the integer >>");
		}

		arraySize = scan.nextInt();

		while (arraySize <= 0) {
			System.out.println("Input the integer more then 0>>");
			arraySize = scan.nextInt();
		}

		Random rand = new Random();

		int[] array = new int[arraySize];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}

		System.out.println("Initial array \n" + Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {

			int sougthNumb = array[i];
			int sougthIndex = binarySearch(array, sougthNumb, i);
			for (int j = i; j > sougthIndex; j--) {

				array[j] = array[j - 1];
			}

			array[sougthIndex] = sougthNumb;
		}

		System.out.println("result \n" + Arrays.toString(array));

	}
	
	

	static int binarySearch(int[] array, int soughtNumb, int upperBound) {
		int low = 0;
		int high = upperBound - 1;
		int mid;
		while (low <= high) {

			mid = (low + high) / 2;

			if (soughtNumb > array[mid]) {
				low = mid + 1;
			} else if (soughtNumb < array[mid]) {
				high = mid - 1;
			} else if (soughtNumb == array[mid]) {
				return mid;
			}

		}
		return low;
	}

}
