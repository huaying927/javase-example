package com.delong.se.advance.annotations;


import java.lang.annotation.Annotation;

public class MyAnnotationClassTest
{
    public static void main (String[] args)
    {
        final MyAnnotationClass myAnnotationClass = new MyAnnotationClass();

        final MyDefAnnotation annotation = myAnnotationClass.getClass().getAnnotation(MyDefAnnotation.class);

        final String value = annotation.value();

        myAnnotationClass.test(value);

        final int[] values = annotation.nums();

        myAnnotationClass.calculate(values);
    }
}
