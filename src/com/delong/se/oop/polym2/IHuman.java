package com.delong.se.oop.polym2;

/**
 * 接口：
 * 1.定义:用interface来定义一个接口
 * 2.特征：接口中的方法都是公有的抽象方法；接口中的成员变量都是公有的静态的常量
 */
public interface IHuman extends A1
{
    public static final int CARD_ID = 0;

    public abstract void jumping();
}
