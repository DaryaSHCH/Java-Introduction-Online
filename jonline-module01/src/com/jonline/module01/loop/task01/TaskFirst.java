package com.jonline.module01.loop.task01;
/*
 * �������� ���������, ��� ������������ ������ ����� ������������� ����� �����.
 * � ��������� ��������� ��� ����� �� ������ �� ���������� ������������� �����.
 */ 
import java.util.Scanner;

public class TaskFirst {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a;
		int sum = 0;
		System.out.println("������� �����: ");

		while (!scan.hasNextInt()) {
			String line = scan.nextLine();
			System.out.println("������� �����: ");
		}

		a = scan.nextInt();

		while (a <= 0) {
			System.out.println("������� ����� ������ ��� 0: ");
			a = scan.nextInt();
		}

		for (int i = 1; i <= a; i++) {
			sum = sum + i;
		}

		System.out.println(sum);

	}
}


