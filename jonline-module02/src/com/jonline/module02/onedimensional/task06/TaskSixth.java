package com.jonline.module02.onedimensional.task06;


import java.util.Scanner;

/*
 *  Given sequence of real numbers. Calculate sum of numbers, for whose index numbers  are simple numbers
 */
public class TaskSixth {
	static int  CHECK = 2; 
	public static void main(String[] args) {
		int lengthN;
		double sumElements = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("N>>");
		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Введите число>> ");
		}
		lengthN = scan.nextInt();
		while (lengthN <= 0) {
			System.out.println("N>>");
			lengthN = scan.nextInt();
		}

		double[] array = new double[lengthN];

		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random();
		}
		for (int i = 2; i < array.length; i++) {
			if (i % CHECK != 0) {
				sumElements += array[i];
			}
		}
		System.out.println("Cумма чисел, чьи порядковые номера являются простыми числами равна:  " + sumElements);

	}
}
