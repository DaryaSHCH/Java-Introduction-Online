package com.jonline.module01.loop.task02;

import java.util.Scanner;

/*
 Loop/ task2: calculate value of function for length [a,b] step h; 
 y = x, x >2; y = - x, <= 2; 
 */
public class TaskSecond {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int h;
		int y;

		System.out.println("¬ведите значениe дл€ a: ");

		checkLine(scan);
		a = scan.nextInt();

		System.out.println("¬ведите значениe дл€ b: ");

		checkLine(scan);

		b = scan.nextInt();

		System.out.println("¬ведите значениe дл€ h: ");

		checkLine(scan);

		h = scan.nextInt();

		do {
			if (a > 2) {
				y = a;
			} else {
				y = -a;
			}
			System.out.println(a + " = " + y);
		} while ((a = a + h) <= b);

	}

	public static void checkLine(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("¬ведите число: ");
		}
	}
}
