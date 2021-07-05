package com.delong.se.oop.polym;

import com.delong.se.oop.polym.Person;

public class Employee extends Person
{
    public void  work()
    {
        System.out.println(this.name + "工作");
    }
}
