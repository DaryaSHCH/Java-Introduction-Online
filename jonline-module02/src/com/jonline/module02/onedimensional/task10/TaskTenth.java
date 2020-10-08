package com.jonline.module02.onedimensional.task10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Given array of integers, with length N. Trim array ( take off every second element). 
 * Free fields full fill 0.  Don't use one more array. 
 */

public class TaskTenth {
	public static void main (String[] args) {
		int lengthN;
		Scanner scan =  new Scanner(System.in);
		System.out.println("N>>");
		 while (!scan.hasNextInt()) {
			 String str = scan.nextLine();
			 System.out.println("¬ведите число>>"); 
		 }
		 lengthN = scan.nextInt();
		 
		 while (lengthN <= 0) {
			 System.out.println("N>>");
			 lengthN = scan.nextInt();
		 }
		 int [] array = new int[lengthN];
		 Random random = new Random();
		 
		 for (int i = 0; i < array.length;  i++) {
			 array[i] = random.nextInt(100);
			 }
		 
			System.out.println(Arrays.toString(array));
		 for (int i = 0; i < array.length; i++) { 
			 if (i %2 == 1) {
				 array[i] = 0;
			 }
		 }
			System.out.println(Arrays.toString(array));
	}

}
