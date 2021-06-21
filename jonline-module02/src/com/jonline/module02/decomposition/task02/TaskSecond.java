package com.jonline.module02.decomposition.task02;

import java.util.Scanner;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class TaskSecond {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int a;
		int b;
		int c;
		int d;

		System.out.println("Input int A >>");

		checkInteger(reader);

		a = reader.nextInt();

		checkIntegerMoreThenZero(reader, a);

		System.out.println("Input int B >>");

		checkInteger(reader);

		b = reader.nextInt();

		checkIntegerMoreThenZero(reader, b);

		System.out.println("Input int C >>");

		checkInteger(reader);

		c = reader.nextInt();

		checkIntegerMoreThenZero(reader, c);

		System.out.println("Input int D >>");

		checkInteger(reader);

		d = reader.nextInt();

		checkIntegerMoreThenZero(reader, d);

		int grComFactorAB = countTheGreatestCommonFactor(a, b);

		int grComFactorCD = countTheGreatestCommonFactor(c, d);

		int greatestCommonFactor = countTheGreatestCommonFactor(grComFactorAB, grComFactorCD);

		System.out.println("The greatest common factor of 4 integers = " + greatestCommonFactor);

	}

	private static void checkIntegerMoreThenZero(Scanner reader, int number) {
		while (number <= 0) {
			System.out.println("Input integer more then 0 >>");
			checkInteger(reader);
			number = reader.nextInt();
		}
	}

	private static void checkInteger(Scanner reader) {
		while (!reader.hasNextInt()) {
			String line = reader.nextLine();
			System.out.println("Input integer>> ");
		}
	}

	public static int countTheGreatestCommonFactor(int a, int b) {
		int factorAB = 0;
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
			factorAB = a + b;
		}

		return factorAB;
	}

}
