package com.jonline.module01.loop.task01;
/*
 * Написать программу, где пользователь вводит любое положительное целое число.
 * А программа суммирует все числа от одного до введенного пользователем числа.
 */ 
import java.util.Scanner;

public class TaskFirst {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a;
		int sum = 0;
		System.out.println("Введите число: ");

		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}

		a = scan.nextInt();

		while (a <= 0) {
			System.out.println("Введите число больше чем 0: ");
			a = scan.nextInt();
		}

		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

	}
}


