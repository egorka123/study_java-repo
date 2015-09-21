package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream w_file = new FileOutputStream(reader.readLine());
        FileInputStream fil2 = new FileInputStream(reader.readLine());
        FileInputStream fil3 = new FileInputStream(reader.readLine());

        byte[] buffer = new byte[fil2.available()];
        int bit2 = fil2.read(buffer);
        w_file.write(buffer,0,bit2);
        buffer = new byte[fil3.available()];
        int bit3 = fil3.read(buffer);
        w_file.write(buffer,0,bit3);

        w_file.close();
        fil2.close();
        fil3.close();
    }
}
