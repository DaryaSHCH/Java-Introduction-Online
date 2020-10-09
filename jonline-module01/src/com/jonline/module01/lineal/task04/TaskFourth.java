package com.jonline.module01.lineal.task04;
/*
 * swap the fractional and integer parts of a number;
 */

public class TaskFourth {
	public static void main(String[] args) {

		double x;
		x = 567.128;

		double y;
		y = (int) x;

		y = (x * 1000) % 1000 + (int) x / 1000.0;

		System.out.println(y);

	}
}
