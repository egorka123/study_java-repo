package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.nio.charset.Charset;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outStr = new FileOutputStream(reader.readLine());

        String St = reader.readLine();
        while (true)
        {
            outStr.write((St + System.lineSeparator()).getBytes());
            if (St.compareTo("exit")==0) break;
            St = reader.readLine();
        }
        outStr.close();
    }
}
