package com.delong.se.oop;

public class OutClass2Test
{
    public static void main (String[] args)
    {
        OuterClass2 outerClass2 = new OuterClass2();

        outerClass2.testOutClassMethod();

        OuterClass2.InnerClass innerClass =  new OuterClass2().new InnerClass();

        innerClass.testInnerClassMethod();

        OuterClass2.StaticInnerClass2 staticInnerClass = new OuterClass2.StaticInnerClass2();

        staticInnerClass.testStaticInnerClassMethod();
    }
}

