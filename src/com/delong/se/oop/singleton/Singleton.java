package com.delong.se.oop.singleton;

/**
 * 面试：
 * 单例模式：一个类只能产生一个实例
 * 单例的四个要素：
 * 1. 单例类要被final修饰(可有可无)
 * 2. 单例类要有一个私有的、静态的、被final修饰的类的实例
 * 3. 单例类的构造方法要私有
 * 4. 单例类要有一个公有的、静态的返回该单例类实例的一个方法
 */
public final class Singleton
{
    private static final Singleton SINGLETON_INSTANCE = new Singleton();

    private Singleton()
    {

    }

    public static Singleton getInstance ()
    {
        return SINGLETON_INSTANCE;
    }
}
