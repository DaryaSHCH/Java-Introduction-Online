package com.jonline.module04.classes.task06;

import java.util.Scanner;

/*
 * Составьте описание класса для представления времени. Предусмотрите возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.

 */
public class TaskSixth {
	public static void main(String[] args) {

		Time defaultTime = new Time();
		StringBuilder defaultTimeStr = defaultTime.watchTime(defaultTime.getHour(), defaultTime.getMinute(),
				defaultTime.getSecond());
		System.out.println("Default time = " + defaultTimeStr);

		Time myTime = new Time(22, 22, 67);
		StringBuilder myTimeStr = myTime.watchTime(myTime.getMinute(), myTime.getMinute(), myTime.getSecond());
		System.out.println("My time = " + myTimeStr);

		System.out.println("if you want change time input \"Y\" if yes, or \"N\" in otherwise >>");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		char choice;
		choice = scan.next().charAt(0);

		while (choice != 'n' && choice != 'N' && choice != 'y' && choice != 'Y') {
			System.out.println("if you want change time input \"Y\" if yes, or \"N\" in otherwise >>");
			choice = scan.next().charAt(0);
		}

		if (choice == 'y' || choice == 'Y') {
			int changedHour;
			int min;
			int sec;

			changedHour = inputTime("hour");
			min = inputTime("minute");
			sec = inputTime("second");

			Time modifiedTime = new Time(changedHour, min, sec);
			modifiedTime.setHour(changedHour);
			modifiedTime.setMinute(min);
			modifiedTime.setSecond(sec);
			StringBuilder modifiedTimeStr = modifiedTime.watchTime(modifiedTime.getHour(), modifiedTime.getMinute(),
					modifiedTime.getSecond());
			System.out.println("Your new time " + modifiedTimeStr);
		} else if (choice == 'n' || choice == 'N') {
			System.out.println("Time is not changed");
		}

	}

	@SuppressWarnings("resource")
	public static int inputTime(String message) {
		Scanner reader;
		int modifiedTime;

		reader = new Scanner(System.in);

		do {
			System.out.println("Input " + message);

			while (!reader.hasNextInt()) {
				System.out.println("input new " + message);
				reader.next();
			}
			modifiedTime = reader.nextInt();
		} while ((modifiedTime > 24) && (modifiedTime > 60) && (modifiedTime < 0));

		return modifiedTime;
	}
}
