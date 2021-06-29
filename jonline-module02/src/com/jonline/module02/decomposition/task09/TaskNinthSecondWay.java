package com.jonline.module02.decomposition.task09;

import java.util.Scanner;

/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class TaskNinthSecondWay {
	public static void main(String[] args) {
		
		int x; //  5
		int y; // x,y - стороны образующие угол 90 градусов; 6;
		
		int z; 
		int t;
		
		int [] coordinateXY = new int [] {0,0}; // по умолчанию вершина располагается на точках 0,0. 
		// предположим что х= 5; y =6; координаты
		
		int [] coordinateXZ = new int [] {0,5};
		
		int coordinateZT; // вершина угла образованная сторонами ZT; 
		int coodrinateYT;  // 0,6
		
		
		
		
		
		
	}
	public static int inputNumberToConsole(String message) {
		Scanner reader;
		int number;

		reader = new Scanner(System.in);

		do {
			System.out.println("Input " + message);

			while (!reader.hasNextInt()) {
				System.out.println("Input integer>>");
				reader.next();
			}
			number = reader.nextInt();
		} while (number <= 0);

		return number;
	}

}
