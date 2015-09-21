package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Egor on 26.04.2015.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    public String getCurrencyName()
    {
        return "USD";
    }
}
