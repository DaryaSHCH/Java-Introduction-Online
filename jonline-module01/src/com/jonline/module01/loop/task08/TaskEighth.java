package com.jonline.module01.loop.task08;

import java.util.Scanner;

/*
 * Даны 2 числа. Определить цифры входящие как в первое, так и во второе число;
 */
public class TaskEighth {
	public static void main(String[] args) {

		int firstNumber;
		int secondNumber;
		String firstString;
		String secondString;
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите число: ");

		checkLine(scan);

		firstNumber = scan.nextInt();

		System.out.println("Введите число: ");

		checkLine(scan);

		secondNumber = scan.nextInt();

		firstString = Integer.toString(firstNumber);
		secondString = Integer.toString(secondNumber);

			for (int i = 0; i < firstString.length(); i++) {
				Character firstChar = firstString.charAt(i);
				for (int j = 0; j < secondString.length(); j++) {
					if (firstChar == secondString.charAt(j)) {
						System.out.println(firstChar + " содержится и в первом и во втором числе ");
					}
				}
			}
	}


	public static void checkLine(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}

}
