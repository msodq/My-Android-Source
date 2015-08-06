package com.msodq.androutils.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mohamadsodiq on 7/13/15.
 */
public class DateUtils {

    public static String formatDateDefault(String date) {
        String textNewDate = "";
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        DateFormat dfNew = new SimpleDateFormat("dd MMMM yyyy, hh:mm aa");
        try {
            Date newDate = df.parse(date);
            textNewDate = dfNew.format(newDate);
        } catch (ParseException e) {

        }
        return textNewDate;
    }
}
