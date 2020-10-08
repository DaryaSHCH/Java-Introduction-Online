package com.jonline.module02.onedimensional.task09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Given array of integers with length N. Find out the most common integers. If there are a few such integers in this array, 
 * then find out the smallest integer.
 */
public class TaskNinth {
	public static void main(String[] args) {

		int lengthN;

		Scanner scan = new Scanner(System.in);

		System.out.println("N>>");

		checkNumber(scan);
		lengthN = scan.nextInt();

		while (lengthN <= 0) {
			System.out.println("N>>");
			lengthN = scan.nextInt();
		}

		Random random = new Random();

		int[] array = new int[lengthN];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}

		System.out.println(Arrays.toString(array));

		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		int mostRepeated = array[0];
		int previousElem = array[0];
		int counterRepeat = 0;
		int mostCountRepeat = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] == previousElem) {
				counterRepeat++;
			} else {
				if (counterRepeat > mostCountRepeat) {
					mostRepeated = array[i - 1];
					mostCountRepeat = counterRepeat;
				} else {
					previousElem = array[i];
					counterRepeat = 1;
				}
			}
		}

		System.out.println(counterRepeat > mostCountRepeat ? array[array.length - 1] : mostRepeated);

	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String str = scan.nextLine();
			System.out.println("¬ведите число>>");
		}
	}

}
