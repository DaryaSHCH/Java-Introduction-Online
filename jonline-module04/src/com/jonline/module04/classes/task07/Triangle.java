package com.jonline.module04.classes.task07;

public class Triangle {
	private final Point a;
	private final Point b;
	private final Point c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}

	private void checkCoordinates(Point a, Point b, Point c) {
		if (a == null || b == null || c == null) {
			System.out.println("Point mustn't be null");
			throw new IllegalArgumentException();
		}
		double sideA = a.findDistanceBetweenPoints(b);
		double sideB = b.findDistanceBetweenPoints(c);
		double sideC = a.findDistanceBetweenPoints(c);

		if (sideA * sideB * sideC == 0 || sideA + sideB <= sideC || sideA + sideC <= sideB) {
			System.out.println("Incorrect coordinates of the vertices of the triangle");
			throw new IllegalArgumentException();
		}
	}

	public static double getSideAB(Triangle triangle) {
		return triangle.getA().findDistanceBetweenPoints(triangle.getB());
	}

	public static double getSideBC(Triangle triangle) {
		return triangle.getB().findDistanceBetweenPoints(triangle.getC());
	}

	public static double getSideAC(Triangle triangle) {
		return triangle.getB().findDistanceBetweenPoints(triangle.getC());
	}

	public static double getPerimeter(Triangle triangle) {
		return getSideAB(triangle) + getSideAC(triangle) + getSideBC(triangle);
	}

	public static double getArea(Triangle triangle) {
		double p = getPerimeter(triangle) / 2; // полупериметр;
		return Math.sqrt(p * (p - getSideAB(triangle)) * (p - getSideBC(triangle)) * (p - getSideAC(triangle)));
	}

	@Override
	public int hashCode() {
		int result = a != null ? a.hashCode() : 0;
		result = 31 * result + (b != null ? b.hashCode() : 0);
		result = 31 * result + (c != null ? c.hashCode() : 0);
		return result;
	}

	public static Point getMedianIntersectionPoint(Triangle triangle) {
		Point point;
		double xABC = (triangle.getA().getX() + triangle.getB().getX() + triangle.getC().getX()) / 3;
		double yABC = (triangle.getA().getY() + triangle.getB().getY() + triangle.getC().getY()) / 3;
		point = new Point(xABC, yABC);
		return point;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Triangle triangle = (Triangle) obj;

		if (a != null ? !a.equals(triangle.a) : triangle.a != null) {
			return false;
		}
		if (b != null ? !b.equals(triangle.b) : triangle.b != null) {
			return false;
		}
		return c != null ? c.equals(triangle.c) : triangle.c == null;

	}

	@Override
	public String toString() {
		return "Triangle (" + "a = " + a + ", b = " + b + ", c = " + c + ')';
	}

}

