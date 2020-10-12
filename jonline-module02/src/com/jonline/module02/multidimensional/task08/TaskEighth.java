package com.jonline.module02.multidimensional.task08;

import java.util.Scanner;

/*
 * swap columns at matrix, it means that elements of columns will be swapped. 
 * user enters numbers of columns from the keyboard;
 */
public class TaskEighth {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int matrixLines;
		System.out.println("Lines>>");

		checkNumber(scan);
		matrixLines= scan.nextInt();

		while (matrixLines <= 0 ) {
			System.out.println("Input integer more then 0 >> ");
			matrixLines= scan.nextInt();
		}
		
		int matrixColumns;
		System.out.println("Columns>>");
		checkNumber(scan);
		matrixColumns = scan.nextInt();
		while (matrixColumns <= 0) {
			System.out.println("Input integer more then 0 >> ");
			matrixColumns= scan.nextInt();
		}
		
		int[][] matrix = new int[matrixLines][matrixColumns];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = i + 1;
				matrix[i][j] = j + 1;
			}
		}

		System.out.println("Original matrix");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}

		System.out.println("Input number of column>>");
		int firstColumn;
		checkNumber(scan);
		firstColumn = scan.nextInt();
		while (firstColumn <= 0 && firstColumn > matrixColumns) {
			System.out.println("Input positive number, within the matrix values>>");
			firstColumn = scan.nextInt();
		}
		if (firstColumn == 1) {
			firstColumn--;
		} else {
			firstColumn--;
		}

		System.out.println("Input the column number to swap with the previous column>>");
		int nextColumn;
		checkNumber(scan);
		nextColumn = scan.nextInt();

		while (nextColumn <= 0 && nextColumn > matrixColumns) {
			System.out.println("Input positive number, within the matrix values>>");
			nextColumn = scan.nextInt();
		}

		if (nextColumn == 1) {
			nextColumn--;
		} else {
			nextColumn--;
		}

//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[i].length; j++) {
//				if (j == firstColumn) {
//					matrix[i][j] = matrix[i][nextColumn];
//				}
//			}
//		}

		for (int i = 0; i < matrix.length; i++) {
					
			    int rememberInt = matrix[i][firstColumn];
				matrix[i][firstColumn] = matrix[i][nextColumn];
				matrix[i][nextColumn] = rememberInt;

		}
		

		System.out.println(" matrix");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Input integer>>");
		}
	}

}
