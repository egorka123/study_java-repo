package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader rec = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList<String>();

        for (int i = 0; i < 5; i++) str.add(rec.readLine());
        for (int i = str.size()-1; i > -1; i--) System.out.println(str.get(i));

    }
}
