package com.jonline.module04.classes.task04;

import java.util.Scanner;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class TaskFourth {
	public static void main(String[] args) {
		int numberPassengerTrain;

		Train[] trains = new Train[] { new Train("St.Petersburg", 11, 21, 55), new Train("Moscow", 7, 7, 0),
				new Train("Blagoveschensk", 22, 17, 30), new Train("Sortavala", 15, 13, 17),
				new Train("Ivanovka", 12, 14, 55) };

		numberPassengerTrain = inputNumberTrain("number of the train available to you(11,7,22,15 or 12) >>");
		printInfoTrain(numberPassengerTrain, trains);
	}

	public static void sortByNumber(Train[] trains) {
		Train temporaryVar;

		for (int i = 0; i < trains.length - 1; i++) {
			for (int j = i; j < trains.length - i - 1; j++)
				if (trains[j].getTrainNumber() > trains[j + 1].getTrainNumber()) {
					temporaryVar = trains[j];
					trains[j] = trains[j + 1];
					trains[j + 1] = temporaryVar;
				}
		}
	}

	public static void printTrains(Train[] trains) {
		for (Train train : trains) {
			System.out.println("[Destination: " + train.getDestination() + ", №" + train.getTrainNumber()
					+ ", Departure time " + train.getDepartureTime() + "]");
		}
	}

	public static Train[] sortByDestination(Train[] trains) {
		Train temporaryVar;
		for (int i = 0; i < trains.length; i++) {
			for (int j = 0; j < trains.length - 1; j++) {
				if (trains[j].getDestination().compareTo(trains[j + 1].getDestination()) > 0) {
					temporaryVar = trains[j];
					trains[j] = trains[j + 1];
					trains[j + 1] = temporaryVar;
				} else if (trains[j].getDestination().compareTo(trains[j + 1].getDestination()) == 0) {
					if (trains[j].getDepartureTime().compareTo(trains[j + 1].getDepartureTime()) > 0) {
						temporaryVar = trains[j];
						trains[j] = trains[j + 1];
						trains[j + 1] = temporaryVar;
					}
				}
			}
		}
		return trains;
	}

	@SuppressWarnings("resource")
	public static int inputNumberTrain(String message) {
		Scanner reader;
		int number;

		reader = new Scanner(System.in);

		do {
			System.out.println("Input " + message);

			while (!reader.hasNextInt()) {
				System.out.println("Input number of the train available to you>>");
				reader.next();
			}
			number = reader.nextInt();
		} while ((number != 11) && (number != 7) && (number != 22) && (number != 15) && (number != 12));

		return number;
	}

	public static void printInfoTrain(int numberTrain, Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getTrainNumber() == numberTrain) {
				System.out.println("[Destination: " + trains[i].getDestination() + ", №" + trains[i].getTrainNumber()
						+ ", Departure time " + trains[i].getDepartureTime() + "]");
			}
		}
	}

}
