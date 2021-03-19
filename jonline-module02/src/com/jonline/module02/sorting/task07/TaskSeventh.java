package com.jonline.module02.sorting.task07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Пусть даны две неубывающие последовательности действительных чисел
 * a1 < a2 <... an и b1 < b2 <... bm;
 * Требуется указать те места, на которые нужно вставлять элементы последовательности
 * b1 < b2 <... bm
 * в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class TaskSeventh {
  public static void main (String [] args) { 
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int firstArraySize;
	  int secondArraySize;
	  
	  System.out.println(" Input first array size >>");
	  
	  checkNumber(scan);
	  
	  firstArraySize = scan.nextInt();
	  
	  while (firstArraySize <= 0) {
			System.out.println("input integer more then 0 >>");
			checkNumber(scan);
			firstArraySize = scan.nextInt();
		}
	  
	  System.out.println("input second array size >>");
	  
	  checkNumber(scan);
	  
	  secondArraySize = scan.nextInt();
	  
	  while (secondArraySize <= 0) {
		  System.out.println("input integer more then 0 >>");
		  checkNumber(scan);
		  secondArraySize = scan.nextInt();
	  }
	  
	  int [] firstArray = new int [firstArraySize];
	  
	  for (int i = 0; i < firstArray.length; i++) {
		  firstArray[i] = i;
	  }
	  
      int [] secondArray = new int [secondArraySize];
	  
      Random rand = new Random();
      
	  for (int i = 0; i < secondArray.length; i++) {
		  secondArray[i] = rand.nextInt(10);
	  }
	  
	  System.out.println("Массив №1 " + Arrays.toString(firstArray) + "\n");
	  System.out.println("Массив №2" + Arrays.toString(secondArray) + "\n");
	  
	  for (int i = 0; i < secondArray.length; i++) {
		  for (int j = 0; j < firstArray.length; j++) {
			  if (secondArray[i] < firstArray[j]) {
                  System.out.printf("%d елемент массива N2 вставим в %d элемент массива №1.\n", i, j+i);
                  break;
              } else if (secondArray[i] > firstArray[firstArray.length - 1]) {
                  System.out.printf("%d елемент массива №2  вставим в %d элемент " +
                          " первого массива №1 .\n", i, firstArray.length +i);
                  break;
              }
		  }
	  }
	  
	  
	  
  }
 

private static void checkNumber(Scanner scan) {
	while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("input integer >>");
		}
}
}
