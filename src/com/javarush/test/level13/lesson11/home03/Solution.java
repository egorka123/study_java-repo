package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here
        String nameFile;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        nameFile = reader.readLine();
        InputStream infile = new FileInputStream(nameFile);

        while (infile.available()>0)
        {
            int data = infile.read();
            System.out.print((char) data);
        }

        infile.close();

    }
}
