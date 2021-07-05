package com.delong.se.oop;

public class Human2
{
    private /*static*/ int id;

    private String userName;

    private int age;

    public Human2 ()
    {
//        super();
//        this.id = 0;
//        this.userName = null;
//        this.age = 0;


//        this(0, null, 0);

        System.out.println("Human2  default  constrctor");

    }

    public Human2 (int id, String userName, int age)
    {
        super();
        this.id = id;
        this.userName = userName;
        this.age = age;
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

    public int getAge ()
    {
        return age;
    }

    public void setAge (int age)
    {
        this.age = age;
    }

    public void eat ()
    {
//        Human2.id = 100;
//        Human2.drinking("aaa");
//        this.eat("");

        System.out.println("人吃饭....");
    }

    public  /*static*/ void eat (String userName)
    {
        System.out.println(userName + " 吃饭....");
    }

    public /*static*/ String drinking(String name)
    {
//        Human2.id  = 100;
//        Human2.eat("");

        return name + "喝水";
    }


    @Override
    public String toString ()
    {
        return "Human2{" + "id=" + id + ", userName='" + userName + '\'' + ", age=" + age + '}';
    }
}
