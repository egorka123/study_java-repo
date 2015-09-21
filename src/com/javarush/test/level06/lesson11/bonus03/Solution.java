package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int temp = 0;

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        for (int i = 0; i < 5; i++)
        {
            a[i] = Integer.parseInt(reader.readLine());

        }

        for (int i = 1; i < 5; i++)
            for (int j = a.length - 1; j >= i; j--){
                {
                    if (a[j-1] > a[j])
                    {
                        temp = a[j - 1];
                        a[j - 1] = a[j];
                        a[j] = temp;
                    }
                }
        }
        for (int i = 0; i < 5; i++){
            System.out.println(a[i]);
        }

    }
}
