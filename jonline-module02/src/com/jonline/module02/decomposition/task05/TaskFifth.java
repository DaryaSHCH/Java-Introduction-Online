package com.jonline.module02.decomposition.task05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class TaskFifth {
public static void main(String[] args) {
	
	Scanner reader = new Scanner(System.in);
	
	int n; 
	
	System.out.println("Input array length >>");
	
	checkInteger(reader);
	
	n = reader.nextInt();
	
	while( n <= 0) {
		checkInteger(reader);
		System.out.println("Input integer more then 0 >>");
		n = reader.nextInt();
	}
	
	int[] array = createArray(n);
	
	System.out.println("ARRAY");
	
	System.out.println(Arrays.toString(array));
	
	int subMax = findIntLessThanMax(array);
	
	System.out.println("The number is less than the maximum number in the array, but more than the remaining of elements  " +  subMax);
	
	
}

public static int findIntLessThanMax(int[] array) {
	int max = array[0];
	
	for (int i = 0; i < array.length; i++) {
		if (array[i] > max) {
			max = array[i];
		}
	}
	
	int subMax = array[0]; 
	
	for (int i = 0; i < array.length; i++) {
		if (array[i] > subMax && array[i] < max) {
			subMax = array[i];
		}
	}
	return subMax;
}

private static int[] createArray(int n) {
	int [] array = new int [n];
	
	Random rand = new Random();
	
	for (int i = 0; i < array.length; i++) {
		array[i] = rand.nextInt(100);
	}
	return array;
}

private static void checkInteger(Scanner reader) {
	while(!reader.hasNextInt()) {
		String line = reader.nextLine();
		System.out.println("Input integer more then 0 >>");
	}
}
}
