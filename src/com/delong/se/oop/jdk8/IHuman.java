package com.delong.se.oop.jdk8;

public interface IHuman
{
    void  test3();
    void  test4();
    void  test5();
    void  test6();
    void  test7();
    void  test8();
    default void test()
    {
        System.out.println("测试默认方法");
    }

    static void test2()
    {
        System.out.println("测试静态方法");
    }
}
