package com.jonline.module02.multidimensional.task10;

import java.util.Random;

/*
 * find out positive elements of main matrix diagonal; 
 */
public class TaskTenth {
	public static void main(String[] args) {

		int matrixSize;
		matrixSize = 6;

		int[][] matrix = new int[matrixSize][matrixSize];

		Random random = new Random();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(10) - 5;
			}
		}
		System.out.println("Original matrix");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

		System.out.println("Positive elements of main matrix diagonal >>");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j && matrix[i][j] > 0) {

					System.out.print(matrix[i][j] + "\t");

				}
			}
		}

	}

}
