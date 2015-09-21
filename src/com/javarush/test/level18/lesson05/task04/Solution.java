package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fil1 = new FileInputStream(reader.readLine());
        FileOutputStream fil2 = new FileOutputStream(reader.readLine());
            byte[] buffer = new byte[fil1.available()]; int len = 0;
        while (fil1.available()>0){
            len = fil1.read(buffer);
        }
        int i = buffer.length-1;
        while (i!=-1){
               fil2.write(buffer[i]);
            i--;
        }
        reader.close();
        fil1.close();
        fil2.close();
    }
}
