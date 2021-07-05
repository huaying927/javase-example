package com.delong.se.oop.polym2;

public class StudentTest
{
    public static void main (String[] args)
    {
        //静态绑定(编译时绑定)：编译阶段确定了某个具体类型
        Student student = new Student();

        Teacher teacher = new Teacher();

        //动态绑定(运行时绑定)：运行阶段才可以确定某个具体类型
        //直接使用多态:让父类或接口的引用直接指向子类

        //对象的自动类型转换

        Human human = new Student();
        human.eat();

        Human human2 = new Teacher();

        AbstractHuman abstractHuman = new Student();

        IHuman iHuman = student;

//        IHuman iHuman2 = new Teacher();


        //对象的强制类型转换处理 ：instanceof
        //instanceof: 判断左边对象或接口的引用
        //            是不是指向右边类型的一个实例
        if(iHuman instanceof Teacher)
        {
            Teacher tea  = (Teacher)iHuman;
            tea.teaching();
        }
        else
        {
            Student stu  = (Student)iHuman;
            stu.learning();
        }




    }
}
