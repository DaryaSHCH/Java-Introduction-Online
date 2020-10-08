package com.jonline.module01.loop.task05;

import java.util.Scanner;

/*
 * Loop. Task 5: We have numbers line and number e. Find sum of elements numbers line, 
 * module of which >= e. The view:  An= 1/2 degree n + 1/3 degree n;
 */
public class TaskFifth {
	public static void main(String[] args) {
        
		double e;
        
        int result = 0; 
		
		int  numericMember; 
		
		Scanner scan = new Scanner(System.in);
        
		System.out.println("¬ведите значение дл€ е: ");
		
		e = scan.nextDouble();
		
		while (!scan.hasNextDouble()) {
			String line = scan.nextLine();
			System.out.println("¬ведите число: ");
		}
		 
		
		
		while  (true) {
			 numericMember = (int) ((1/ Math.pow(2, 2)) + 1/Math.pow(3, 3));
			 if ( Math.abs(numericMember) >= e) {
				  result =  numericMember +  numericMember; 
			 }
			 System.out.println(result);
		}
		
	}
}
