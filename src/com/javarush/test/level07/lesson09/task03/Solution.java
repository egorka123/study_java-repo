package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       ArrayList<String> str = new ArrayList<String>();
        str.add("мама");
        str.add("мыла");
        str.add("раму");
        String s = "именно";
        str.add(1,s);
        str.add(3,s);
        str.add(5,s);
        for (int i = 0; i < str.size(); i++) System.out.println(str.get(i));

    }
}
