package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(Short sr){};
    public Solution(Integer num){};
    public Solution(Double fl){};

    private Solution(boolean flag){};
    private Solution(double fl){};
    private Solution(int obj){};

    protected Solution(Number fom){};
    protected Solution(Object num){};
    protected Solution(char a){};

    Solution(String stroka){};
    Solution(Boolean fog){};
    Solution(Character sim){};
}

