package com.jonline.module01.lineal.task05;
/*
 * given number T - elapsed time in seconds;
 * output T in this  view: HHч MMмин SSс; 
 */

public class TaskFifth {
	static int secondsHours = 3600;
	static int minutesHours = 60;

	public static void main(String[] args) {

		int time;
		time = 30_000;

		int hours;
		int minutes;
		int seconds;

		hours = time / secondsHours;
		
		int hoursTosec;
		hoursTosec = hours * secondsHours;
		
		minutes = (time - hoursTosec) / minutesHours;
		
		int minutesToSec;
		minutesToSec = minutes * minutesHours;
		
		seconds = time - hoursTosec - minutesToSec;

		System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
	}

}
