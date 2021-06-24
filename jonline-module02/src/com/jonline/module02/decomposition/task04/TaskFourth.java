package com.jonline.module02.decomposition.task04;

import java.util.Arrays;
import java.util.Random;

/*
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */
public class TaskFourth {
	public static void main(String[] args) {

		int n;
		n = 5;

		Random rand = new Random();

		int[] arrayX = new int[n];

		for (int i = 0; i < arrayX.length; i++) {
			arrayX[i] = rand.nextInt(10) - 5;
		}
		int[] arrayY = new int[n];

		for (int i = 0; i < arrayY.length; i++) {
			arrayY[i] = rand.nextInt(7) + 2;
		}

		System.out.println("Coordinates");

		for (int i = 0; i < arrayX.length; i++) {
			System.out.println("XY(" + arrayX[i] + "," + arrayY[i] + ")");

		}
		System.out.println();

		double distance;
		double maxDistance = 0;
		int indexMaxDistanceXY1 = 0;
		int indexMaxDistanceXY2 = 0;

		for (int i = 0; i < arrayX.length; i++) {
			for (int j = 1; j < arrayX.length; j++) {
				distance = distance(arrayX[i], arrayY[i], arrayX[j], arrayY[j]);
				if (distance > maxDistance) {
					maxDistance = distance;
					indexMaxDistanceXY1 = i;
					indexMaxDistanceXY2 = j;

				}
			}
		}

		System.out.println(maxDistance);

		System.out.printf("The maximum distance = %.2f between coordinates XY(%d,%d) и XY(%d,%d).", maxDistance,
				arrayX[indexMaxDistanceXY1], arrayY[indexMaxDistanceXY1], arrayX[indexMaxDistanceXY2],
				arrayY[indexMaxDistanceXY2]);

	}

	public static double distance(int x1, int x2, int y1, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

}
