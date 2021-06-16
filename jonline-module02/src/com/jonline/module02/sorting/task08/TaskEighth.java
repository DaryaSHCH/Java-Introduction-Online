package com.jonline.module02.sorting.task08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Даны дроби p1/q1, p2/q2 ... pn/qn (p,q - натуральные). Составить программу, 
 * которая приводит эти дроби к общему 
 * знаменателю и упорядочивает их в порядке возрастания.
 */
public class TaskEighth {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Will you use array with random values?");

		boolean makeRandom = false;
		String answer = null;

		do {
			if ("Y".equals(answer)) {
				makeRandom = true;
			} else if ("N".equals(answer)) {
				makeRandom = false;
			} else {
				System.out.println("Input Y/N");
				answer = scan.nextLine();
				continue;
			}

			break;
		} while (true);

		int[] arrayRandomNumenator;
		int[] arrayRandomDenominator;

		if (makeRandom) {
			int randomArraySize;

			System.out.println(" input array length >>");

			checkNumber(scan);
			randomArraySize = scan.nextInt();
			while (randomArraySize <= 0) {
				System.out.println("input integer more then 0 >> ");
				checkNumber(scan);
				randomArraySize = scan.nextInt();
			}

			arrayRandomNumenator = createRandomArray(randomArraySize);
			arrayRandomDenominator = createRandomArray(randomArraySize);
			findGlobalDenominatorAndSort(arrayRandomNumenator, arrayRandomDenominator);
		} else {
			arrayRandomNumenator = new int[] { 1, 2, 3, 4, 5, 6, 8 };
			arrayRandomDenominator = new int[] { 5, 10, 6, 9, 15, 18, 20 };
			findGlobalDenominatorAndSort(arrayRandomNumenator, arrayRandomDenominator);
		}

		System.out
				.println(" Sorted and regulated numenator array >> \t" + Arrays.toString(arrayRandomNumenator) + "\n");
		System.out.println(
				" Sorted and regulated denominator array >> \t" + Arrays.toString(arrayRandomDenominator) + "\n");
	}

	private static void findGlobalDenominatorAndSort(int[] numenators, int[] denominators) {

		double[] arrayResult = new double[numenators.length];

		for (int i = 0; i < arrayResult.length; i++) {
			arrayResult[i] = (double) numenators[i] / (double) denominators[i];
		}

		for (int i = 0; i < arrayResult.length; i++) {

			int position = i;

			double minValue = arrayResult[i];

			for (int j = i + 1; j < arrayResult.length; j++) {
				if (arrayResult[j] < minValue) {
					position = j;
					minValue = arrayResult[j];
				}
			}

			arrayResult[position] = arrayResult[i];
			arrayResult[i] = minValue;

			int buf = numenators[i];
			numenators[i] = numenators[position];
			numenators[position] = buf;

			buf = denominators[i];
			denominators[i] = denominators[position];
			denominators[position] = buf;
		}

		for (int i = 0; i < arrayResult.length; i++) {
			for (int j = i + 1; j < arrayResult.length - 1; j++) {
				if (arrayResult[i] == arrayResult[j]) {
					int position = i;
					numenators[position] = numenators[j];
					denominators[position] = denominators[j];
				}
			}
		}

	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Input integer>> ");
		}
	}

	private static int[] createRandomArray(int randomArraySize) {
		Random rand = new Random();
		int[] randomArray = new int[randomArraySize];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = rand.nextInt(9) + 1;
		}
		return randomArray;

	}
}


