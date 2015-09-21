package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
javarush.ru/alpha/index.html?lvl=15&??view&&&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&&?oobj=3.0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();
        String paramStr1 = URL.substring(URL.indexOf("?")+1, URL.length());
        reader.close();
        String paramStr2 = "";
        char[] ch = paramStr1.toCharArray();
        for (int i = 0; i < ch.length;i++)
        {
            if (ch[i]!='?')
                paramStr2 = paramStr2 + ch[i];
        }
        String[] parametrsWithValues = paramStr2.split("&");
        ArrayList<String> tot = new ArrayList<String>();
        for (int i = 0;i < parametrsWithValues.length;i++){
           if (!parametrsWithValues[i].isEmpty())
               tot.add(parametrsWithValues[i]);
        }
        for (String par : tot) {
            if (par.contains("=")) {
                System.out.print(par.substring(0, par.indexOf("=")) + " ");
            }
            else System.out.print(par + " ");
        }
        System.out.println();
        for (String par : tot) {
            if (par.startsWith("obj=")) {
                String value = par.substring(par.indexOf("=") + 1, par.length());
                try {
                    double doublevalue = Double.parseDouble(value);
                    alert(doublevalue);
                }
                catch (Exception c) {
                    alert(value);
                }
            }
        }
    }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
