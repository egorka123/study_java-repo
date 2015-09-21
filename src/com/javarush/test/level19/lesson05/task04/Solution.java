package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        String str = "";
        FileWriter fileWriter = new FileWriter(reader.readLine());
        while (file.ready()){
           str+=file.readLine();
        }
        fileWriter.write(str.replace(".","!"));
        reader.close();
        file.close();
        fileWriter.close();
    }
}
