package com.delong.se.oop.polym4;
//类和接口之间的关系是实现关系，可以多实现
public class Human implements IHuman
{
    @Override
    public void eat ()
    {
        System.out.println("人吃饭。。。");
    }

    public void drinking()
    {
        System.out.println("人喝水...");
    }
}
