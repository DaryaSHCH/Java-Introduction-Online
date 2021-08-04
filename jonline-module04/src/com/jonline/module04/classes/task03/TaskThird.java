package com.jonline.module04.classes.task03;

/*
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class TaskThird {
	public static void main(String[] args) {

		Student[] studentsList = new Student[] { new Student("Petrov P.P.", 111, new int[] { 7, 8, 10, 9, 5 }),
				new Student("Ivanov I.I.", 112, new int[] { 9, 8, 9, 10, 10 }),
				new Student("Popova A.A.", 402, new int[] { 9, 9, 9, 9, 10 }),
				new Student("Larin N.N.", 303, new int[] { 7, 7, 5, 6, 8 }),
				new Student("Vasilev S.S.", 404, new int[] { 9, 10, 9, 10, 9 }),
				new Student("Fomin F.A.", 400, new int[] { 10, 10, 10, 9, 10 }),
				new Student("Sidorov V.V.", 205, new int[] { 6, 6, 6, 7, 11 }),
				new Student("Litvin A.S.", 118, new int[] { 8, 8, 8, 9, 9 }),
				new Student("Korolev V.V.", 117, new int[] { 10, 10, 10, 10, 10 }),
				new Student("Smirnova L.I.", 112, new int[] { 9, 10, 10, 10, 10 }) };
		System.out.println(" << Students list with excellent performance >> ");
		Student.printBestMarks(studentsList);

	}
}
