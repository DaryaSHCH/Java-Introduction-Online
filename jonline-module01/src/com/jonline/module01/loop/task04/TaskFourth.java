package com.jonline.module01.loop.task04;

import java.util.Scanner;

/*
 * multiplications of square first 2 hundred numbers;
 */
public class TaskFourth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long mult = 0;
        int sqr = 0;
        int y;

        System.out.println("Введите число: ");

        while (!scan.hasNextInt()) {
            String line = scan.nextLine();
            System.out.println("Введите число: ");
        }

        y = scan.nextInt();

        for (int i = 0; i < 200; i++) {
            sqr = (int) Math.pow(y, 2);
            mult = (long)sqr * (long)sqr;
            y++;

        }
        System.out.println("Произведение квадратов первых двухсот чисел: "+ mult );

    }
}

