package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        int N = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());
        if (N > 0)
        {
            int[] i = new int[N];
          for(int j = 0; j < N-1; j++)
            {
               i[j] = Integer.parseInt(reader.readLine());
               if (i[j] > maximum)
                    maximum = i[j];

            }

        }

        if (N > 0)
            System.out.println(maximum);
    }
       }
