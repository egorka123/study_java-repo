package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байты, которые встречаются в файле меньше всего раз.
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        List<Integer> treeSet = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        while (fileInputStream.available()>0){
            treeSet.add(fileInputStream.read());
        }
        int count=0;
        for (int i=0;i<treeSet.size();i++){
           count = Collections.frequency(treeSet,treeSet.get(i));
           if (count==1) result.add(treeSet.get(i));
        }
        for (int key : result){
           System.out.print(key + " ");
        }

        reader.close();
        fileInputStream.close();
    }
}
