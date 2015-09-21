package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        String name ="";
        while (file.ready()){
            name = "";
            String[] buf = file.readLine().split(" ");
            Calendar calendar = new GregorianCalendar();
            calendar.set(Integer.parseInt(buf[buf.length-1]),Integer.parseInt(buf[buf.length-2])-1,Integer.parseInt(buf[buf.length-3]));
              for (int i=0;i<buf.length-3;i++) name +=buf[i]+" ";
              name = name.substring(0,name.length()-1);
              PEOPLE.add(new Person(name, calendar.getTime()));
            }

    }
    }

