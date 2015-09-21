package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Сталлоне1", new Date("JUNE 1 1980"));
        map.put("Сталлоне2", new Date("JUNE 1 1980"));
        map.put("Сталлоне3", new Date("JUNE 1 1980"));
        map.put("Сталлоне4", new Date("JUNE 1 1980"));
        map.put("Сталлоне5", new Date("JUNE 1 1980"));
        map.put("Сталлоне6", new Date("JUNE 1 1980"));
        map.put("Сталлоне7", new Date("JUNE 1 1980"));
        map.put("Сталлоне8", new Date("JUNE 1 1980"));
        map.put("Сталлоне9", new Date("JUNE 1 1980"));
        return  map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Date> pair = iterator.next();
            int value = pair.getValue().getMonth();
            if ((value > 4) && (value < 8))
                iterator.remove();

        }

    }
}
