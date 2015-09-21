package com.javarush.test.level08.lesson08.task02;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> num = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
        {
            num.add(i);
        }
       return num;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator i = set.iterator();
        while (i.hasNext())
        {
            Object a = i.next();
            String buf = a.toString();
            if (Integer.parseInt(buf) > 10) i.remove();
        }
             return set;

    }
}
