package com.jonline.module04.classes.task07;

public class Point {
	private final double x;
	private final double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double findDistanceBetweenPoints(Point point) {
		return Math.sqrt((Math.pow((point.getX() - this.x), 2) + Math.pow((point.getY() - this.y), 2)));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Point point = (Point) obj;

		if (Double.compare(point.x, x) != 0) {
			return false;
		} else {
			return Double.compare(point.y, y) == 0;
		}

	}

	@Override
	public String toString() {
		return "Point(" + "x = " + x + ", y = " + y + ')';
	}

	@Override
	public int hashCode() {
		int resultCode;
		long temporaryVal;
		temporaryVal = Double.doubleToLongBits(x);
		resultCode = (int) (temporaryVal ^ (temporaryVal >>> 32));
		temporaryVal = Double.doubleToLongBits(y);
		resultCode = 31 * resultCode + (int) (temporaryVal ^ (temporaryVal >>> 32));
		return resultCode;

	}

}
