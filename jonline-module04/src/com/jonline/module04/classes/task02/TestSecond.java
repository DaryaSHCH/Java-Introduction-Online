package com.jonline.module04.classes.task02;

public class TestSecond {

	private int length;
	private int weight;

	public TestSecond(int length, int weight) {
		this.length = length;
		this.weight = weight;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return this.length;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWeight() {
		return this.weight;
	}

	public String toString() {
		return "(length = " + length + ", weight = " + weight + ")";
	}
}
