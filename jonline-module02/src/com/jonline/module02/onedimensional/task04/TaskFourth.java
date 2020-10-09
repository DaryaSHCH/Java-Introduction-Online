package com.jonline.module02.onedimensional.task04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * Given real numbers a1, a2, a3, ....aN. Relocate the most and the smallest elements.
 */
public class TaskFourth {
	public static void main(String[] args) {
		int lenghtN;
        Scanner sc = new Scanner(System.in);
        System.out.println("N>> ");

        while (!sc.hasNextInt()) {
            String line = sc.nextLine();
            System.out.println("Введите число >> ");
        }
        lenghtN = sc.nextInt();
        while (lenghtN <= 0) {
            System.out.println("N>> ");
            lenghtN = sc.nextInt();
        }
        Random random = new Random();
        int[] anotherArray = new int[lenghtN];
        for (int i = 0; i < anotherArray.length; i++) {
            anotherArray[i] = random.nextInt(1000);
        }
        int mostElement = anotherArray[0];
        int smallestElement = anotherArray[0];
        int indexMax = 0;
        int indexMin = 0;
        int anotherBuf = 0;
        for (int i = 0; i < anotherArray.length; i++) {
            if (anotherArray[i] >= mostElement) {
                mostElement = anotherArray[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < anotherArray.length; i++) {
            if (anotherArray[i] <= smallestElement) {
                smallestElement = anotherArray[i];
                indexMin = i;
            }
        }
        anotherBuf = anotherArray[indexMax];
        anotherArray[indexMax] = anotherArray[indexMin];
        anotherArray[indexMin] = anotherBuf;

        System.out.println("Наибольший элемент массива: " + mostElement + " c индексом " + indexMax);
        System.out.println("Наименьший элемент массива: " + smallestElement + " c индексом " + indexMin);
        System.out.println(" Позиции данных элементов изменены");
        System.out.println(Arrays.toString(anotherArray));
	}
}
