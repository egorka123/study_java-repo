package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Boolean isExit = false;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String name = buf.readLine();
        String s_y = buf.readLine();
        String s_m = buf.readLine();
        String s_d = buf.readLine();

        int y = Integer.parseInt(s_y);
        int m = Integer.parseInt(s_m);
        int d = Integer.parseInt(s_d);

        System.out.println("Меня зовут "+name);
        System.out.println("Я родился "+ d+"."+m+"."+y);

    }
}
