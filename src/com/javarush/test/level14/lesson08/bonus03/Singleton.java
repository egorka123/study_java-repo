package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Egor on 27.04.2015.
 */
public class Singleton
{
    private static final Singleton Sing = new Singleton();

    private Singleton()
    {}

    public static Singleton getInstance()
    {
        return Sing;
    }
}
