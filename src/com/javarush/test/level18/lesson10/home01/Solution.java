package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки
*/


import java.io.FileInputStream;
import java.io.IOException;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        int count = 0; int sim;

        FileInputStream file = new FileInputStream(args[0]);

        while (file.available()>0){
            sim = file.read();
            for (int i=65;i<91;i++){
               if (sim==i) count++;
            }
            for (int i=97;i<123;i++){
                if (sim==i) count++;
            }
        }
        System.out.println(count);
        file.close();

    }
}
