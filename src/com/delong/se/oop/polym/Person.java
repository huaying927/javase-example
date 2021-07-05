package com.delong.se.oop.polym;

public /*abstract*/ class Person extends AbstractPerson
{
    private int id;

    protected String name;

    public Person ()
    {
    }

    public Person (int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void eat()
    {
        System.out.println("这个人在吃饭");
    }

    @Override
    public void jumping ()
    {
        System.out.println("人会跳");
    }

    @Override
    public void running ()
    {

    }
}
