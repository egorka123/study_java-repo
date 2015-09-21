package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести
на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        String s = null;
        int Summ = 0;
        Boolean flag = false;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        while (!(flag))
        {
            s = buf.readLine();
            int a = Integer.parseInt(s);
            Summ = Summ + a;
         //  System.out.print(Summ -1);
            flag = s.equals("-1");
        }
        System.out.print(Summ);




    }
}
