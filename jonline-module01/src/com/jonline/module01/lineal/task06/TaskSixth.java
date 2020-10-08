package com.jonline.module01.lineal.task06;
/*
 * Develop linear program for coordinate plane, it must print "true" if input coordinate 
 * match to painted field, and print "false" otherwise. 
 */

import java.util.Scanner;

public class TaskSixth {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("¬ведите значение дл€ х: ");

		checkNumber(scan);
		x = scan.nextInt();

		System.out.println("¬ведите значение дл€ y: ");
		checkNumber(scan);
		y = scan.nextInt();

		System.out.println(y <= 0 ? y >= -3 && x >= -4 && x <= 4 
				: y < 4 && x >= -2 && x <= 2);
	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("¬ведите число: ");
		}
	}

}
