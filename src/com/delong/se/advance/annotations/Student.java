package com.delong.se.advance.annotations;


@Deprecated
@SuppressWarnings("all")
public class Student extends Human
{
    @SuppressWarnings("all")
    public Student ()
    {
    }

    @Override
    public void eat ()
    {
        System.out.println("student eat...");
    }

    @Deprecated
    public void drinking(@SuppressWarnings("all") String name)
    {
        @SuppressWarnings("unused")
        final int i = 20;
        System.out.println("drinking");
    }

    @SuppressWarnings("all")
    public void jumping()
    {
        System.out.println("jumping");
    }
}
