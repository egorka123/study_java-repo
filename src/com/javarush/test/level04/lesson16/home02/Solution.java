package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader buf  = new BufferedReader(new InputStreamReader(System.in));
        String s_a = buf.readLine();
        String s_b = buf.readLine();
        String s_c = buf.readLine();
        int a = Integer.parseInt(s_a);
        int b = Integer.parseInt(s_b);
        int c = Integer.parseInt(s_c);
        int Min = 0;
        if (((a > b)&&(a < c))||((a < b)&&(a > c)))
        {
        Min = a;
        }
        if (((b > a)&&(b < c))||((b < a)&&(b > c)))
        {
        Min = b;
        }
        if (((c > a)&&(c < b))||((c < a)&&(c > b)))
        {
        Min = c;
        }




          System.out.println(Min);
    }
}
