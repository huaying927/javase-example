package com.delong.se.base;

import com.delong.se.oop.Human;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test
{
    public static void main (String[] args)
    {
//        byte num = 127;
//        byte num2  = -128;

        long  i1 = 128L;

        Integer  i2 = 128;

        float  fNum =  2.3f;

        fNum = i1;

        double dNum = 2.5;

        float fNum2 = (float) dNum;

        System.out.println(i1 == i2);

//        System.out.println(num + ", " +  num2);


        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                    System.out.printf("%d * %d = %-2d  ", j, i, i*j);
            }
            System.out.println();
        }

        int 孙飞=10;
        System.out.println(孙飞);

        int num =  10;

        System.out.println(num);
    }
}
