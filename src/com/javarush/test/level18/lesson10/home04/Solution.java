package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String w_file = reader.readLine();

        FileInputStream r_file_2 = new FileInputStream(reader.readLine());
        FileInputStream tmp = new FileInputStream(w_file);
        byte[] bytes = new byte[tmp.available()];
        int count_a = tmp.read(bytes);
        tmp.close();

        FileOutputStream w_file_1 = new FileOutputStream(w_file);
        byte[] buffer = new byte[r_file_2.available()];
        int count = r_file_2.read(buffer);
        w_file_1.write(buffer,0,count);
        w_file_1.write(bytes,0, count_a);

        r_file_2.close();
        w_file_1.close();
    }
}
