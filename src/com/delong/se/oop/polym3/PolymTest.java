package com.delong.se.oop.polym3;

public class PolymTest
{
    public static void main (String[] args)
    {
        Student stu = new Student();
        Teacher tea = new Teacher();


        Active active = new Active();
        active.test(stu);

    }
}
