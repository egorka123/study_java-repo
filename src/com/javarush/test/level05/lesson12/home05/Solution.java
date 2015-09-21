package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int Sum = 0;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                 // Boolean isExit = false;
        String ss = "сумма";
        String s = "0";
        while (!(s.equals(ss))){
            s = buf.readLine();
            if (s.equals(ss))
                break;
            else
            {
                int i = Integer.parseInt(s);
                Sum = Sum + i;
            }

        }
        System.out.println(Sum);
    }
}
