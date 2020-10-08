package com.jonline.module01.lineal.task04;
/*
 * swap the fractional and integer parts of a number;
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaskFourth {
	public static void main(String[] args) {
        
		double x = 567.128;

        double y = (int) x;
        double result;
        result = y / 1000 + (x - y) * 1000;
        
        BigDecimal result2 = new BigDecimal(result);

        System.out.println(result2.setScale(3, RoundingMode.DOWN));
    }
}
