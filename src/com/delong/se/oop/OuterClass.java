package com.delong.se.oop;

/**
 * OuterClass.class
 * OuterClass$InnerClass.class
 * OuterClass$StaticInnerClass.class
 */
public class OuterClass
{
    public void test()
    {
        System.out.println("test...");
    }

    public class InnerClass
    {
        public  void testInner()
        {
            System.out.println("testInner...");
        }
    }

    public static class StaticInnerClass
    {
        public void testStaticInner()
        {
            System.out.println("testStaticInner...");
        }
    }
}
