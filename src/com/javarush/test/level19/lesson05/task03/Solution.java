package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки ввода-вывода.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        FileWriter fileWrite = new FileWriter(reader.readLine());
        String SB = "";
        while (fileReader.ready()){
          SB+=fileReader.readLine();
        }
        String[] buffer = SB.replaceAll("\\p{Punct}"," ").split(" ");
        String result="";
        for (int i=0;i<buffer.length;i++){
            boolean flag = true;
            char[] sh = buffer[i].toCharArray();
            for (int j=0;j<sh.length;j++){
                if (!(Character.isDigit(sh[j]))) flag = false;
            }
            if (flag == true) result+=buffer[i]+" ";
        }
        result=result.substring(0,result.length()-1);
        fileWrite.write(result);
        fileReader.close();
        fileWrite.close();
    }
}
