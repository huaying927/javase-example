package com.delong.se.advance.annotations;

import java.lang.annotation.Repeatable;

@MyRepeatableAnnotation(repeatables = "aaa")
@MyRepeatableAnnotation(repeatables = "bbb")
@MyRepeatableAnnotation(repeatables = "ccc")
@MyRepeatableAnnotation(repeatables = "ddd")
public class MyRepeatableClass
{
    public void test()
    {
        System.out.println("\"test repeatable annotation\" = " + "test repeatable annotation");
    }
}
