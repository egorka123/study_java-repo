package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Egor on 30.04.2015.
 */
public class SubSolution extends Solution
{
    public SubSolution(Short sr){super(sr);}
    public SubSolution(Integer num){super(num);}
    public SubSolution(Double fl){super(fl);}

    protected SubSolution(Object num) {super(num);}
    protected SubSolution(Number fom){super(fom);}
    protected SubSolution(char a){super(a);}

    SubSolution(String stroka){super(stroka);}
    SubSolution(Boolean fog){super(fog);}
    SubSolution(Character sim){super(sim);}

    private SubSolution(boolean flag){super(flag);}
    private SubSolution(double fl){super(fl);}
    private SubSolution(int obj){super(obj);}



}
