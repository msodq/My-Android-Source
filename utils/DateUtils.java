package com.msodq.androutils.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mohamadsodiq on 7/13/15.
 */
public class DateUtils {

    //sample format that u can use
    public static final String FORMAT_ddMMyyyyHHmmZ = "dd-MM-yyyy HH:mm Z";
    public static final String FORMAT_yyyyMMddHHmmssz = "yyyy-MM-dd HH:mm:ss z";
    public static final String FORMAT_ddMMMMyyyyhhmmaa = "dd MMMM yyyy, hh:mm aa";
    public static final String FORMAT_cddMMMyyyyHHmm = "c dd MMM yyyy, HH:mm";
    public static final String FORMAT_cddMMMyyyy = "c dd MMM yyyy";

    public static String formatDateFromString(String date, String oldFormat, String newFormat) {
        String textNewDate = "";
        DateFormat df = new SimpleDateFormat(oldFormat, Locale.US);
        DateFormat dfNew = new SimpleDateFormat(newFormat, Locale.US);
        try {
            Date newDate = df.parse(date);
            textNewDate = dfNew.format(newDate);
        } catch (ParseException ignored) {
        }
        return textNewDate;
    }

    public static Date getDateFromString(String date, String format) {
        DateFormat df = new SimpleDateFormat(format, Locale.US);
        Date convertedDate = new Date();
        try {
            convertedDate = df.parse(date);
        } catch (ParseException ignored) {
        }
        return convertedDate;
    }

    public static String getDateNow(String format) {
        DateFormat df = new SimpleDateFormat(format, Locale.US);
        return df.format(new Date());
    }

    public static String getMonth(int index) {
        switch (index) {
            case Calendar.JANUARY:
                return "JANUARY";
            case Calendar.FEBRUARY:
                return "FEBRUARY";
            case Calendar.MARCH:
                return "MARCH";
            case Calendar.APRIL:
                return "APRIL";
            case Calendar.MAY:
                return "MAY";
            case Calendar.JUNE:
                return "JUNE";
            case Calendar.JULY:
                return "JULY";
            case Calendar.AUGUST:
                return "AUGUST";
            case Calendar.SEPTEMBER:
                return "SEPTEMBER";
            case Calendar.OCTOBER:
                return "OCTOBER";
            case Calendar.NOVEMBER:
                return "NOVEMBER";
            case Calendar.DECEMBER:
                return "DECEMBER";
        }
        return "";
    }
}
