package com.jonline.module02.onedimensional.task02;

import java.util.Scanner;

/*
 * Given sequence of real numbers. Change the all members which more Z, at this number. Count the number of substitutions;
 */
public class TaskSecond {
	public static void main(String[] args) {
		int z;
		int lenghtD;
		int counter = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Длина массива >> ");
		checkNumber(scan);
		lenghtD = scan.nextInt();
		while (lenghtD <= 0) {
			System.out.println("Длина массива >> ");
			checkNumber(scan);
			lenghtD = scan.nextInt();
		}

		double[] arrayD = new double[lenghtD];

		for (int i = 0; i < lenghtD; i++) {
			arrayD[i] = 1 + i;
		}

		System.out.println("Z >> ");
		checkNumber(scan);
		z = scan.nextInt();
		for (double element : arrayD) {
			if (element > z) {
				element = z;
				counter++;

			}
		}
		System.out.println("Количество замен = " + counter);

	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	
	}
}
