package com.jonline.module01.loop.task07;

import java.util.Scanner;

/*
 * ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, ����� ������� � ������ �����;
 */
public class TaskSeventh {
	public static void main(String[] args) {
		int firstNumber;
		int secondNumber;

		Scanner scan = new Scanner(System.in);

		System.out.println("������� ����� � �������� ���������� �������� ���: ");

		checkLine(scan);

		firstNumber = scan.nextInt();

		if (firstNumber <= 0) {
			System.out.println("������� ������������� �����: ");
			firstNumber = scan.nextInt();
		}

		System.out.println("������� ����� ������� ������������� �������� ���: ");

		checkLine(scan);

		secondNumber = scan.nextInt();

		if (secondNumber <= firstNumber) {
			System.out.println("������ ����� ������ ����� ������� ��������. ������� ����� ��������: ");
			secondNumber = scan.nextInt();
		}

		while (firstNumber <= secondNumber) {

			for (int i = 2; i < firstNumber; i++) {
				if (firstNumber % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
		firstNumber++;
	}

	public static void checkLine(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("������� �����: ");
		}
	}

}




		   
