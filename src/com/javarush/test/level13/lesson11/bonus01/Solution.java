package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String File = reader.readLine();
        BufferedReader InFile = new BufferedReader(new FileReader(File));
        ArrayList<Integer> outFile = new ArrayList<Integer>();

        String st = InFile.readLine();
        while (st!=null){
            outFile.add(Integer.parseInt(st));
            st=InFile.readLine();
        }
        InFile.close();
        reader.close();

        Iterator<Integer> itr = outFile.iterator();
        while (itr.hasNext())
        {
            if (itr.next()%2 != 0) itr.remove();
        }

        for (int j=0;j<outFile.size();j++){
            for (int i=0;i<outFile.size();i++){
                if (outFile.get(j) < outFile.get(i))
                {
                    int k = outFile.get(j);
                    outFile.set(j, outFile.get(i));
                    outFile.set(i, k);
                }
            }
        }
        for (int i=0;i<outFile.size();i++)
        {
            System.out.println(outFile.get(i));
        }
    }
}
