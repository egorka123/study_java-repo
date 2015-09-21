package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private String fam;
        private Boolean pol;
        private int age;
        private int h;
        private int w;

        Human(String name)
        {
            this.name = name;
        }
        Human(String fam, String name)
        {
            this.fam = fam;
            this.name = name;
        }
        Human(String name, int age)
        {
            this.name = name;
            this.age = age;
        }
        Human(String name, int h, int w)
        {
            this.name = name;
            this.h = h;
            this.w = w;
        }
        Human(String name, String fam, Boolean pol)
        {
            this.name = name;
            this.fam = fam;
            this.pol = pol;
        }
        Human(String name, int age, int h, int w)
        {
            this.name = name;
            this.age = age;
            this.h = h;
            this.w = w;
        }
        Human(String name, Boolean pol)
        {
            this.name = name;
            this.pol = pol;
        }
        Human(String name, Boolean pol, int age)
        {
            this.name = name;
            this.pol = pol;
            this.age = age;
        }
        Human(String name, Boolean pol, int age, int h)
        {
            this.name = name;
            this.pol = pol;
            this.age = age;
            this.h = h;
        }
        Human(String name, Boolean pol, int age, int h, int w)
        {
            this.name = name;
            this.pol = pol;
            this.age = age;
            this.h = h;
            this.w = w;
        }
    }
}


