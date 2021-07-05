package com.delong.se.oop;

public class OutClassTest
{
    public static void main (String[] args)
    {
        OuterClass oc = new OuterClass();
        oc.test();

        //内部类的实例化
        OuterClass.InnerClass ic = new OuterClass().new InnerClass();

        ic.testInner();

        OuterClass.StaticInnerClass sic = new OuterClass.StaticInnerClass();

        sic.testStaticInner();
    }
}
