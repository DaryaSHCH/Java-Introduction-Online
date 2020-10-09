package com.jonline.module01.branch.task02;
/*
 * find max{ min(a,b), min(c,d)};
 */

import java.util.Scanner;

public class TaskSecond {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
	    
		int a; 
	    int b; 
	    int c; 
	    int d; 
	    System.out.println("Введите значение для а: ");

		checkNumber(scan);

		a = scan.nextInt();

		System.out.println("Введите значение для b: ");

		checkNumber(scan);

		b = scan.nextInt();

		System.out.println("Введите значение для c: ");

		checkNumber(scan);
		c = scan.nextInt();
		
		System.out.println("Введите значение для d: ");
		
		checkNumber(scan);
		d = scan.nextInt();
		
		int minAB = Math.min(a,b);
	    int minCD = Math.min(c,d);
	    int MaxMin = Math.max(minAB, minCD);
	    System.out.println("Max {min(a,b), min(c,d)} = " + MaxMin) ;
	}
	


	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}
}

	    
