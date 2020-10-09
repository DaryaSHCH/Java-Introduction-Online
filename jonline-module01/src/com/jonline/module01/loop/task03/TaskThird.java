package com.jonline.module01.loop.task03;

import java.util.Scanner;

/*
 * find value sum of squares of the first hundred numbers;
 */
public class TaskThird {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		long sumSqr = 0;
		int x;

		System.out.println("Введите число: ");

		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}

		x = scan.nextInt();

		for (int i = 0; i < 100; i++) {
			sumSqr += Math.pow(x, 2);
			x++;

		}
		System.out.println("Сумма квадратов первых ста чисел: " + sumSqr);

	}
}
