package com.jonline.module02.multidimensional.task11;

import java.util.Random;

/*
 * Fill the matrix 10x20 random integers from 0 to 15. 
 * Print matrix and No. of rows, that contain integer "5" three and more times
 */
public class TaskEleventh {
	public static void main(String[] args) {

		int row;
		row = 10;
		int column;
		column = 20;

		Random random = new Random();

		int[][] matrix = new int[row][column];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(15);
			}
		}

		System.out.println("Matrix");

		for (int[] array : matrix) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
		
		int counter = 0;
 		
		System.out.println("Numbers of rows: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
                  if (matrix[i][j] == 5) {
                	  counter++; 
                  }
			}
			
			if (counter < 3) { 
				counter = 0; 
			} else { 
				System.out.print( (i + 1) + " ");
					counter = 0;
				}
			}
		    

		}

	}

