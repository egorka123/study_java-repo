package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Не забудьте закрыть все потоки
*/

public class Solution {
    public volatile static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_tmp;
        while (!(file_tmp = reader.readLine()).equals("exit")){
            ReadThread file = new ReadThread(file_tmp);
            file.start();
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        @Override
        public void run(){
            try
            {
                FileInputStream file = new FileInputStream(fileName);
                ArrayList<Integer> tempByt = new ArrayList<Integer>();
                while (file.available()>0)  tempByt.add(file.read());
                file.close();
                int max = 0;
                for (int i=0;i<tempByt.size();i++){
                    int count = Collections.frequency(tempByt, tempByt.get(i));
                    if (count>max)  max = count;
                }
                for (int i=0;i<tempByt.size();i++)
                {
                    if (Collections.frequency(tempByt, tempByt.get(i))==max)
                    resultMap.put(fileName, Integer.valueOf(tempByt.get(i)));
                }
            }
            catch (FileNotFoundException e)
            {

            }
            catch (IOException e)
            {

            }
        }
    }
}
