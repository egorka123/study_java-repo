package com.javarush.test.level08.lesson03.task02;

/* HashMap из 10 пар
Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень,
земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
картофель – клубень
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{


    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        HashMap<String, String> mk = new HashMap<String, String>();
        mk.put("арбуз","ягода");
        mk.put("банан","трава");
        mk.put("вишня","ягода");
        mk.put("груша","фрукт");
        mk.put("дыня","овощ");
        mk.put("ежевика","куст");
        mk.put("жень-шень","корень");
        mk.put("земляника","ягода");
        mk.put("ирис","цветок");
        mk.put("картофель","клубень");

        for (Map.Entry<String, String> text : mk.entrySet())
        {
            String key = text.getKey();
            String value = text.getValue();
            System.out.println(key + " - " + value);
        }

    }
}
