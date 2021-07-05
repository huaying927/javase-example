package com.delong.se.advance.reflect_proxy.reflection;

public class DescClassExampleTest
{
    public static void main (String[] args)
    {
        final DescClassExample descClassExample = new DescClassExample();
        descClassExample.testFirstDescClass();
        System.out.println("-------");
        descClassExample.testSecondDescClass();
        System.out.println("-------");
        descClassExample.testThirdDescClass();
    }
}
