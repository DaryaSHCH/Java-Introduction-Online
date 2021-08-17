package com.jonline.module04.classes.task05;

public class Counter {
	private int minimalValue;
	private int maximalValue;
	private int currentValue;

	public Counter() {
		this.minimalValue = 1;
		this.maximalValue = 9;
		this.currentValue = 5;
	}

	public Counter(int minimalValue, int maximalValue, int currentValue) {
		this.minimalValue = minimalValue;
		this.maximalValue = maximalValue;
		this.currentValue = currentValue;

		if (maximalValue < minimalValue) {
			int temporaryVariable = maximalValue;
			maximalValue = minimalValue;
			minimalValue = temporaryVariable;
		}
		if (currentValue < minimalValue) {
			currentValue = minimalValue;
		}
		if (currentValue > maximalValue) {
			currentValue = maximalValue;
		}

	}

	public void setMinimalValue(int minimalValue) {
		this.minimalValue = minimalValue;
	}

	public int getMinimalValue() {
		return this.minimalValue;
	}

	public void setMaximalValue(int maximalValue) {
		this.maximalValue = maximalValue;
	}

	public int getMaximalValue() {
		return this.maximalValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public int getCurrentValue() {
		return this.currentValue;
	}

	public int increaseValue() {
		if (currentValue > maximalValue) {
			currentValue = minimalValue;
			return currentValue;
		} else {
			currentValue++;
			return currentValue;

		}
	}

	public int reduceValue() {
		if (currentValue < minimalValue) {
			currentValue = maximalValue;
			return currentValue;
		} else {
			currentValue--;
			return currentValue;
		}
	}

	public int getCurrentVal() {
		return currentValue;
	}

}
