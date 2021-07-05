package com.delong.se.oop.polym;

/**
 * 抽象类：
 * 1.定义：用abstract关键字来定义的类叫抽象类；以前所有定义的类叫具体类(Concrete Class)
 * 2.特征：抽象类不能被实例化
 * 3.抽象类中不一定有抽象方法, 但类中如果有抽象方法则该类一定是抽象类
 */

/**
 * 类和接口的关系：实现关系。类要实现接口，也即要实现接口中定义的抽象方法
 */
public abstract class AbstractPerson implements IPerson
{
    public void drinking()
    {
        System.out.println("人喝水");
    }

    //抽象方法的特征：只有方法的声明，没有方法的实现(没有方法体)
    //抽象方法一定要被子类去实现，否则要么把子类变为抽象类，要么报错
    public abstract void jumping();


}
