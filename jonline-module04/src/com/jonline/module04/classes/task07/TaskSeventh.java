package com.jonline.module04.classes.task07;

/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
 */
public class TaskSeventh {
	public static void main(String[] args) {

		Triangle triangle = new Triangle(new Point(1, 3), new Point(3, 6), new Point(3, 4));
		
		System.out.printf("Perimeter of this triangle = %.2f \n", Triangle.getPerimeter(triangle));
		System.out.printf("Area of triangle = %.2f \n", Triangle.getArea(triangle));
		System.out.println("Point of median intersection " + Triangle.getMedianIntersectionPoint(triangle));
	}
}
