package com.jonline.module04.classes.task04;

import java.time.LocalTime;

public class Train {
	private int trainNumber;
	private String destination;
	private LocalTime departureTime;

	public Train(String destination, int trainNumber) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = LocalTime.of(1, 30);
	}

	public Train(String destination, int trainNumber, int hour, int min) {
		this.destination = destination;
		this.trainNumber = trainNumber;
		this.departureTime = LocalTime.of(hour, min);
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public int getTrainNumber() {
		return this.trainNumber;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDepartureTime(int hour, int min) {
		this.departureTime = LocalTime.of(hour, min);
	}

	public LocalTime getDepartureTime() {
		return this.departureTime;
	}

}
