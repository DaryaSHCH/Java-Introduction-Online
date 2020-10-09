package com.jonline.module01.lineal.task05;
/*
 * given number T - elapsed time in seconds;
 * output T in this  view: HHч MMмин SSс; 
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class TaskFifth {
	public static void main(String[] args) {
        int timeSeconds = 300000000;

        final SimpleDateFormat dateFormat = new SimpleDateFormat("HHч mmмин ssс");
        final TimeZone timeZone = TimeZone.getTimeZone("UTC");
        dateFormat.setTimeZone(timeZone);

        final long timeMillis = TimeUnit.SECONDS.toMillis(timeSeconds);

        final Date date = new Date(timeMillis);

        final String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);
    }

}
