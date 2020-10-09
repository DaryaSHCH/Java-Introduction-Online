package com.jonline.module02.onedimensional.task03;

import java.util.Random;
import java.util.Scanner;

/*
 * Given array of real numbers with size N. Count quantity of negative, positive and null elements;
 */
public class TaskThird {
	public static void main(String[] args) {
		int lenghtN;
		int counterZero = 0;
		int counterNegative = 0;
		int counterPositive = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("N >> ");
		checkNumber(scan);
		lenghtN = scan.nextInt();
		while (lenghtN <= 0) {
			System.out.println("N >> ");
			checkNumber(scan);
			lenghtN = scan.nextInt();
		}
		int[] arrayN = new int[lenghtN];
        
		for (int i = 0; i < lenghtN; i++) {
			arrayN[i] = (int) (Math.random());
		}
		for (double element : arrayN) {
			if (element > counterZero) {
				element = counterPositive;
				counterPositive++;

			} else if (element == counterZero) {
				element = counterZero;
				counterZero++;
			}

			else if (element < counterZero) {
				element = counterNegative;
				counterNegative++;
			}
		}
		System.out.println("Количество отрицательных элементов = " + counterNegative);
		System.out.println("Количество нулевых элементов = " + counterZero);
		System.out.println("Количество положительных элементов = " + counterPositive);
	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}

}
