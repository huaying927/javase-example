package com.delong.se.advance.reflect_proxy.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class DescConstructorExample
{
    public void testFirstDescConstructor ()
    {
        final Class<String> stringClass = String.class;

        final Constructor<?>[] constructors = stringClass.getConstructors();

        for (Constructor<?> constructor : constructors)
        {
            System.out.println("constructor = " + constructor);
        }
    }

    public void testSecondDescConstructor ()
    {
        final Class<String> stringClass = String.class;

        final Constructor<?>[] constructors = stringClass.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors)
        {
            System.out.println("constructor = " + constructor);
        }
    }

    public void testThirdDescConstructor ()
    {
        final Class<String> stringClass = String.class;

        try
        {
//            final Constructor<String> constructor = stringClass.getConstructor(new byte[5].getClass(), Integer.TYPE, Integer.TYPE);
            final Constructor<String> constructor = stringClass.getConstructor(new Class[]{new byte[5].getClass(), int.class, Integer.TYPE});

            System.out.println("constructor = " + constructor);
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
    }

    public void testFourthDescConstructor ()
    {
        final Class<String> stringClass = String.class;

        try
        {
            final Constructor<String> constructor = stringClass.getDeclaredConstructor(new Class[]{new char[5].getClass(), boolean.class});

            System.out.println("constructor = " + constructor);
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
    }
}
