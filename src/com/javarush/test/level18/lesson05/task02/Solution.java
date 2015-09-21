package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки ввода-вывода

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        byte[] buffer = new byte[fileReader.available()];
        while (fileReader.available()>0){
            fileReader.read(buffer);
        }
        int count = 0;
        for (int i=0;i<buffer.length;i++){
            if (buffer[i]==44) count++;
        }
        System.out.println(count);
        reader.close();
        fileReader.close();
    }
}
