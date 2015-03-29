package fr.nantes.miage.reservation;

/**
 * Created by E14D247Q on 10/04/15.
 */

import java.util.Calendar;
import java.util.Date;

public class EasyDate {

    public static Date makeDate(int day, int month, int year, int hour) {

        Calendar cal = Calendar.getInstance();

        switch (month) {
            case 1:
                cal.set(Calendar.MONTH, Calendar.JANUARY);
                break;

            case 2:
                cal.set(Calendar.MONTH, Calendar.FEBRUARY);
                break;

            case 3:
                cal.set(Calendar.MONTH, Calendar.MARCH);
                break;

            case 4:
                cal.set(Calendar.MONTH, Calendar.APRIL);
                break;

            case 5:
                cal.set(Calendar.MONTH, Calendar.MAY);
                break;

            case 6:
                cal.set(Calendar.MONTH, Calendar.JUNE);
                break;

            case 7:
                cal.set(Calendar.MONTH, Calendar.JULY);
                break;

            case 8:
                cal.set(Calendar.MONTH, Calendar.AUGUST);
                break;

            case 9:
                cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
                break;

            case 10:
                cal.set(Calendar.MONTH, Calendar.OCTOBER);
                break;

            case 11:
                cal.set(Calendar.MONTH, Calendar.NOVEMBER);
                break;

            case 12:
                cal.set(Calendar.MONTH, Calendar.DECEMBER);
                break;
        }

        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR, hour);

        return cal.getTime();

    }

}