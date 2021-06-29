package com.jonline.module02.decomposition.task09;

import java.util.Scanner;

/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class TaskNinth {
	public static void main(String[] args) {

		int x;
		int y; // x, y - стороны образующие угол 90 градусов;
		int z;
		int t;

		System.out.println("Input length for X,Y,Z,T");
		x = inputNumberToConsole("Input X>>");
		y = inputNumberToConsole("Input Y>>");
		z = inputNumberToConsole("Input Z>>");
		t = inputNumberToConsole("Input T>>");

		double hypotenuse;
		double areaQuadrangle;

		hypotenuse = countHypotenuse(x, y);
		areaQuadrangle = findAreaTriangle(x, y, hypotenuse) + findAreaTriangle(z, t, hypotenuse);

		System.out.println("Area of quadrangle = " + areaQuadrangle);

	}

	public static int inputNumberToConsole(String message) {
		Scanner reader;
		int number;

		reader = new Scanner(System.in);

		do {
			System.out.println("Input " + message);

			while (!reader.hasNextInt()) {
				System.out.println("Input integer>>");
				reader.next();
			}
			number = reader.nextInt();
		} while (number <= 0);

		return number;
	}

	public static double countHypotenuse(double cathetusA, double cathetusB) {
		return Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
	}

	public static double findAreaTriangle(double cathetusA, double cathetusB, double hypotenuseAB) { // по формуле
																										// Герона
		double semiPerimeter;
		double s;

		semiPerimeter = (cathetusA + cathetusB + hypotenuseAB) / 2;
		s = Math.sqrt(semiPerimeter * (semiPerimeter - cathetusA) * (semiPerimeter - cathetusB)
				* (semiPerimeter - hypotenuseAB));

		return s;
	}

}
