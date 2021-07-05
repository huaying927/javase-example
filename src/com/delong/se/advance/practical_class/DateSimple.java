package com.delong.se.advance.practical_class;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.function.LongFunction;

public class DateSimple
{
    public void testDate ()
    {
        Date date = new Date();
        System.out.println("date = " + date);
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getDate() = " + date.getDate());
        System.out.println("date.getHours() = " + date.getHours());
        System.out.println("date.getMinutes() = " + date.getMinutes());
        System.out.println("date.getSeconds() = " + date.getSeconds());
        System.out.println("date.getDay() = " + date.getDay());
        System.out.println("date.getTime() = " + date.getTime());
        System.out.println("date.getTime() = " + date.getTime()/1000/60/60/24/365);
    }

    public void testDate2 ()
    {
        java.sql.Date date = new java.sql.Date(new java.util.Date().getTime());
        System.out.println("date = " + date);
        System.out.println("date.getTime() = " + date.getTime());

    }

    public void  testCalendar()
    {
        Calendar instance = Calendar.getInstance();
        System.out.println("instance = " + instance);
//        System.out.println("instance.getTime() = " + instance.getTime());

        System.out.println("instance.getCalendarType() = " + instance.getCalendarType());
        System.out.println("instance.getWeekYear() = " + instance.getWeekYear());
    }

    public void  testSimpleDateFormat()
    {
        Calendar instance = Calendar.getInstance();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");

        System.out.println("sdf.format(instance.getTime()) = " + sdf.format(instance.getTime()));
    }

    //i18n=internationalization
    public void testLocale()
    {
//        System.out.println("Locale.getDefault() = " + Locale.getDefault());

//        System.out.println("Locale.getISOCountries() = " + Arrays.toString(Locale.getISOCountries()));
//        System.out.println("Locale.getISOLanguages() = " + Arrays.toString(Locale.getISOLanguages()));

//        System.out.println("Arrays.toString(Locale.getAvailableLocales()) = " + Arrays.toString(Locale.getAvailableLocales()));

//        for (Locale availableLocale : Locale.getAvailableLocales())
//        {
//            System.out.println(availableLocale);
//        }

        System.out.println("Locale.CHINESE = " + Locale.CHINESE);
        System.out.println("Locale.CHINA = " + Locale.CHINA);
    }

    public void  testLocalDateByJDK8()
    {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        System.out.println("localDate.getDayOfYear() = " + localDate.getDayOfYear());
    }

    public void  testLocalTimeByJDK8()
    {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);
        System.out.println("localTime.getHour() = " + localTime.getHour());
        System.out.println("localTime.getSecond() = " + localTime.getSecond());
        System.out.println("localTime.getNano() = " + localTime.getNano());
    }

    public void  testLocalDateTimeByJDK8()
    {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime.getDayOfWeek() = " + localDateTime.getDayOfWeek());
        System.out.println("localDateTime.getSecond() = " + localDateTime.getSecond());

    }

    public void  testDateTimeFormatByJDK8()
    {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime parse = LocalDateTime.parse("2020-10-10 15:20:20", dateTimeFormatter);
        System.out.println("parse = " + parse);

        LocalDate parse2 = LocalDate.parse("2020-10-10 15:20:20", dateTimeFormatter);
        System.out.println("parse2 = " + parse2);

        LocalTime parse3 = LocalTime.parse("2020-10-10 15:20:20", dateTimeFormatter);
        System.out.println("parse3 = " + parse3);
    }

    public void testLongFunction()
    {
//        LongFunction<String> lf  =  new LongFunction<String>()
//        {
//            @Override
//            public String apply (long value)
//            {
//                return String.valueOf(value);
//            }
//        };
//
//        System.out.println("lf.apply(2L) = " + lf.apply(2L));

        LongFunction<String> lf  =  value -> String.valueOf(value);

        System.out.println("lf.apply(2L) = " + lf.apply(2L));

        if (lf.apply(2L) instanceof String)
        {
            System.out.println("\"string\" = " + "返回结果是字符串");
        }
    }
}
