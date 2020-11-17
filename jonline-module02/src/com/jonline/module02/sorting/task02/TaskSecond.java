package com.jonline.module02.sorting.task02;

import java.util.Arrays;
import java.util.Scanner;

/*
 * given a sequence of numbers:  
* a1 <= a2 <= .... <= an и b1 <= b2 <= ... <= bm
* Form from these sequences  new sequence of numbers. New sequence must be non-decreasing. 
* Don't use additional array. 
 */
public class TaskSecond {
	public static void main(String[] args) {

		int firstArraySize;
		int secondArraySize;

		Scanner scan = new Scanner(System.in);

		System.out.println("input size for first array>>");

		checkNumber(scan);

		firstArraySize = scan.nextInt();

		while (firstArraySize <= 0) {
			System.out.println("input integer more then 0 >>");
			checkNumber(scan);
			firstArraySize = scan.nextInt();
		}

		System.out.println("input size for second array>>");

		checkNumber(scan);

		secondArraySize = scan.nextInt();

		while (secondArraySize <= 0) {
			System.out.println("input integer more then 0 >>");
			checkNumber(scan);
			secondArraySize = scan.nextInt();
		}

		int[] firstArray = new int[firstArraySize + secondArraySize];

		for (int i = 0; i < firstArraySize; i++) {
			firstArray[i] = i;
		}

		int[] secondArray = new int[secondArraySize];

		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i] = i;
		}

		System.out.println("First Array>>");

		for (int i = 0; i < firstArraySize; i++) {
			System.out.print(firstArray[i] + " ");
		}

		System.out.println("\n Second Array>> \n" + Arrays.toString(secondArray));

		System.arraycopy(secondArray, 0, firstArray, firstArraySize, secondArray.length);

		System.out.println("\n First Array>> \n" + Arrays.toString(firstArray));

		sortArray(firstArray);

		System.out.println("\n First Array>> \n" + Arrays.toString(firstArray));

	}

	static void sortArray(int[] firstArray) {
		
		boolean importantLoopIteration = true;

		while (importantLoopIteration) {
			importantLoopIteration = false;

			for (int i = 0; i < firstArray.length - 1; i++) {
				if (firstArray[i] > firstArray[i + 1]) {
					toSwap(firstArray, i, i + 1);
					importantLoopIteration = true;
				}

			}
		}
	}

	static void toSwap(int[] firstArray, int index1, int index2) {
		int element = firstArray[index1];
		firstArray[index1] = firstArray[index2];
		firstArray[index2] = element;
	}

	private static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Input integer>>");
		}
	}
}



