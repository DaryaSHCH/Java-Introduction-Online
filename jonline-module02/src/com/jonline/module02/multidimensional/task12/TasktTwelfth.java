package com.jonline.module02.multidimensional.task12;

import java.util.Random;

/*
 * Sort matrix rows in ascending and descending order of element values.
 */
public class TasktTwelfth {
	public static void main(String[] args) {
		
		int matrixSize;
		matrixSize = 6;
		
		Random random = new Random(); 
		
		int [][] matrix = new int [matrixSize][matrixSize];
		
		for ( int i = 0; i < matrix.length; i++) {
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
	
	}

}
