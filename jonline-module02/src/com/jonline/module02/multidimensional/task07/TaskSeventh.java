package com.jonline.module02.multidimensional.task07;

import java.util.Scanner;

/* 
 * to form square matrix N  accordingly the rule A[i,j] = sin( i degree 2 - j degree 2/N)
 * and count positive element. 
 */
public class TaskSeventh {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int matrixSize; 
		
		System.out.println("N>>");
		while (!scan.hasNextInt()) {
			String str = scan.nextLine();
			System.out.println("Введите число>>");
		}
		matrixSize = scan.nextInt();

		while (matrixSize <= 0 && matrixSize % 2 != 0) {
			System.out.println("Введите четное число больше чем 0 >>");
			matrixSize = scan.nextInt();
		}
		
		double [][] squareMatrix = new double [matrixSize][matrixSize];
		
		for (int i = 0; i < squareMatrix.length; i++) {
			for(int j = 0; j < squareMatrix[i].length; j++) {
				double squareI = Math.pow(i,2);
				double squareJ = Math.pow(j,2);
				squareMatrix[i][j] = Math.sin((squareI  - squareJ)/ matrixSize); 
			}
		}
		
		for (double[] array : squareMatrix) {
			for (double element : array) {
				System.out.print(element + "\t");
			}
			System.out.println();
		}
		int counterPositive;
		counterPositive = 0; 
		int counterZero;
		counterZero = 0; 
		int counterNegative;
		counterNegative = 0; 
		
		for ( int i = 0; i < squareMatrix.length; i++) {
			for (int j = 0; j < squareMatrix[i].length; j++) {
				if (squareMatrix[i][j] > 0) {
					counterPositive++;
				}
				else if (squareMatrix[i][j] == 0) {
					counterZero++;
				}
				else if (squareMatrix[i][j] < 0) {
					counterNegative++;
				}
			}
		}
		
		System.out.println("Количество положительных элементов - " +  counterPositive);
		System.out.println("Количество нулей  - " +  counterZero);
		System.out.println("Количество отрицательных элементов - " +  counterNegative);
	}

}
