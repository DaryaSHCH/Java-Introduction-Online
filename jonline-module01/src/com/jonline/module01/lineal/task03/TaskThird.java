package com.jonline.module01.lineal.task03;
/*
 * figure out this formula: sin x + cos y/ cos x - sin y * tgxy;
 */

import java.util.Scanner;

public class TaskThird {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int x;
		int y;

		System.out.println("Введите значение для x: ");

		checkNumber(scan);
		
		x = scan.nextInt();

		System.out.println("Введите значение для y: ");
		
		checkNumber(scan);
		
		y = scan.nextInt();

		double value1;
		value1 = Math.sin(x) + Math.cos(y);
		double value2;
		value2 = Math.cos(x) - Math.sin(y);
		double value3;
		value3 = Math.tan(x * y);
		double result;
		result = (value1 / value2) * value3;

		System.out.println("Результат вычислений равен: " + result);
	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}

}
