package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        ArrayList<Human> ch = new ArrayList<Human>();
        ch.add(new Human("son0", true, 12, null));
        ch.add(new Human("son1", true, 12, null));
        ch.add(new Human("son2", true, 12, null));

        ArrayList<Human> pm = new ArrayList<Human>();
        pm.add(new Human("pap", true, 45, ch));
        pm.add(new Human("mam", false, 30, ch));
        Human pap = new Human("pap", true, 45, ch);
        Human mam = new Human("mam", false, 30, ch);

        Human gf1 = new Human("ded1", true, 121, pm);
        Human gf2 = new Human("ded2", true, 101, pm);
        Human gm1 = new Human("bab1", false, 153, pm);
        Human gm2 = new Human("bab2", false, 92, pm);



        System.out.println(gf1);
        System.out.println(gf2);
        System.out.println(gm1);
        System.out.println(gm2);
        System.out.println(pap);
        System.out.println(mam);
        System.out.println(ch.get(0));
        System.out.println(ch.get(2));
        System.out.println(ch.get(1));


    }

    public static class Human
    {
        //Написать тут ваш код
        private String name;
        private boolean sex;
        private int age;
        ArrayList<Human> children = new ArrayList<Human>();

        Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (children == null) this.children = new ArrayList<Human>();
            else  this.children = children;
        }



        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
