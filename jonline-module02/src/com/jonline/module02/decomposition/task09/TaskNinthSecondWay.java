package com.jonline.module02.decomposition.task09;

import java.util.Scanner;

/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class TaskNinthSecondWay {
	public static void main(String[] args) {

		int x;
		int y; // x,y - стороны образующие угол 90 градусов;

		int[] coordinateXY = new int[] { 0, 0 }; // по умолчанию вершина располагается на точках 0,0.

		System.out.println("Input the length of the sides forming a right angle >> ");

		x = inputNumberToConsole("Input length for side X>>");
		y = inputNumberToConsole("Input length for side Y>>");

		int[] coordinateYZ = new int[] { 0, y };
		int[] coordinateTХ = new int[] { 0, x };

		int coordinateZTx;
		int coordinateZTy;

		System.out.println("coordinates for point ZT >> ");

		coordinateZTx = inputNumberToConsole("Input coordinate for X-axis>>");
		coordinateZTy = inputNumberToConsole("Input coordinate for Y-axis>>");

		int[] coordinateZT = new int[] { coordinateZTx, coordinateZTy };

		double z;
		double t;

		z = findLengthWithCoordinate(coordinateYZ[0], coordinateYZ[1], coordinateZTx, coordinateZTy);
		t = findLengthWithCoordinate(coordinateZTx, coordinateZTy, coordinateTХ[0], coordinateTХ[1]);

		double lengthYZTX;

		lengthYZTX = findLengthWithCoordinate(coordinateYZ[0], coordinateYZ[1], coordinateTХ[0], coordinateTХ[1]);

		double areaСonvexQuadrangle;

		double lengthXYZT;

		lengthXYZT = findLengthWithCoordinate(coordinateXY[0], coordinateXY[1], coordinateZT[0], coordinateZT[1]);

		double areaСoncaveQuadrangle;

		boolean typeQuadrangl;
		typeQuadrangl = findTypeQuadrangl(coordinateZT[0], coordinateTХ[0], coordinateZT[1], coordinateTХ[1],
				coordinateYZ[0], coordinateYZ[1]);

		if (typeQuadrangl = true) {

			System.out.println("This Quadrangle is Сoncave");

			areaСoncaveQuadrangle = findAreaTriangle(x, t, lengthXYZT) + findAreaTriangle(y, z, lengthXYZT);
			System.out.println("Area This Quadrangle is " + areaСoncaveQuadrangle);
		} else {
			System.out.println("This Quadrangle is Сonvex");
			areaСonvexQuadrangle = findAreaTriangle(x, y, lengthYZTX) + findAreaTriangle(z, t, lengthYZTX);
			System.out.println("Area This Quadrangle is " + areaСonvexQuadrangle);
		}

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

	public static double findLengthWithCoordinate(int x1, int y1, int x2, int y2) {

		double length;
		int differenceX = x2 - x1;
		int differenceY = y2 - y1;

		length = Math.sqrt((Math.pow(differenceX, 2) + Math.pow(differenceY, 2)));
		return length;
	}

	public static double findAreaTriangle(double sideA, double sideB, double sideC) {

		double semiPerimeter;
		double s;

		semiPerimeter = (sideA + sideB + sideC) / 2;
		s = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

		return s;
	}

	public static boolean findTypeQuadrangl(int coordinateX1, int coordinateX2, int coordinateY1, int coordinateY2, int coordinateX3, int coordinateY3) {
		boolean СoncaveQuadrangl = ( ((coordinateX1 != coordinateX2)  && (coordinateY1 != coordinateY2) ||
				
				((coordinateX1 != coordinateX3) && (coordinateY1!= coordinateY3)) );
		return СoncaveQuadrangl;  
	}

}
