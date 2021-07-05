package com.delong.se.advance.reflect_proxy.reflection;

import java.lang.reflect.Field;

public class DescFieldExample
{
    public void testFirstDescField ()
    {
        final Class<String> stringClass = String.class;

        final Field[] fields = stringClass.getFields();

        for (Field field : fields)
        {
            System.out.println("field = " + field);
            System.out.println("field.getName() = " + field.getName());
        }
    }

    public void testSecondDescField ()
    {
        final Class<String> stringClass = String.class;

        final Field[] fields = stringClass.getDeclaredFields();

        for (Field field : fields)
        {
            System.out.println("field = " + field);
            System.out.println("field.getName() = " + field.getName());
        }
    }

    public void testThirdDescField ()
    {
        final Class<String> stringClass = String.class;

        //只能获取共有字段
        try
        {
            final Field field = stringClass.getField("CASE_INSENSITIVE_ORDER");

            System.out.println("field = " + field);
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
    }

    public void testFourthDescField ()
    {
        final Class<String> stringClass = String.class;

        //只能获取共有字段
        try
        {
            final Field field = stringClass.getDeclaredField("serialVersionUID");

            System.out.println("field = " + field);
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
    }
}
