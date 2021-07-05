package com.delong.se.oop.polym2;

/**
 * concrete class
 */
public class Human extends AbstractHuman
{
    private int id;
    private String userName;

    public Human ()
    {
    }

    public Human (int id, String userName)
    {
        this.id = id;
        this.userName = userName;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getUserName ()
    {
        return userName;
    }

    public void setUserName (String userName)
    {
        this.userName = userName;
    }

    public void eat ()
    {
        System.out.println("人吃饭");
    }

    //重写abstract human类中的drinking方法


    @Override
    public void drinking ()
    {
        System.out.println("喝水");
    }

    public void learning()
    {
        System.out.println("人学习");
    }

    @Override
    public String toString ()
    {
        return "Human{" + "id=" + id + ", userName='" + userName + '\'' + '}';
    }
}
