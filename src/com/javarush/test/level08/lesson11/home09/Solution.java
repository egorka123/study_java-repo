package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        isDateOdd("MAY 1 2015");
    }

    public static boolean isDateOdd(String date)
    {
       Date dat1 = new Date();
        Date dat2 = new Date(date);
        dat1.setHours(0);
        dat1.setMinutes(0);
        dat1.setSeconds(0);
        dat1.setDate(1);
        dat1.setMonth(0);
        long mst = dat2.getTime() - dat1.getTime();
        long day = 24*60*60*1000;
        int y = (int)(mst/day);



        return (y % 2 == 0);
    }
}
