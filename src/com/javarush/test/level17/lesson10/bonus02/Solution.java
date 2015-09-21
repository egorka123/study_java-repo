package com.javarush.test.level17.lesson10.bonus02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException
    {
        //start here - начни тут
            if (args.length!=0)
            {
                if ((args[0].equals("-c")))
                {
                    Creation(args);
                } else if ((args[0].equals("-u")))
                {
                    Updates(args);
                } else if ((args[0].equals("-d")))
                {
                    Deletes(args);
                } else if ((args[0].equals("-i")))
                {
                    Inform(args);
                }
            } else {System.out.println("Not argument");}
        }

        private static synchronized void Creation(String[] args) throws ParseException
        {
            for (int i = 1;i<args.length;i++)
            {
            SimpleDateFormat datB = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            Date dat = datB.parse(args[i+2]);
            if (args[i+1].equals("м")) allPeople.add(Person.createMale(args[i], dat));
            if (args[i+1].equals("ж")) allPeople.add(Person.createFemale(args[i], dat));
            System.out.println(allPeople.size()-1);
                i=i+2;
            }
        }

        private static synchronized void Updates(String[] args) throws ParseException
        {
            for (int i=1;i<args.length;i++)
            {
                SimpleDateFormat datB = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
                Date dat = datB.parse(args[i+3]);
                int id = Integer.parseInt(args[i]);
                allPeople.get(id).setName(args[i+1]);
                if (args[i+2].equals("м")) allPeople.get(id).setSex(Sex.MALE);
                else if (args[i+2].equals("ж")) allPeople.get(id).setSex(Sex.FEMALE);
                allPeople.get(id).setBirthDay(dat);
                i=i+3;
            }
        }

        private static synchronized void Deletes(String[] args)
        {
           for (int i=1;i<args.length;i++)
           {
            int id = Integer.parseInt(args[i]);
            allPeople.get(id).setName(null);
            allPeople.get(id).setSex(null);
            allPeople.get(id).setBirthDay(null);
           }
        }

        private static void Inform(String[] args)
        {
            String Pol="not sex";
            for (int i=1;i<args.length;i++)
            {
            if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.MALE)){
                Pol = "м"; } else if (allPeople.get(Integer.parseInt(args[i])).getSex().equals(Sex.FEMALE)){
                Pol = "ж";
            }
            int id = Integer.parseInt(args[i]);
            String name = allPeople.get(Integer.parseInt(args[i])).getName();
            SimpleDateFormat tmpDat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String dat = tmpDat.format(allPeople.get(id).getBirthDay());
            System.out.println(name+ " "+Pol+" "+ dat);
            }
        }

    }

