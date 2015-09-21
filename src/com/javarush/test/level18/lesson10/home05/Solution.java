package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать во второй файл
Закрыть потоки
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream f_dr = new FileInputStream(reader.readLine());
        FileOutputStream f_cel = new FileOutputStream(reader.readLine());
        String buffer="";
        while (f_dr.available()>0){
          int bit = f_dr.read();
            if (((bit>47)&&(bit<58))||(bit==32)||(bit==46)||(bit==45))
           buffer+= Character.valueOf((char) bit);
            if ((bit==10)||(bit==13)) buffer+= " ";
        }
        f_dr.close();
        String[] mass = buffer.split(" ");
        Integer[] chis = new Integer[mass.length];
        String result="";
        for (int i=0;i<mass.length;i++){
            if (!(mass[i].isEmpty()))
          {
             int res = Math.round(Float.parseFloat(mass[i]));
             chis[i] = res;
             result+=chis[i]+" ";
          }
        }
        f_cel.write(result.substring(0,result.length()-1).getBytes());
        f_cel.close();
        reader.close();
    }
}
