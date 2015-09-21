package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> treeSet = new ArrayList<Integer>();
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        while (fileInputStream.available()>0){
            result.put(fileInputStream.read(), 0);
        }
        for (int key:result.keySet()){
            treeSet.add(key);
        }
        for (int j=0;j<treeSet.size();j++){
            for (int i=0;i<treeSet.size();i++){
                if (treeSet.get(j).compareTo(treeSet.get(i))<0){
                    int k = treeSet.get(j);
                    treeSet.set(j,treeSet.get(i));
                    treeSet.set(i, k);
                }
            }
        }
        for (int i=0;i<treeSet.size();i++){
            System.out.print(treeSet.get(i)+" ");
        }
    }
}
