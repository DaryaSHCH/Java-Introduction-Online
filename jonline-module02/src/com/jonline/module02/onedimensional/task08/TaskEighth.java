package com.jonline.module02.onedimensional.task08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 
 * Given sequence of integers a1, a2, .... aN. Form new sequence, exclude from original these members, that are equal min (a1,a2... an). 
 */
public class TaskEighth {
	public static void main(String[] args) {

		int lengthN;

		Scanner sc = new Scanner(System.in);

		System.out.println("N>>");

		checkLine(sc);

		lengthN = sc.nextInt();

		while (lengthN <= 0) {
			System.out.println("N>>");
			lengthN = sc.nextInt();

		}

		Random random = new Random();

		Integer[] array = new Integer[lengthN];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(10);
		}

		System.out.println(Arrays.toString(array));

		Integer minValue = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] <= minValue) {
				minValue = array[i];
			}
		}

		Integer counterNull = 0;

		for (int i = 0; i < array.length; i++) {
			if (minValue == array[i]) {
				array[i] = null;
				counterNull++;
			}

		}

		Integer[] newArray = new Integer[array.length - counterNull];
		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] != null) {
				newArray[j] = array[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(newArray));

	}

	public static void checkLine(Scanner sc) {
		while (!sc.hasNextInt()) {
			String s = sc.nextLine();
			System.out.println("¬ведите число>>");
		}
	}

}
