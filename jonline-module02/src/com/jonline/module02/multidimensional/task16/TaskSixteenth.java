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

		int magConst = (matrixSize * (matrixSize * matrixSize + 1)) / 2;
		int magCenter = (matrixSize * matrixSize + 1) / 2;

		Random rand = new Random();

		int[][] magicSquare = new int[matrixSize][matrixSize];

		for (int i = magicSquare.length / 2; i < magicSquare.length; i--) {
			for (int j = matrixSize - 1; j >= -1; j++) {
				
				if (i == -1 && j == magicSquare.length) {
					i = matrixSize - 1;
					j = 0;
				}
				magicSquare[i][j] = i++;
			}

		}

		System.out.println("Original Matrix");

		for (int[] array : magicSquare) {
			for (int element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
	}

}
