package com.jonline.module02.decomposition.task07;

/*
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class TaskSeventh {
	public static void main(String[] args) {

		int sumOddFactorial = 0;
		for (int i = 1; i <= 9; i++) {
			if (i % 2 != 0) {
				sumOddFactorial += getFactorial(i);
			}
		}

		System.out.println("The sum of the factorials of all odd numbers from 1 to 9 is " + sumOddFactorial);

	}

	public static int getFactorial(int oddNumber) {
		int result = 1;
		for (int i = 1; i <= oddNumber; i++) {
			result = result * i;
		}
		return result;
	}
}
