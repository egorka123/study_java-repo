package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Egor on 24.04.2015.
 */
public class RussianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 150;
    }

    public String getDescription()
    {
       return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.RUSSIA, getCountOfEggsPerMonth());
    }
}
