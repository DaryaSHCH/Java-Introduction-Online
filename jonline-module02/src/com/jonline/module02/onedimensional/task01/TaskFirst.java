package com.jonline.module02.onedimensional.task01;

import java.util.Scanner;

/*
 *  Array A[N] with integers, find sum those numbers, that divide to K;
 */
public class TaskFirst {
	public static void main(String[] args) {
		int k;
		int lenghtN;
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("N >> ");
		checkNumber(scan);
		lenghtN = scan.nextInt();
		while (lenghtN <= 0) {
			System.out.println("N >> ");
			checkNumber(scan);
			lenghtN = scan.nextInt();
		}

		int[] arrayA = new int[lenghtN];
		for (int i = 0; i < lenghtN; i++) {
			arrayA[i] = 1 + i;

		}

		System.out.println("K >> ");
		checkNumber(scan);
		k = scan.nextInt();
		while (k == 0) {
			System.out.println("K >> ");
			checkNumber(scan);
			k = scan.nextInt();
		}

		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % k == 0) {
				sum += arrayA[i];
			}
		}
		System.out.println("Сумма элементов массива кратных " + k + " равна  " + sum);
	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}

}
