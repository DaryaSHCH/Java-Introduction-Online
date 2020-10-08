package com.jonline.module01.loop.task06;

public class TaskSixth {
	public static  void main (String [] args) {
		
		int lenght = 65535; 
        
		for (int i = 0; i <= lenght; i++) {
            System.out.println( "Символ - " + (char) i + "\n его числовое обозначение - " + i);
        }
	}
}

