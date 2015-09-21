package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        Map<Byte, Integer> Base = new TreeMap<Byte, Integer>();
        FileInputStream file = new FileInputStream(args[0]);
        byte[] bit = new byte[file.available()];
        file.read(bit);
        file.close();
        ArrayList<Byte> arrayList = new ArrayList<Byte>();
        for (int i=0;i<bit.length;i++){
            arrayList.add(bit[i]);
        }
        for (int i=0;i<arrayList.size();i++){
           int count = Collections.frequency(arrayList, arrayList.get(i));
           Base.put(arrayList.get(i), count);
        }
        Object count=0;
        Object b=0;
        byte d=0;
        for (Map.Entry entry : Base.entrySet())
        {
            count = entry.getValue(); b = entry.getKey(); d = Byte.valueOf((Byte) b);
            System.out.println(Character.valueOf((char) d) + " " + count);
        }

    }
}
