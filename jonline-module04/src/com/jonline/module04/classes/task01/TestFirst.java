package com.jonline.module04.classes.task01;

public class TestFirst {

	private int length;
	private int width;

	public void printVarFromTest(int length, int width) {
		System.out.println(length + ", " + width);
	}

	public int findSumVar() {
		return length + width;
	}

	public int findGreatestVar() {
		if (length > width) {
			return length;
		} else {
			return width;
		}
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return this.length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWidth() {
		return this.width;
	}
}
