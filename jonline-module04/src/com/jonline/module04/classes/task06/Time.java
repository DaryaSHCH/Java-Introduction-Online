package com.jonline.module04.classes.task06;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;

		if (hour > 24) {
			this.hour = 0;
		}
		if (minute > 60) {
			this.minute = 0;
		}
		if (second > 60) {
			this.second = 0;
		}
	}

	public Time() {
		this.hour = 23;
		this.minute = 59;
		this.second = 59;
	}

	public void setHour(int hour) {
		if (hour > 24 || hour < 0) {
			this.hour = 0;
		} else {
			this.hour = hour;
		}
	}

	public int getHour() {
		return this.hour;
	}

	public void setMinute(int minute) {
		if (minute > 60 || minute < 0) {
			this.minute = 0;
		} else {
			this.minute = minute;
		}
	}

	public int getMinute() {
		return this.minute;
	}

	public void setSecond(int second) {
		if (second > 60 || second < 0) {
			this.second = 0;
		} else {
			this.second = second;
		}
	}

	public int getSecond() {
		return this.second;
	}

	public StringBuilder watchTime(int hour, int minute, int second) {
		StringBuilder sbTimeViewer = new StringBuilder("");

		String hourString = convert(hour);
		String minuteString = convert(minute);
		String secondString = convert(second);
		StringBuilder allTime = sbTimeViewer.append(hourString + ":" + minuteString + ":" + secondString);
		return allTime;
	}

	public String convert(int someTime) {
		String someTimeStr;

		if (someTime < 10) {
			someTimeStr = "0" + someTime;
			return someTimeStr;
		} else {
			someTimeStr = Integer.toString(someTime);
			return someTimeStr;
		}

	}

	public int checkTime(int someTime) {
		if (someTime > 24 && someTime > 60) {
			someTime = 0;
			return someTime;
		} else {
			return someTime;
		}
	}

}
