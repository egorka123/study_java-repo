package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> treeSet = new ArrayList<Integer>();
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        while (fileInputStream.available()>0){
            treeSet.add(fileInputStream.read());
        }
        int count; int max_count=0;
        for (int i=0;i<treeSet.size();i++){
            count = Collections.frequency(treeSet,treeSet.get(i));
            if (count>max_count) max_count = count;

        }
        for (int i=0;i<treeSet.size();i++) {
            count = Collections.frequency(treeSet,treeSet.get(i));
            if (count==max_count) result.put(treeSet.get(i),count);
        }
        String out="";
        for (int key : result.keySet()){
            out +=key+" ";
        }
        System.out.println(out.substring(0,out.length()-1));
        reader.close();
        fileInputStream.close();
    }
}
