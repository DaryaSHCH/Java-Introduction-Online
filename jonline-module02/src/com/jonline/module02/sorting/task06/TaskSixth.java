package com.jonline.module02.sorting.task06;

import java.util.Random;
import java.util.Scanner;

/*
 * Shell sort 
 * Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента
 * ai и ai+1. Если ai <= ai+1, то продвигаются на один элемент вперед. Если
 * ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
 * Составить алгоритм этой сортировки.
 */
public class TaskSixth {
	public static void main(String[] args) {

		int arraySize;
		Scanner sc = new Scanner(System.in);

		System.out.println("input size for array>> ");

		checkNumber(sc);

		arraySize = sc.nextInt();
		while (arraySize <= 0) {
			System.out.println("input integer more then 0 >>");
			checkNumber(sc);
			arraySize = sc.nextInt();
		}
		int[] array = new int[arraySize];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}

		System.out.println("initial array>>");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		int d = array.length / 2;
		while (d > 0) {
			for (int i = 0; i < array.length - d; i++) {
				int j = i;
				while (j >= 0 && array[j] > array[j + d]) {
					int temp = array[j];
					array[j] = array[j + d];
					array[j + d] = temp;
					j -= d;
				}
			}
			d /= 2;
		}

		System.out.println();
		System.out.println("result>>");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	private static void checkNumber(Scanner sc) {
		while (!sc.hasNextInt()) {
			String line = sc.nextLine();
			System.out.println("input integer >>");
		}
	}

}

