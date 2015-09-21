package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть все потоки ввода-вывода
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName; String massFile="";
        while (!(fileName=reader.readLine()).equals("end")){
           massFile+=fileName+" ";
        } reader.close();
        massFile=massFile.substring(0,massFile.length()-1);
        String[] mFile = massFile.split(" ");
        Map<Integer, String> map_file = new TreeMap<Integer, String>();
        for (int i=0;i<mFile.length;i++){
            String tmpFile = mFile[i].substring(mFile[i].indexOf(".part")+5, mFile[i].length());
            map_file.put(Integer.parseInt(tmpFile), mFile[i]);
        }
        FileOutputStream file_out = new FileOutputStream(mFile[0].substring(0,mFile[0].indexOf(".part")));
        for (Map.Entry entry : map_file.entrySet()){
            FileInputStream file = new FileInputStream(String.valueOf(entry.getValue()));
            byte[] buffer = new byte[file.available()];
            int count = file.read(buffer);
            file_out.write(buffer,0,count);
            file.close();
            file_out.flush();
        }
        file_out.close();
    }
}
