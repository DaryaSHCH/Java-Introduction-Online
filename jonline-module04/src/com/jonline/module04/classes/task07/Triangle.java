package com.jonline.module04.classes.task07;

public class Triangle {
	private int sideA;
	private int sideB;
	private int sideC;
    
	public Triangle(int sideA, int sideB, int sideC) {
		this.sideA = sideA; 
		this.sideB = sideB;
		this.sideC = sideC; 
	}
	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideA() {
		return this.sideA;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	public int getSideB() {
		return this.sideB;
	}

	public void setSideC(int sideC) {
		this.sideC = sideC;
	}

	public int getSideC() {
		return sideC;
	}
	
	public int findPerimeter(int sideA, int sideB, int sideC) {
		return this.sideA + this.sideB + this.sideC; 
	}
	
	public double findArea(int sideA, int sideB, int sideC) {
		float p; 
	    p = (this.sideA + this.sideB + this.sideC)/2;
        return Math.sqrt(p * (p - this.sideA)* (p - this.sideB)*(p - this.sideC));
	}

}
