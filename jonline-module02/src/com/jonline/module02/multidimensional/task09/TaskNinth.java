package com.jonline.module02.multidimensional.task09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Given matrix of positive numbers. Find out sum of numbers in every columns.
 *  Find out column with the most sum.
 */
public class TaskNinth {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int matrixSize;

		System.out.println("Input the value for matrix side>>");

		while (!scan.hasNextInt()) {
			String str = scan.nextLine();
			System.out.println("Input the integer>>");
		}

		matrixSize = scan.nextInt();

		while (matrixSize <= 0) {
			System.out.println("Input integer more then 0>>");
			matrixSize = scan.nextInt();
		}

		int[][] matrix = new int[matrixSize][matrixSize];

		Random random = new Random();

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

		System.out.println();

		int[] arraySum = new int[matrixSize];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				arraySum[i] += matrix[j][i];
			}

		}
		
		System.out.println("Sum of elements every column");
		
		System.out.print(Arrays.toString(arraySum) + "\n");
		
		int mostElement;
		mostElement = arraySum[0];
		
		int mostSumColumn;
		mostSumColumn = 0;

		for (int i = 0; i < arraySum.length; i++) {
			if (mostElement <= arraySum[i]) {
				mostElement = arraySum[i];
				mostSumColumn = i;
			}
		}

		if (mostSumColumn == 0 || mostSumColumn <= matrix.length - 1) {
			mostSumColumn++;
		}

		System.out.println("Column N" + mostSumColumn + " contain the most sum of elements");

	}
}
