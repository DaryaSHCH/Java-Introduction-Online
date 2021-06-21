package com.jonline.module02.decomposition.task01;

import java.util.Scanner;

/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел: НОК(А,В) = А * В/НОД(А,В);
 */
public class TaskFirst {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int a;
		int b;

		System.out.println("Input int A >>");

		checkInteger(reader);

		a = reader.nextInt();

		while (a <= 0) {
			System.out.println("Input integer more then 0 >>");
			checkInteger(reader);
			a = reader.nextInt();
		}

		System.out.println("Input int B >>");

		checkInteger(reader);

		b = reader.nextInt();

		while (b <= 0) {
			System.out.println("Input integer more then 0 >>");
			checkInteger(reader);
			b = reader.nextInt();
		}

		int greatestCommonFactor;
		greatestCommonFactor = countGreatestCommonFactor(a, b);
		int leastCommonMultiple;
		leastCommonMultiple = countLeastCommonMultiple(a, b, greatestCommonFactor);
		System.out.println("Greatest common Factor = " + greatestCommonFactor + "\n Least common multiple = "
				+ leastCommonMultiple);
	}

	private static void checkInteger(Scanner reader) {
		while (!reader.hasNextInt()) {
			String line = reader.nextLine();
			System.out.println("Input integer>> ");
		}
	}

	public static int countGreatestCommonFactor(int a, int b) {
		int d = 0;
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
			d = a + b;
		}

		return d;
	}

	public static int countLeastCommonMultiple(int a, int b, int greatestComFactor) {
		return (a * b) / greatestComFactor;
	}
}
