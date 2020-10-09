package com.jonline.module01.branch.task05;
/*
 * find value of function: f(x) =  x digr2 - 3x + 9 when  x <= 3;
and f(x) =  1/x digr3 + 6   if  x > 3;
 */

import java.util.Scanner;

public class TaskFifth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число: ");
		double f;
		int x;
		String line;
		while (!sc.hasNextInt()) {
			line = sc.nextLine();
			System.out.println("Введите число: ");
		}
		x = sc.nextInt();

		if (x >= 3) {
			f = Math.pow(x, 2) - 3 * x + 9;
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.println(f);
	}
}
