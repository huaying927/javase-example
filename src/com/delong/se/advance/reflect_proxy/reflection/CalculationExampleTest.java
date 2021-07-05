package com.delong.se.advance.reflect_proxy.reflection;

import java.lang.reflect.Method;

public class CalculationExampleTest
{
    public static void main (String[] args)
    {
//        testSayHi();
//        testSayHi2();
//        testSayHello();
        testSum();
    }

    private static void testSayHi ()
    {
        final CalculationExample calculationExample = new CalculationExample();
        calculationExample.sayHi("张三");
    }

    private static void testSayHi2 ()
    {
        final Class<CalculationExample> calculationExampleClass = CalculationExample.class;

        try
        {
            final CalculationExample calculationExample = calculationExampleClass.newInstance();

            final Method methodObj = calculationExampleClass.getMethod("sayHi", String.class);

            methodObj.invoke(calculationExample, "张三2");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void testSayHello ()
    {
        final Class<CalculationExample> calculationExampleClass = CalculationExample.class;

        try
        {
            final CalculationExample calculationExample = calculationExampleClass.newInstance();

            final Method methodObj = calculationExampleClass.getDeclaredMethod("sayHello", String.class);

            methodObj.setAccessible(true);

            final Object returnValueObj = methodObj.invoke(calculationExample, "德隆");

            System.out.println("returnValueObj = " + returnValueObj);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void testSum ()
    {
        final Class<CalculationExample> calculationExampleClass = CalculationExample.class;

        try
        {
            final CalculationExample calculationExample = calculationExampleClass.newInstance();

            final Method methodObj = calculationExampleClass.getDeclaredMethod("sum", int.class, int.class);

            methodObj.setAccessible(true);

            final Object returnValueObj = methodObj.invoke(calculationExample, 3, 5);

            System.out.println("returnValueObj = " + returnValueObj);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
