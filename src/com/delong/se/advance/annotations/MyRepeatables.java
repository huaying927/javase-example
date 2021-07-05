package com.delong.se.advance.annotations;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatables
{
    MyRepeatableAnnotation[] value ();
}
