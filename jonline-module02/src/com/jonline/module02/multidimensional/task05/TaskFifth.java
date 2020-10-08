package com.jonline.module02.multidimensional.task05;

import java.util.Scanner;
/*
 *  to form square matrix n according to a given pattern
 */

public class TaskFifth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int matrixSize;

		System.out.println("¬ведите значение дл€ стороны матрицы>>");

		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("¬ведите число >>");
		}

		matrixSize = scan.nextInt();

		while (matrixSize <= 0) {
			System.out.println("¬ведите число больше чем 0>>");
			matrixSize = scan.nextInt();
		}

		while (matrixSize % 2 != 0) {
			System.out.println("¬ведите четное число>>");
			matrixSize = scan.nextInt();

		}

		int[][] matrixSquare = new int[matrixSize][matrixSize];

		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize - i; j++) {
				matrixSquare[i][j] = i + 1;
			}
		}

		System.out.println("–езультат \n");
		

		for (int i = 0; i < matrixSquare.length; i++) {
			for (int j = 0; j < matrixSquare[i].length; j++) {
				System.out.print(matrixSquare[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
