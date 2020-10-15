package com.jonline.module02.multidimensional.task15;

import java.util.Random;

/*
 *  ... Find the largest element of the matrix and replace all odd elements with it
 */
public class TaskFifteenth {
	public static void main(String[] args) {

		int row;
		row = 6;
		int column;
		column = 6;

		Random random = new Random();

		int[][] matrix = new int[row][column];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(10);
			}
		}

		System.out.println("Original Matrix");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

		int largestElement = matrix[0][0];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > largestElement) {
					largestElement = matrix[i][j];
				}
			}
		}

		System.out.println("\n the largest Element >>" + largestElement);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] % 2 != 0) {
					matrix[i][j] = largestElement;
				}
			}
		}

		System.out.println("Changed Matrix");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

}
