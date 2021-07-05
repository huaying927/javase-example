package com.delong.se.advance.practical_class;

public enum MyEnum2
{
    RED("red"), BLUE("blue"), GREEN("green"), CYAN("cyan");

    //成员变量一定在带参的实例下面
    private String color;

    MyEnum2 (String color)
    {
        this.color = color;
    }

    public String getColor ()
    {
        return color;
    }
}
