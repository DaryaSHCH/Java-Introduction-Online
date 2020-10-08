package com.jonline.module02.multidimensional.task03;

import java.util.Random;
import java.util.Scanner;

/*
 * Given matrix. To print K-line, and P-column.
 */
public class TaskThird {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int matrixSize; 
		
		System.out.println("Введите значение для стороны матрицы>>");
		
		checkLine(scan);
		
		matrixSize = scan.nextInt();
		
		while(matrixSize <= 0) {
			System.out.println("Введите число больше чем 0>>");
			matrixSize = scan.nextInt();
			
		}
		
		int [][] matrix = new int [matrixSize][matrixSize];
		
		Random random = new Random();
		
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				matrix[i][j] = random.nextInt(10);
			}
		}
		
		System.out.println("Исходная матрица");
		
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Введите номер строки>>");
		
		int lineNumber;
		
		checkLine(scan);
		
		lineNumber = scan.nextInt();
		
		while (lineNumber <= 0) {
			System.out.println("Введите число больше чем 0>>");
			lineNumber = scan.nextInt();
		}
		
		if (lineNumber == 1) {
			lineNumber = 0;
		}
		else if ( lineNumber >= matrixSize) {
			lineNumber = matrixSize - 1;
		}
		
		System.out.println("Введите номер столбца>>");
		
		int columnNumber;
		
		checkLine(scan);
		
		columnNumber = scan.nextInt();
		
		while (columnNumber <= 0) {
			System.out.println("Введите число больше чем 0>>");
			columnNumber = scan.nextInt();
		}
		
		if (columnNumber == 1) {
			columnNumber = 0;
		}
		else if ( columnNumber >= matrixSize) {
			columnNumber = matrixSize - 1;
		}
		
		
		System.out.println("Строка");
		
		for (int i = 0; i < matrix.length; i++) {
             System.out.print(matrix[lineNumber][i]  + "\t");
			}
		System.out.println();
		System.out.println("Столбец");
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][lineNumber]  + "\t");
		}
		
		
		
		
	}

	public static void checkLine(Scanner scan) {
		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Введите число>>");
		}
	}

}
