package com.delong.se.oop.polym3;

public class Active
{
//    public void test(Student student)
//    {
//        student.eat();
//    }
//
//    public void test(Teacher teacher)
//    {
//        teacher.eat();
//    }

    //增加代码的耦合度：用组合代替继承或实现
    public void test(IHuman iHuman)  //IHuman iHuman =  stu;
    {
        iHuman.eat();
    }

}
