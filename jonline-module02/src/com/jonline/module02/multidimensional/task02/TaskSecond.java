package com.jonline.module02.multidimensional.task02;

import java.util.Random;
import java.util.Scanner;

/*
 * Given square matrix. To print elements on a diagonal.
 */
public class TaskSecond {
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner (System.in);
		
		int linesCount;
		
		System.out.println("¬ведите значение стороны дл€ матрицы>> ");
		
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("¬ведите число>>");	
		}
		
		linesCount = scan.nextInt();
		
		while(linesCount <= 0) {
			System.out.println("¬ведите число больше чем 0>> ");
			linesCount = scan.nextInt();
		}
		
		
		int[][] multiSquare = new int [linesCount][linesCount];
		
		Random random = new Random();
		
		for (int i = 0; i < linesCount; i++) {
			
			for (int j = 0; j < linesCount; j++) {
				multiSquare[i][j] = random.nextInt(15) - 5;
				
			}
		}
		
		System.out.println("»сходна€ матрица");
		
		for ( int i = 0; i < multiSquare.length; i++) {
			
			for (int j = 0; j < multiSquare[i].length; j++) {
				System.out.print(multiSquare[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println("ƒиагональ є1");
		
		for (int i = 0; i < multiSquare.length; i++) {
			for ( int j = 0; j < multiSquare[i].length; j++) {
				if (i == j ) {
					System.out.print(" " + multiSquare[i][j] + " ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("ƒиагональ є2");
		
		for (int i = 0; i < multiSquare.length; i++) {
			for ( int j = 0; j < multiSquare[i].length; j++) {
				if (i == (multiSquare[i].length - j - 1 )) {
					System.out.print(" " + multiSquare[i][j] + " ");
				}
				
			}
			System.out.println();
		}
		
	}

}
