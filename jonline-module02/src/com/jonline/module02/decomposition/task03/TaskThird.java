package com.jonline.module02.decomposition.task03;

import java.util.Scanner;

/*
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.
 */
public class TaskThird {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int sideHexagon;

		System.out.println("Input A>>");

		checkInteger(reader);

		sideHexagon = reader.nextInt();

		checkIntegerMoreThenZero(reader, sideHexagon);

		double areaHexagon;
		areaHexagon = countAreaTriangle(sideHexagon) * 6;

		System.out.println("Area of hexagone = " + areaHexagon);

	}

	private static void checkInteger(Scanner reader) {
		while (!reader.hasNextInt()) {
			String line = reader.nextLine();
			System.out.println("Input integer>> ");
		}
	}

	private static void checkIntegerMoreThenZero(Scanner reader, int number) {
		while (number <= 0) {
			System.out.println("Input integer more then 0 >>");
			checkInteger(reader);
			number = reader.nextInt();
		}
	}

	public static double countAreaTriangle(int sideTriangle) {
		return Math.pow(sideTriangle, 2) * Math.sqrt(3) / 4;
	}
}
