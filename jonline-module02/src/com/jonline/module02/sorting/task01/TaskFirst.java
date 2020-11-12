package com.jonline.module02.sorting.task01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Given two one-dimensional arrays with different elements and number k. Combine them into
one array, including the second array between the k and (k + 1)  elements of the first array, without using
additional array.
 */
public class TaskFirst {
	public static void main(String[] args) {

		int firstArraySize;
		int secondArraySize;
		int k;

		Scanner scan = new Scanner(System.in);

		System.out.println("input size for fist array>>");

		checkNumber(scan);

		firstArraySize = scan.nextInt();

		while (firstArraySize <= 0) {
			System.out.println("input integer more then 0 >>");
			checkNumber(scan);
			firstArraySize = scan.nextInt();

		}

		System.out.println("input size for second array>>");

		checkNumber(scan);

		secondArraySize = scan.nextInt();

		while (secondArraySize <= 0) {
			System.out.println("input integer more then 0 >>");
			checkNumber(scan);
			secondArraySize = scan.nextInt();
		}
		while (secondArraySize == firstArraySize) {
			System.out.println("Size of second array must be different first arrays size \n repeat input>>");
			checkNumber(scan);
			secondArraySize = scan.nextInt();
		}
		
		
		System.out.println("K>>");
		
		checkNumber(scan);
		k = scan.nextInt();
		
		while (k <= 0 || ( k >= firstArraySize || k >= secondArraySize)) {
			System.out.println("input integer more then 0 and within the values ​​of the given arrays>>");
			checkNumber(scan);
			k = scan.nextInt();
		}
				
		
		Random rand = new Random();

		int[] firstArray = new int[firstArraySize + secondArraySize];

		for (int i = 0; i < firstArraySize; i++) {
			firstArray[i] = rand.nextInt(10);	
		}
		
		
		int[] secondArray = new int[secondArraySize];
		
		for( int i = 0; i < secondArray.length; i++) {	
			secondArray[i] = rand.nextInt(5) - 5; 
		}
		
		System.out.println("First Array>>"); 
		for (int i = 0; i < firstArraySize; i++) {
			System.out.print(firstArray[i] + " ");
		}
		
		System.out.println("\n Second Array>> \n" + Arrays.toString(secondArray));
		
		int  newInd = firstArray.length - (k -1);
		
		for (int i = k; i < firstArraySize; i++) {
			   firstArray[newInd] = firstArray[i];
			   newInd++;
			}
		
				
		System.out.println(Arrays.toString(firstArray));
        	
		System.arraycopy(secondArray, 0, firstArray, k, secondArray.length);
		
		System.out.println("result \n" + Arrays.toString(firstArray));
	}

	private static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("input integer >>");
		}
	}

}

