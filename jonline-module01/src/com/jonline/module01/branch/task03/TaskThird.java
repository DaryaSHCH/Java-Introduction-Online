package com.jonline.module01.branch.task03;
/*
 * Given three points A(x1,y1); B(x2,y2); C(x3,y3); 
 * Find out are these points located on one straight line
 */

import java.util.Scanner;

public class TaskThird {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;

		System.out.println("Введите координаты для точки A: ");
		System.out.println("x1 =  ");
		checkNumber(scan);
		x1 = scan.nextInt();
		System.out.println("y1 =  ");
		checkNumber(scan);
		y1 = scan.nextInt();

		System.out.println("Введите координаты для точки B: ");
		System.out.println("x2 =  ");
		checkNumber(scan);
		x2 = scan.nextInt();
		System.out.println("y2 =  ");
		checkNumber(scan);
		y2 = scan.nextInt();

		System.out.println("Введите координаты для точки C: ");
		System.out.println("x3 =  ");
		checkNumber(scan);
		x3 = scan.nextInt();
		System.out.println("y3 =  ");
		checkNumber(scan);
		y3 = scan.nextInt();

		int subtractionX1 = x1 - x2;
		int subtractionY2 = y3 - y2;
		int subtractionY1 = y1 - y2;
		int subtractionX2 = x3 - x2;
		int multiplication1 = subtractionX1 * subtractionY2;
		int multiplication2 = subtractionX2 * subtractionY1;
		if (multiplication1 == multiplication2) {
			System.out.println("Заданные точки находятся на одной прямой");
		} else
			System.out.println("Заданные точки не находятся на одной прямой");
	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}
}
