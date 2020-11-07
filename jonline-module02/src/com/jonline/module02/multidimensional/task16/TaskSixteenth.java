package com.jonline.module02.multidimensional.task16;

import java.util.Random;
import java.util.Scanner;
/*
 *  generation magic square 
 *  example: 6 1 8
 *           7 5 3
*            2 9 4
*            
 */
public class TaskSixteenth {
	public static void main(String[] args) {

		int matrixSize;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input value of side for matrix>>");

		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Input the integer>>");
		}

		matrixSize = scan.nextInt();

		while (matrixSize <= 0 || matrixSize > 10) {
			System.out.println("Input the integer more then 0 and less then 10>> ");
			matrixSize = scan.nextInt();
		}

		int magConst = matrixSize * ((matrixSize * matrixSize + 1) / 2);
		int magCenter = (matrixSize * matrixSize + 1) / 2;

		int[][] magicSquare = new int[matrixSize][matrixSize];

		int number = 1;
		
		int i = 0;
		
		int j = matrixSize / 2;
		
		int currentRowInd;
		
		int currentColumnInd;
		
		while (number <= matrixSize * matrixSize) {
			
			magicSquare[i][j] = number;
			number++;
			currentRowInd = i;
			currentColumnInd = j;
			
			i -= 1;
			j += 1;
			
			if (i == -1) {
				i = matrixSize - 1;
			}
			
		    if (j == matrixSize) {
				j = 0;
			}
			
			if (magicSquare[i][j] != 0) {
				i = currentRowInd + 1;
				j = currentColumnInd;
				if (i == -1) {
					i = matrixSize - 1;
				}
			}
		}

		System.out.println("Magic Square");

		for (int[] array : magicSquare) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

}
