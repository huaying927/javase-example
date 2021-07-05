package com.delong.se.oop.polym;

/**
 * 接口：
 * 1.定义：用interface来定义一个接口
 * 2.特征：接口中所有的方法都是公有的抽象方法
 */
public interface IPerson extends A1
{
    //接口中的变量都是公有的静态常量
//    public static final int cardId  =  1;

    public abstract void running();

}
