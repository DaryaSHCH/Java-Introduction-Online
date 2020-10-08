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
		
		System.out.println("¬ведите значение дл€ стороны матрицы>>");
		 
		while (!scan.hasNextInt()) {
			String str = scan.nextLine();
			System.out.println("¬ведите число>>");
		}
		matrixSize = scan.nextInt();
		
		while ( matrixSize <= 0 && matrixSize % 2 != 0) {
			System.out.println("¬ведите четное число больше чем 0 >>");
					matrixSize = scan.nextInt();
		}
		
		int [][] matrix = new int [matrixSize][matrixSize];
		
		for ( int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
			}
		}
	}

}
