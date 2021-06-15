package com.jonline.module02.sorting.task08;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Даны дроби p1/q1, p2/q2 ... pn/qn (p,q - натуральные). Составить программу, 
 * которая приводит эти дроби к общему 
 * знаменателю и упорядочивает их в порядке возрастания.
 */
public class TaskEighth {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println (" Will you use array with random values?"
				+ " Input \"Y\" if your answer Yes, or \"N\" otherwise ");
		String answer;
		
		while (!scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println("input \"Y\" or \"N\" ");
		}
		answer = scan.toString();
		
		
		int randomArraySize;
		
		System.out.println(" input array length >>");
		
		checkNumber(scan);
		randomArraySize = scan.nextInt();
		while (randomArraySize <= 0) {
			System.out.println("input integer more then 0 >> ");
			checkNumber(scan);
			randomArraySize = scan.nextInt();
		}
		
		
		int [] arrayRandomNumenator = new int [randomArraySize];
		int [] arrayRandomDenominator = new int [randomArraySize]; 
		
		arrayRandomNumenator = createRandomArray(randomArraySize);
		arrayRandomDenominator = createRandomArray(randomArraySize);
		
		int [] arrayConstantNumenator = new int [] {1, 2, 3, 4, 5, 6, 8};		
		
		System.out.println(" numenator array >> \t" + Arrays.toString(arrayRandomNumenator) + "\n");
		
		int [] arrayConstantDenominator = new int [] {5, 10, 6, 9, 15, 18, 20};
		
		System.out.println(" denominator array >> \t" + Arrays.toString(arrayRandomDenominator) + "\n");
		//System.out.printf("  denominator array >> %s \n\n", Arrays.toString(arrayQ));
		//System.out.println(String.format("  denominator array >> %s %s \n\n", Arrays.toString(arrayQ), "test"));
		
		findGlobalDenominatorAndSort(arrayRandomNumenator,arrayRandomDenominator);
		
		
		
	}
	
	private static void findGlobalDenominatorAndSort(int[] numenators, int [] denominators) {
		double [] arrayResult = new double [numenators.length];
		
		for (int i = 0; i < arrayResult.length; i++) {
			arrayResult[i] = (double)numenators[i]/(double)denominators[i];
		}
		
		System.out.println("  Result array >> " + Arrays.toString(arrayResult) + "\n");
		
		for (int i = 0; i < arrayResult.length; i++) {

			int position = i;

			double minValue = arrayResult[i];

			for (int j = i + 1; j < arrayResult.length; j++) {
				if (arrayResult[j] < minValue) {
					position = j;
					minValue = arrayResult[j];
				}
			}

			arrayResult[position] = arrayResult[i];
			arrayResult[i] = minValue;
			
			int buf = numenators[i];
		    numenators[i] = numenators[position];
		    numenators[position] = buf;
		    
		    buf = denominators[i];
		    denominators[i] = denominators[position];
		    denominators[position] = buf;
		}
		
		System.out.println("  Result array >> " + Arrays.toString(arrayResult) + "\n");
		
		System.out.println(" numenator array >> \t" + Arrays.toString(numenators) + "\n");
		System.out.println(" denominator array >> \t" + Arrays.toString(denominators) + "\n");
		
		for (int i = 0; i < arrayResult.length; i++) {
			for (int j = i + 1; j < arrayResult.length - 1; j++) {
				if (arrayResult[i] == arrayResult[j]) {
					int position = i; 
					numenators[position] = numenators[j];
					denominators[position] = denominators[j];
				}
			}
		}
		
		System.out.println("  Result array >> " + Arrays.toString(arrayResult) + "\n");
		System.out.println(" numenator array >> \t" + Arrays.toString(numenators) + "\n");
		System.out.println(" denominator array >> \t" + Arrays.toString(denominators) + "\n");
	}
	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("Введите число: ");
		}
	}
	
	private static int [] createRandomArray (int randomArraySize) {
		Random rand = new Random();
		int [] randomArray = new int [randomArraySize];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = rand.nextInt(9) + 1;
		}
		return randomArray;
		
	}
}



