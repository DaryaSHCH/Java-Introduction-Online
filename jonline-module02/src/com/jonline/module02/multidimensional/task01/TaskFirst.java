package com.jonline.module02.multidimensional.task01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * given matrix. Print all the odd columns, that have the first element more then last.
 */
public class TaskFirst {
	public static void main(String[] args) {

		int linesCount;
		int columnsCount;

		Scanner scan = new Scanner(System.in);

		System.out.println("Введите количество строк для заданной матрицы>> ");

		checkLine(scan);

		linesCount = scan.nextInt();

		while (linesCount <= 0) {
			System.out.println("Введите число больше 0>> ");
			linesCount = scan.nextInt();
		}

		System.out.println("Введите количество столбцов для заданной матрицы>> ");

		checkLine(scan);

		columnsCount = scan.nextInt();

		while (columnsCount <= 0) {
			System.out.println("Введите число больше 0>> ");
			linesCount = scan.nextInt();
		}

		int[][] multi = new int[linesCount][columnsCount];

		Random random = new Random();

		for (int i = 0; i < linesCount; i++) {

			for (int j = 0; j < columnsCount; j++) {
				multi[i][j] = random.nextInt(15) - 5;
			}
		}
        
		System.out.println("Исходная матрица:");
		
		for (int i = 0; i < multi.length; i++) {

			for (int j = 0; j < multi[i].length; j++) {
				System.out.print(multi[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Результат:");
		
		for (int i = 0; i < multi.length; i++) {

			for (int j = 1; j < multi[i].length; j += 2) {

				if (multi[0][j] > multi[multi.length - 1][j]) {
					System.out.print(" " + multi[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void checkLine(Scanner scan) {
		while (!scan.hasNextInt()) {
			String str = scan.nextLine();
			System.out.println("Введите число>> ");
		}
	}

}
