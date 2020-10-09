package com.jonline.module02.onedimensional.task07;

import java.util.Arrays;
import java.util.Scanner;
/*
 *  Given sequence of real numbers a1,a2... an. Find out max(a1 + an, a2 + an-1, ... an+1) 
 */
public class TaskSeventh {
	public static void main(String[] args) {
		int lengthN;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("N>>");
		
		while (!scan.hasNextInt()) {
			String s = scan.nextLine();
			System.out.println("Введите число>>");
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

		double sumPair = array[0] + array[lengthN - 1];
		double lengthEnd = 0.0;

		for (int i = 0; i < lengthN / 2; i++) {
			lengthEnd = array[lengthN - 1 - i];
			sumPair = Math.max(array[i] + lengthEnd, sumPair);
		}

		System.out.println(sumPair);
		System.out.println(Arrays.toString(array));
	}

}
