package com.jonline.module04.classes.task06;

public class Time {
    // установка времени
	// изменение отдельных полей(час, минута, секунда) 
	// проверка допустимости вводимых значений
	//                                 неверное значение = 0;
	// изменение на опр.часы, минуты, секунды.
	
	private int hour;
	private int minute; 
	private int second; 
	
	public void setHour(int hour) {
		this.hour = hour; 
	}
	public int getHour() {
		return this.hour; 
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getMinute() {
		return this.minute; 
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public int getSecond() {
		return this.second; 
	}
}
