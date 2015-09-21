package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.

В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<String, Double>();
        while (file.ready())
        {
           String str = file.readLine();
            String[] buf = str.split(" ");
            String name = buf[0]; double pay = Double.parseDouble(buf[1]);

            if (!map.containsKey(name)) map.put(name, pay);
                else if (map.containsKey(name))
                    map.put(name, pay + Double.parseDouble(String.valueOf(map.get(name))));

        }
        file.close();



        for (Map.Entry pair : map.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }

    }

}
