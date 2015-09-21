package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader file = new BufferedReader(new FileReader(fileName));
        if (args[0].equals("-u")){
            ArrayList<String> buffer = new ArrayList<String>();
            StringBuilder sb = new StringBuilder();
            while (file.ready()){
                sb.append(file.readLine());
                buffer.add(sb.toString());
                sb.delete(0, sb.length());
            }   file.close();

            String ID = args[1]; String pName = args[2]; String price=args[3];String count=args[4];
            for (int i=0;i<30-args[2].length();i++) pName+=" ";
            for (int i=0;i<8-args[3].length();i++) price+=" ";
            for (int i=0;i<4-args[4].length();i++) count+=" ";
            for (int i=0;i<8-args[1].length();i++) ID+=" ";
            String result = ID+pName+price+count;


            for (int i=0;i<buffer.size();i++){
                if (buffer.get(i).substring(0,8).trim().equals(args[1])){

                    buffer.set(i, result);
                }
            }
            BufferedWriter wFile = new BufferedWriter(new FileWriter(fileName));
            for (int i=0;i<buffer.size();i++){
                wFile.write(buffer.get(i));
                wFile.newLine();
            }
            wFile.close();

        }
        if (args[0].equals("-d")){
            ArrayList<String> buffer = new ArrayList<String>();
            StringBuilder sb = new StringBuilder();
            while (file.ready()){
                sb.append(file.readLine());
                buffer.add(sb.toString());
                sb.delete(0, sb.length());
            }   file.close();

            ListIterator<String> iter = buffer.listIterator();
            while (iter.hasNext())
            {
                if (iter.next().substring(0,8).trim().equals(args[1])){
                   iter.remove();
                }
            }

            BufferedWriter wFile = new BufferedWriter(new FileWriter(fileName));
            for (int i=0;i<buffer.size();i++){
                wFile.write(buffer.get(i));
                wFile.newLine();
            }
            wFile.close();
        }
    }
}
