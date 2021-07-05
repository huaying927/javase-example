package com.delong.se.oop.polym4;


public class Active
{
//    public void testPolym(Student student)
//    {
//        student.eat();
//        student.drinking();
//        student.leaning();
//    }
//
//    public void testPolym(Teacher teacher)
//    {
//        teacher.eat();
//        teacher.drinking();
//        teacher.teaching();
//    }

    public void testPolym(IHuman iHuman)
    {
        iHuman.eat();
        //判断左边对象的引用是不是指向右边类型的一个实例
        if (iHuman  instanceof Student)
        {
            Student stu = (Student) iHuman;
            stu.drinking();
            stu.leaning();
        }
        else
        {
            Teacher tea = (Teacher) iHuman;
            tea.drinking();
            tea.teaching();
        }

    }
}
