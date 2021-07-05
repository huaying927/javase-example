package com.delong.se.advance.practical_class;

//import java.lang.Math;
//import static java.lang.Math.*;

public class MathSimple
{
    public void testMath()
    {
        System.out.println("Math.PI = " + Math.PI);
        System.out.println("Math.E = " + Math.E);
//        System.out.println("Math.PI = " + PI);
//        System.out.println("Math.E = " + E);
//        System.out.println("round(3.5) = " + round(3.5));
        System.out.println("round(3.5) = " + Math.round(3.5));
        System.out.println("Math.abs(-4) = " + Math.abs(-4));
        System.out.println("Math.random() = " + Math.random());//[0,1)
        System.out.println("((int)((Math.random()*101))+100) = " + ((int) ((Math.random() * 101)) + 100));
        int floor = (int) Math.floor(11.8);
        System.out.println("floor = " + floor);
        int floor2 = (int) Math.floor(-11.8);
        System.out.println("floor = " + floor2);
        int ceil = (int) Math.ceil(11.2);
        System.out.println("ceil = " + ceil);
        int ceil2 = (int) Math.ceil(-11.2);
        System.out.println("ceil = " + ceil2);
        System.out.println("Math.pow(2, 5) = " + ((int) Math.pow(2, 5)));
        System.out.println("Math.max(3, 5) = " + Math.max(3, Math.max(5, 8)));
        System.out.println("Math.min(3, 5) = " + Math.min(3, 5));
        System.out.println("Math.nextDown(5.4) = " + Math.nextDown(5.4));
        System.out.println("Math.nextUp(5.4) = " + Math.nextUp(5.4));
        System.out.println(Math.sqrt(4));
        System.out.println("Math.addExact(2, 3) = " + Math.addExact(2, 4));
        System.out.println("Math.incrementExact(5) = " + Math.incrementExact(5));
        System.out.println(Math.decrementExact(5));
        System.out.println("Math.subtractExact(5, 5) = " + Math.subtractExact(5, 5));
    }
}
