package com.jonline.module02.multidimensional.task06;

import java.util.Scanner;

/*
 * To form square matrix according to a given pattern 
 *  { 1 1 1 1 1 1 
 *    0 1 1 1 1 0
 *    0 0 1 1 0 0
 *    - - - - - - 
 *    0 1 1 1 1 0
 *    1 1 1 1 1 1
 * 
 */
public class TaskSixth {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int matrixSize;
		int centralPart;
		centralPart = 0;
		
		System.out.println("Введите значение для стороны матрицы>>");
		 
		while (!scan.hasNextInt()) {
			String str = scan.nextLine();
			System.out.println("Введите число>>");
		}
		matrixSize = scan.nextInt();
		
		while ( matrixSize <= 0 && matrixSize % 2 != 0) {
			System.out.println("Введите четное число больше чем 0 >>");
					matrixSize = scan.nextInt();
		}
		
		int [][] matrix = new int [matrixSize][matrixSize];
		
		for ( int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[i].length - i; j++) {
				matrix[i][j] = 1;
				
			}
		}
		for (int i = matrix.length-1; i >= matrix.length/2; i--) {
			for (int j = centralPart; j < matrix[i].length - centralPart; j++) {
				matrix[i][j] = 1;
			}
			centralPart++;
		}
		
		for ( int [] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
		
	}

}
