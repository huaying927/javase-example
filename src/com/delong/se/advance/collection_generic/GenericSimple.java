package com.delong.se.advance.collection_generic;

public class GenericSimple<E>
{

    //在方法中定义的泛型类型的作用域范围只是在该方法中有效
    public <T> void testGeneric (T t)
    {
        System.out.println(t);
    }

    public void testGeneric2 (E e)
    {
        System.out.println(e);
    }

}
