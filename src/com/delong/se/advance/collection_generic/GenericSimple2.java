package com.delong.se.advance.collection_generic;

public class GenericSimple2<T>
{

    //在方法中定义的泛型类型的作用域范围只是在该方法中有效
    public  void testGeneric (T t)
    {
        System.out.println(t);
    }

}
