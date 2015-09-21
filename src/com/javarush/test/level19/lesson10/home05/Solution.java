package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader rfile = new BufferedReader(new FileReader(args[0]));
        FileWriter wFile = new FileWriter(args[1]);
        String str = "";
        while (rfile.ready()){
           str += rfile.readLine();
        }
        rfile.close(); String result ="";
        String[] buf = str.split(" ");
        for (String b:buf){
            boolean flag = false;
            for (char ch:b.toCharArray()){
                if (Character.isDigit(ch)) flag=true;
            }
            if (flag==true) result+=b+" ";
        }
        wFile.write(result.substring(0, result.length()-1));
        wFile.close();
    }
}
