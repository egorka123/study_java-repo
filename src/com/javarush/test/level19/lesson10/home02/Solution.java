package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> map = new HashMap<String, Double>();
        while (file.ready()){
            String[] str = file.readLine().split(" ");

                if (!map.containsKey(str[0])) map.put(str[0], Double.valueOf(str[1]));
                else if (map.containsKey(str[0])) map.put(str[0], map.get(str[0]) + Double.valueOf(str[1]));


        }
        file.close(); Double max = 0.0;
        for (Map.Entry<String, Double> pair:map.entrySet()){
            if (pair.getValue()>max) max=pair.getValue();
        }
        for (Map.Entry<String, Double> pair:map.entrySet()){
            if (max==pair.getValue()) System.out.println(pair.getKey());
        }

    }
}
