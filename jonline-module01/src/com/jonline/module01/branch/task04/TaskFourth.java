package com.jonline.module01.branch.task04;
/*
 * we have rectangular hole with sizes A, B and brick with sizes x,y,z.
 * Found out brick is placed in the hole, or not. 
 */

import java.util.Scanner;

public class TaskFourth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int targetWidth;
		int targetLength;

		int brickWidth;
		int brickLength;
		int brickHeight;

		System.out.println("������� �������� ��� �: ");

		checkNumber(scan);
		targetWidth = scan.nextInt();

		System.out.println("������� �������� ��� B: ");

		checkNumber(scan);
		targetLength = scan.nextInt();

		System.out.println("������� �������� ��� x: ");

		checkNumber(scan);
		brickWidth = scan.nextInt();

		System.out.println("������� �������� ��� y: ");

		checkNumber(scan);
		brickLength = scan.nextInt();

		System.out.println("������� �������� ��� z: ");

		checkNumber(scan);
		brickHeight = scan.nextInt();

		if (brickWidth <= targetWidth && brickLength <= targetLength) {
			System.out.println("������  �������� ����� ���������");
		} else if (brickHeight <= targetWidth && brickWidth <= targetLength) {
			System.out.println("������  �������� ����� ���������");
		} else if (brickHeight <= targetWidth && brickLength <= targetLength) {
			System.out.println("������  �������� ����� ���������");
		} else {
			System.out.println("������  �� �������� ����� ���������");
		}
	}

	public static void checkNumber(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("������� �����: ");
		}
	}
}
