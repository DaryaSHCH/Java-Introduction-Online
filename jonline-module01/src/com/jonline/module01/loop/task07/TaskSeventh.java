package com.jonline.module01.loop.task07;

import java.util.Scanner;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа;
 */
public class TaskSeventh {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите число с которого начинается числовой ряд: ");

		checkLine(scan);

		firstNumber = scan.nextInt();

		if (firstNumber <= 0) {
			System.out.println("Введите положительное число: ");
			firstNumber = scan.nextInt();
		}

		System.out.println("Введите число которым заканчивается числовой ряд: ");

		checkLine(scan);

		secondNumber = scan.nextInt();

		if (secondNumber <= firstNumber) {
			System.out.println("Данное число должно иметь большее значение. Введите число повторно: ");
			secondNumber = scan.nextInt();
		}

		while (firstNumber <= secondNumber) {

			for (int i = 2; i < firstNumber; i++) {
				if (firstNumber % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
		firstNumber++;
	}

	public static void checkLine(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}

}




		   
