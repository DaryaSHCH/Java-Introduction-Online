package com.jonline.module01.lineal.task01;

import java.util.Scanner;

/*
 *  find value of function  z = ((a - 3) * b / 2) + c;
 */
public class TaskFirst {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		double c;

		System.out.println("Введите значение для а: ");

		checkNumber(scan);

		a = scan.nextDouble();

		System.out.println("Введите значение для b: ");

		checkNumber(scan);

		b = scan.nextDouble();

		System.out.println("Введите значение для c: ");

		checkNumber(scan);
		
		c = scan.nextDouble();

		double z;
		z = ((a - 3) * b / 2) + c;

		System.out.println("z = " + z);
	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextDouble()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}
}

