package com.delong.se.advance.reflect_proxy.reflection;

public class DescClassExample
{
    //优先使用，官方推荐
    public void testFirstDescClass ()
    {
        final Class<String> stringClass = String.class;

        System.out.println(stringClass);

        System.out.println(stringClass.getName());
    }

    //优先使用
    public void testSecondDescClass ()
    {
        final String s = new String("asd");

        final Class<? extends String> clazz = s.getClass();

        System.out.println(clazz);


        System.out.println(clazz.getName());
    }

    //只有JDBC在用(不常用)
    public void testThirdDescClass ()
    {
        try
        {
            final Class<?> clazz = Class.forName("java.lang.String");

            System.out.println(clazz);

            System.out.println(clazz.getName());
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
