package com.jonline.module01.loop.task08;

import java.util.Scanner;

/*
 * ���� 2 �����. ���������� ����� �������� ��� � ������, ��� � �� ������ �����;
 */
public class TaskEighth {
	public static void main(String[] args) {

		int firstNumber;
		int secondNumber;
		String firstString;
		String secondString;
		Scanner scan = new Scanner(System.in);

		System.out.println("������� �����: ");

		checkLine(scan);

		firstNumber = scan.nextInt();

		System.out.println("������� �����: ");

		checkLine(scan);

		secondNumber = scan.nextInt();

		firstString = Integer.toString(firstNumber);
		secondString = Integer.toString(secondNumber);

			for (int i = 0; i < firstString.length(); i++) {
				Character firstChar = firstString.charAt(i);
				for (int j = 0; j < secondString.length(); j++) {
					if (firstChar == secondString.charAt(j)) {
						System.out.println(firstChar + " ���������� � � ������ � �� ������ ����� ");
					}
				}
			}
	}


	public static void checkLine(Scanner scan) {
		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("������� �����: ");
		}
	}

}
