package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
   /* public static void main(String[] args) throws Exception
    {
        HashMap<String, String> ww = createMap();
        removeTheFirstNameDuplicates(ww);
        System.out.println(ww);
    } */


    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("nmae1","fam1");
        map.put("nmae2","fam2");
        map.put("nmae3","fam2");
        map.put("nmae4","fam4");
        map.put("nmae5","fam5");
        map.put("nmae6","fam6");
        map.put("nmae7","fam6");
        map.put("nmae8","fam8");
        map.put("nmae9","fam9");
        map.put("nmae0","fam0");
        return  (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
       /* ArrayList<String> copy = new ArrayList<String>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
           Map.Entry<String, String> som = iterator.next();
           copy.add(som.getValue());
        }

        for (int j = 0; j < copy.size(); j++)
        {
            int f = 0;
            while (iterator.hasNext())
              {
                  Map.Entry<String, String> som = iterator.next();
                  if (som.getValue().equals(copy.get(j))&& (f == 0))
                      f++;
                  else if (som.getValue().equals(copy.get(j))&& (f > 0))
                          removeItemFromMapByValue(map,copy.get(j));



              }

        } */
        ArrayList<String> st = new ArrayList<String>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            st.add(pair.getValue());
        }
       // System.out.println(st);
        for (int i = 0; i < st.size(); i++)
        {
            int k = 0; String tem = st.get(i);
            for (int j = 1; j < st.size(); j++)
            {
                if (tem.equals(st.get(j))&(k == 0))
                 k++;
                else if (tem.equals(st.get(j))&(k > 0))
                 removeItemFromMapByValue(map, tem);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
        System.out.println(map);
    }
}
