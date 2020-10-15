package com.jonline.module02.multidimensional.task14;

import java.util.Scanner;

/*
 *  Generate a random m x n matrix of 0 and 1 with a number in each column
* quantity of 1 is equal to the column number.
 */
public class TaskFourteenth {
	public static void main(String[] args) {

		int row;
		int column;

		Scanner scan = new Scanner(System.in);

		System.out.println("M>>");

		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Input the integer>>");
		}

		row = scan.nextInt();

		while (row <= 0) {
			System.out.println("Input the integer more then 0>>");
			row = scan.nextInt();
		}

		System.out.println("N>>");

		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Input the integer>>");
		}

		column = scan.nextInt();

		while (column <= 0) {
			System.out.println("Input the integer more then 0>>");
			column = scan.nextInt();
		}

		int[][] matrix = new int[row][column];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i < j || i == j) {
					matrix[i][j] = 1;
				}
			}
		}

		System.out.println("Matrix");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

	}
}
