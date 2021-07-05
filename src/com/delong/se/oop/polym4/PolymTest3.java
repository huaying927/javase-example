package com.delong.se.oop.polym4;

import java.util.Optional;

public class PolymTest3
{
    public static void main (String[] args)
    {
        Teacher teacher = new Teacher();

//        Optional<Teacher>  opt = Optional.ofNullable(teacher);
//        System.out.println(opt);
//        System.out.println(opt.isPresent());
//        System.out.println(opt.get());

//        Optional<Teacher> opt = Optional.empty();
//        System.out.println(opt);


        Student student = new Student();

        Active2 active = new Active2();

        IHuman iHuman = active.testPolym(student);

        if (iHuman instanceof Teacher)
        {
            Teacher tea = (Teacher) iHuman;
            tea.teaching();
        }


    }
}
