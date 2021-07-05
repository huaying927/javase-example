package com.delong.se.advance.annotations;


import java.lang.annotation.Annotation;

public class MyRepeatableClassTest
{
    public static void main (String[] args)
    {
        final MyRepeatableClass myRepeatableClass = new MyRepeatableClass();
//        myRepeatableClass.test();

        final MyRepeatables annotation = myRepeatableClass.getClass().getAnnotation(MyRepeatables.class);

        final MyRepeatableAnnotation[] values = annotation.value();

        for (MyRepeatableAnnotation myRepeatableAnnotation : values)
        {
            System.out.println("myRepeatableAnnotation.repeatables() = " + myRepeatableAnnotation.repeatables());
        }



    }

}
