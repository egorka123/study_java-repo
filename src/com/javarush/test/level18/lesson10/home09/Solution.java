package com.javarush.test.level18.lesson10.home09;

/* Файлы и исключения
Читайте с консоли имена файлов
Если файла не существует (передано неправильное имя файла), то
перехватить исключение, вывести в консоль переданное неправильное имя файла и завершить работу программы
Не забудьте закрыть все потоки
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file = null;
        String s = reader.readLine();
       try
       {
           while (true)
           {
               file = new FileInputStream(s);
               s = reader.readLine();
           }
       } catch (FileNotFoundException e){
           System.out.println(s);
           reader.close();
           file.close();
       }


        file.close();
    }
}
