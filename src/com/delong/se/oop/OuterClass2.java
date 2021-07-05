package com.delong.se.oop;

/**
 * OuterClass2.class
 * OuterClass2$InnerClass.class
 * InnerClass.class
 */
public class OuterClass2
{
    public  void  testOutClassMethod()
    {
        System.out.println("test outer class method");
    }

    public class InnerClass
    {
        public  void testInnerClassMethod()
        {
            System.out.println("test inner class method");
        }
    }

    public  static class StaticInnerClass2
    {
        public  void testStaticInnerClassMethod()
        {
            System.out.println("test static inner class method");
        }
    }
}

