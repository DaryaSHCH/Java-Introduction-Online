package com.jonline.module01.lineal.task02;
/* 
 * find value of formula  b + sqrt(b degree 2 + 4ac/ 2a -  a degree3 *c + b degree-2;
 */

import java.util.Scanner;

public class TaskSecond {
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

		double value1;
		value1 = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a);
		double value2;
		value2 = Math.pow(a, 3) * c;
		
		double value3;
		value3 = Math.pow(b, -2);

		double result;
		result = value1 - value2 + value3;
		
		System.out.println("Результат вычислений равен: " + result);

	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}
}
