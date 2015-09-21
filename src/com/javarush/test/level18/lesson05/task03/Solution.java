package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException, NullPointerException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        FileOutputStream file3 = new FileOutputStream(reader.readLine());


        if (file1.available() % 2 == 0)
        {
            int CelsPol = file1.available()/2;
            byte[] buffer = new byte[CelsPol];
            int con = file1.read(buffer, 0, CelsPol);
            file2.write(buffer, 0, con);
            buffer = new byte[CelsPol];
            con = file1.read(buffer, 0, CelsPol);
            file3.write(buffer, 0, con);
        }
        if (file1.available() % 2 == 1)
        {
            int CelsPolN = file1.available()/2+1;
            byte[] buffer = new byte[CelsPolN];
            int con = file1.read(buffer, 0, CelsPolN);
            file2.write(buffer, 0, con);
            buffer = new byte[CelsPolN];
            con = file1.read(buffer, 0, CelsPolN);
            file3.write(buffer, 0, con);
        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}