package com.jonline.module04.classes.task01;

/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */
public class TaskFirst {
	public static void main(String[] args) {

		TestFirst testCurrent = new TestFirst();

		testCurrent.setLength(10);
		testCurrent.setWidth(6);

		System.out.println("initial variables");
		testCurrent.printVarFromTest(testCurrent.getLength(), testCurrent.getWidth());

		System.out.println("Sum = " + testCurrent.findSumVar());
		System.out.println("The greatest variable is " + testCurrent.findGreatestVar());

	}

}
