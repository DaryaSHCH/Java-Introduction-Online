package com.jonline.module02.decomposition.task12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не больше N.
 */
public class TaskTwelth {
public static void main(String[] args) {
	
	int k;
	int n; 
	
	k = inputNumberToConsole("integer K >>");
	
	n = inputNumberToConsole("integer N >>");
	
	//String[] digitsFromK = Integer.toString(k).split("");
	
	//System.out.println(Arrays.toString(digitsFromK));
	
	 //int sizeStringK = digitsFromK.length;
     
	 //int [] arrayK = new int [sizeStringK];
     //for(int i=0; i<sizeStringK; i++) {
       // arrayK[i] = Integer.parseInt(digitsFromK[i]);
     //}
     
    // System.out.println(Arrays.toString(arrayK));
	
	int lengthInitialArray = 40; 
	
	int [] initialArray = new int[lengthInitialArray];
	
	Random randomIntegers = new Random();
	
	for (int i = 0; i <initialArray.length; i++) {
		initialArray[i] = randomIntegers.nextInt(k * 2);
	}
	
	System.out.println(Arrays.toString(initialArray));
	
	for (int i = 0; i <initialArray.length; i++) {
		String [] digitsFromInitialArrayElements = Integer.toString(initialArray[i]).split("");	
		System.out.println(Arrays.toString());
	}
	
	
	int sumElemArray = 0; 
	
	
	int [] arrayA = new int [lengthArray];
	
	for (int i = 0; i < arrayA.length; i++) {
		sumElemArray = k;
		
		arrayA[i] = k - i;
		
		if (arrayA[i] > n) {
			
		}
		
		
	}
	
	
	
	
	
	
	
	
}
public static int inputNumberToConsole(String message) {
	Scanner reader;
	int number;

	reader = new Scanner(System.in);

	do {
		System.out.println("Input " + message);

		while (!reader.hasNextInt()) {
			System.out.println("Input integer>>");
			reader.next();
		}
		number = reader.nextInt();
	} while (number <= 0);

	return number;
}

}
