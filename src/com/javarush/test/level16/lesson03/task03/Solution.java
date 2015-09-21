package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        Thread specialThread_1 = new Thread(new SpecialThread());
        Thread specialThread_2 = new Thread(new SpecialThread());
        Thread specialThread_3 = new Thread(new SpecialThread());
        Thread specialThread_4 = new Thread(new SpecialThread());
        Thread specialThread_5 = new Thread(new SpecialThread());

        list.add(specialThread_1);
        list.add(specialThread_2);
        list.add(specialThread_3);
        list.add(specialThread_4);
        list.add(specialThread_5);

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
