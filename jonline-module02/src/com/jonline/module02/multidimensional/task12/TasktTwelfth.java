package com.jonline.module02.multidimensional.task12;

import java.util.Random;

/*
 * Sort matrix rows in ascending and descending order of element values.
 */
public class TasktTwelfth {
	public static void main(String[] args) {

		int row;
		row = 6;
		int column;
		column = 8;

		Random random = new Random();

		int[][] matrix = new int[row][column];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				matrix[i][j] = random.nextInt(10) - 3;
			}
		}
		System.out.println("Original matrix");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

		int buff = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int count = j + 1; count < matrix[i].length; count++) {
					if (matrix[i][j] > matrix[i][count]) {
						buff = matrix[i][j];
						matrix[i][j] = matrix[i][count];
						matrix[i][count] = buff;
					}
				}
			}
		}
		
		System.out.println(" Sorted matrix rows in ascending");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

		int buffSecond = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int count = j + 1; count < matrix[i].length; count++) {
					if (matrix[i][j] < matrix[i][count]) {
						buffSecond = matrix[i][j];
						matrix[i][j] = matrix[i][count];
						matrix[i][count] = buffSecond;
					}
				}
			}
		}

		System.out.println(" Sorted matrix rows in descending");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

	}

}
