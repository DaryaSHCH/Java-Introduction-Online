package com.jonline.module02.decomposition.task10;

import java.util.Arrays;

/*
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */

public class TaskTenth {
	public static void main(String[] args) {

		int n = 100276;

		System.out.println(Arrays.toString(splitToArray(n)));

	}

	public static int[] splitToArray(int number) {
		int[] array;
		int counter = 0;
		int element = number;

		while (number != 0) {
			number = number / 10;
			counter++;
		}

		array = new int[counter];

		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = number % 10;
			number = number / 10;
		}

		return array;
	}

}
