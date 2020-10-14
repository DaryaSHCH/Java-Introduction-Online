package com.jonline.module02.multidimensional.task13;

import java.util.Random;

/*
 *  Sort matrix columns in ascending and descending order elements; 
 */
public class TaskThirteenth {
	public static void main(String[] args) {

		int matrixRow;
		matrixRow = 9;
		int matrixColumn;
		matrixColumn = 5;

		Random random = new Random();

		int[][] matrix = new int[matrixRow][matrixColumn];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(10);
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
				for (int count = i + 1; count < matrix.length; count++) {
					if (matrix[i][j] > matrix[count][j]) {
						buff = matrix[i][j];
						matrix[i][j] = matrix[count][j];
						matrix[count][j] = buff;
					}
				}
			}
		}

		System.out.println(" Sorted matrix columns in ascending");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

		int buffSecond = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				for (int count = i + 1; count < matrix.length; count++) {
					if (matrix[i][j] < matrix[count][j]) {
						buffSecond = matrix[i][j];
						matrix[i][j] = matrix[count][j];
						matrix[count][j] = buffSecond;
					}
				}
			}
		}

		System.out.println(" Sorted matrix columns in descending");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

	}

}
