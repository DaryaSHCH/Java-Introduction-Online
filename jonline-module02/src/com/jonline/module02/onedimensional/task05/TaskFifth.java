package com.jonline.module02.onedimensional.task05;

import java.util.Random;
import java.util.Scanner;

/*
 * Given sequence of integers a1, a2, .... aN. Print only integers,  for those aI > I;
 */
public class TaskFifth {
	public static void main(String[] args) {
		int lengthN;
		int i;

		Scanner scan = new Scanner(System.in);
        
		System.out.println("N>>");
		
        checkNumber(scan);
		
	    lengthN = scan.nextInt();
		
	    while (lengthN < 0) {
			
	    	System.out.println("N>> ");
			checkNumber(scan);
			lengthN = scan.nextInt();
		}

		int[] arrayA = new int[lengthN];
        Random random = new Random(); 
		for (int j = 0; j < arrayA.length; j++) {
			arrayA[j] = random.nextInt(1000);
		}
		
		System.out.println("i>>");
		checkNumber(scan);
		i = scan.nextInt();

		for (int element : arrayA) {
			if (element > i) {
				System.out.print(" " + element + " ");
			}
		}
	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("¬ведите число: ");
		}
	}
}
