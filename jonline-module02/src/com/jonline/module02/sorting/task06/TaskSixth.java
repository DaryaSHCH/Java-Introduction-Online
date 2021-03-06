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
		int [] array = new int [arraySize];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10); 
		}
		System.out.println("initial array>>");
	}	

	private static void checkNumber(Scanner sc) {
		while (!sc.hasNextInt()) {
			String line = sc.nextLine();
			System.out.println("input integer >>");
		}
	}

}

