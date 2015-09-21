package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id

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


public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader file = new BufferedReader(new FileReader(fileName));
        if (args[0].equals("-c")){
            int max = 0;
            ArrayList<String> buffer = new ArrayList<String>();
            StringBuilder line = new StringBuilder();
            while (file.ready()){
               line.append(file.readLine());
               buffer.add(line.toString());
               line.delete(0,line.length());
            }  file.close();

                for (int i=0;i<buffer.size();i++){
                System.out.println(buffer.get(i));
                String temp = buffer.get(i).substring(0,8).trim();
                int id = Integer.parseInt(temp);
                if (id>max) max = id;
                }
            max++;
            BufferedWriter wFile = new BufferedWriter(new FileWriter(fileName));
            String ID = String.valueOf(max); String pName = args[1]; String price=args[2];String count=args[3];
            for (int i=0;i<30-args[1].length();i++) pName+=" ";
            for (int i=0;i<8-args[2].length();i++) price+=" ";
            for (int i=0;i<4-args[3].length();i++) count+=" ";
            for (int i=0;i<8-ID.length();i++) ID+=" ";
            String result = ID+pName+price+count;
            buffer.add(result);
            for (int i=0;i<buffer.size();i++){
            wFile.write(buffer.get(i));
                wFile.newLine();
           }
            wFile.close();
        }
    }
}
