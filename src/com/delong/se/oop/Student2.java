package com.delong.se.oop;

public class Student2 extends Human2
{
    private final int STUDENT_ID;

    public Student2 ()
    {
//        super();
//        STUDENT_ID = 0;
//        System.out.println("Student2 default  constrctor");
        this(0);
    }

    public Student2 (int id)
    {
        super();
        STUDENT_ID = id;
//        System.out.println("Student2 default  constrctor");
    }

    public void eat ()
    {

        //        Human2.id = 100;
        //        Human2.drinking("aaa");
        //        this.eat("");


        System.out.println("学生吃饭....");
    }

    public void drinking ()
    {

        System.out.println("学生喝水");
        super.eat();
    }
}
