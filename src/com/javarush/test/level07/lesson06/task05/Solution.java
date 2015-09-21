package com.javarush.test.level07.lesson06.task05;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> str = new ArrayList<String>();
        BufferedReader rec = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) str.add(rec.readLine());
        String temp = "";
        for (int i = 0; i < 13; i++)
        {
          temp = str.get(str.size()-1);
          str.remove(str.size()-1);
          str.add(0, temp);
        }
        for (int i = 0; i < str.size(); i++) System.out.println(str.get(i));

    }
}
