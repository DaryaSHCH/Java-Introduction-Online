package com.jonline.module04.classes.task04;

/*
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.
 */
public class TaskFourth {
	public static void main(String[] args) {

		Train[] trains = new Train[] { new Train("St.Petersburg", 11, 21, 55), new Train("Moscow", 7, 7, 0),
				new Train("Blagoveschensk", 22, 17, 30), new Train("Sortavala", 15, 13, 17),
				new Train("Ivanovka", 12, 14, 55) };

		sortByNumber(trains);
		printTrains(trains);
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
}
