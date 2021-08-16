package com.jonline.module04.classes.task05;

/*
 *  Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */
public class TaskFifth {
	public static void main(String[] args) {
		Counter myCounter = new Counter();

		System.out.println("<< Counter initialized by default >>");
		System.out.println("Current value = " + myCounter.getCurrentValue());
		System.out.print("Minimal counters value = " + myCounter.getMinimalValue());
		System.out.println(", Maximal counters value  = " + myCounter.getMaximalValue());
		System.out.println("increasing by one: " + myCounter.increaseValue());
		myCounter.reduceValue();
		System.out.println("reducing by one: " + myCounter.reduceValue());

		
		Counter someCounter = new Counter(36, 75, 43);

		System.out.println("<<New counter with preset>>");
		System.out.println("Current value = " + someCounter.getCurrentValue());
		System.out.print("Minimal counters value = " + someCounter.getMinimalValue());
		System.out.println(", Maximal counters value  = " + someCounter.getMaximalValue());
		System.out.println("increasing by one: " + someCounter.increaseValue());
		someCounter.reduceValue();
		System.out.println("reducing by one: " + someCounter.reduceValue());
	}
}
