package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream cons = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(cons);


        int sb = 0;
        if (result.contains("+")){
            String[] res = result.split("\\p{Sm}");
            String er ="";
            for (int i=0;i<res.length;i++){
                er+=res[i].trim()+" ";
            }
            sb= Integer.parseInt(er.split(" ")[0]) + Integer.parseInt(er.split(" ")[1]);
        }
        if (result.contains("-")){
            String[] res = result.split("-");
            String er ="";
            for (int i=0;i<res.length;i++){
                er+=res[i].trim()+" ";
            }
            sb= Integer.parseInt(er.split(" ")[0]) - Integer.parseInt(er.split(" ")[1]);
        }
        if (result.contains("*")){
            String[] res = result.split("\\*");
            String er ="";
            for (int i=0;i<res.length;i++){
                er+=res[i].trim()+" ";
            }
            sb= Integer.parseInt(er.split(" ")[0]) * Integer.parseInt(er.split(" ")[1]);
        }

        result=result.replace("\r\n","");
        System.out.print(result+sb);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("98 * 10 = ");
        }
    }
}

