package com.jonline.module02.multidimensional.task04;

import java.util.Scanner;

/*
 *  to form square matrix n according to a given pattern
 */
public class TaskFourth {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int matrixSize;

		System.out.println("Введите значение для стороны матрицы>>");

		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Введите число>>");
		}

		matrixSize = scan.nextInt();

		while (matrixSize <= 0) {
			System.out.println("Введите число больше чем 0>>");
			matrixSize = scan.nextInt();
		}
		while (matrixSize % 2 != 0) {
			System.out.println("Введите четное число>>");
			matrixSize = scan.nextInt();

		}

		int[][] matrixSquare = new int[matrixSize][matrixSize];
		for (int i = 0; i < matrixSize; i++) {
			for (int j = 0; j < matrixSize; j++) {
				if (i % 2 != 0) {
					matrixSquare[i][j] = matrixSize - j;
				} else {
					matrixSquare[i][j] = j + 1;
				}

			}
		}
		System.out.println("Результат");

		for (int i = 0; i < matrixSquare.length; i++) {
			for (int j = 0; j < matrixSquare[i].length; j++) {
				System.out.print(matrixSquare[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
