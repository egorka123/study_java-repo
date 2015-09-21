package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file_r = new FileReader(reader.readLine());
        FileWriter file_w = new FileWriter(reader.readLine());
        int i = 1;
        while (file_r.ready()){
            int bit = file_r.read();
            if (i%2==0) file_w.write(bit);
            i++;
        }
        file_r.close();
        file_w.close();
    }
}
