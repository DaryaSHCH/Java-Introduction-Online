package com.jonline.module01.branch.task01;

import java.util.Scanner;

/*
 * Given  two angles of triangle (their value in degree). Find out doesn't exist this
 * triangle, if it exists, next step is to find out isn't this triangle rectangular. 
 */
public class TaskFirst {
	public static final int SUM_ABC = 180;

	public static void main(String[] args) {
		int angleA;
		int angleB;

		Scanner scan = new Scanner(System.in);
		System.out.println("angle A = ");

		checkNumber(scan);

		angleA = scan.nextInt();
        
		while (angleA <= 0) {
        	System.out.println("angle A = ");
        	angleA = scan.nextInt();
        }
		
		System.out.println("angle B = ");
        
		checkNumber(scan);
		
		angleB = scan.nextInt();
		
		while (angleB <= 0) {
        	System.out.println("angle B =>> ");
        	angleB = scan.nextInt();
        }

		int sumAB = angleA + angleB;

		if (sumAB >= SUM_ABC) {
			System.out.println("This triangle does not exist");
		} else {
			System.out.println("This triangle exists");

			int angleC = SUM_ABC - sumAB;

			if (angleA == 90 || angleB == 90 || angleC == 90) {
				System.out.println("This triangle is rectangular");
			} else {
				System.out.println("This triangle is not rectangular");
			}
		}
	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}
}

    


