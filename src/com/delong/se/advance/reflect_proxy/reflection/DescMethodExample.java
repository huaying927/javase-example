package com.delong.se.advance.reflect_proxy.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DescMethodExample
{
    public void testFirstDescMethod ()
    {
        final Class<String> stringClass = String.class;

        final Method[] methods = stringClass.getMethods();

        for (Method method : methods)
        {
            System.out.println("method = " + method);
        }
    }

    public void testSecondDescMethod ()
    {
        final Class<String> stringClass = String.class;

        final Method[] methods = stringClass.getDeclaredMethods();

        for (Method method : methods)
        {
            System.out.println("method = " + method);
        }
    }

    public void testThirdDescMethod ()
    {
        final Class<String> stringClass = String.class;

        try
        {
            final Method methodObj = stringClass.getMethod("lastIndexOf", int.class, int.class);

            System.out.println(methodObj);
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
    }

    public void testFourthDescMethod ()
    {
        final Class<String> stringClass = String.class;

        try
        {
            final Method methodObj = stringClass.getDeclaredMethod("lastIndexOfSupplementary", int.class, int.class);

            System.out.println(methodObj);
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
    }
}
