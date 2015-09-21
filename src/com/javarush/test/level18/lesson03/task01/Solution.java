package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file_max = new FileInputStream(reader.readLine());

        int value;
        int max = Integer.MIN_VALUE;
        while (file_max.available()>0){
           value = file_max.read();
            if (value > max) max = value;
        }
        System.out.println(max);
        reader.close();
        file_max.close();
    }
}
