package com.delong.se.oop.polym4;

public class PolymTest
{
    public static void main (String[] args)
    {
        Student student = new Student();

        Teacher teacher = new Teacher();

        //直接使用多态：接口或父类指向子类
        IHuman ih = new Student();
        //父类有的方法子类没有则可以调用
        //ih.eat();

        Human h = new Student();
        //父类和子类有重写方法则调用的是子类中方法
        h.drinking();

    }
}
