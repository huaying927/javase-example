package com.delong.se.advance.annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatables.class)
public @interface MyRepeatableAnnotation
{
    String repeatables() default "test repeatable";
}
