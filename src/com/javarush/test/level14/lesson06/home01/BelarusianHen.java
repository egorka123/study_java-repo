package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Egor on 24.04.2015.
 */
public class BelarusianHen extends Hen
{
    public int getCountOfEggsPerMonth()
    {
        return 120;
    }

    public String getDescription()
    {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), Country.BELARUS, getCountOfEggsPerMonth());
    }

}
