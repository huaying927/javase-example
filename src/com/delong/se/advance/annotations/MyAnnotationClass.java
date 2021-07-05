package com.delong.se.advance.annotations;

import java.lang.annotation.Target;


//@MyDefAnnotation("delong accp")
@MyDefAnnotation(value="玩游戏不听课", nums = {3, 4, 5})
@SuppressWarnings("all")
public class MyAnnotationClass
{
    public void test(String name)
    {

        System.out.println(name + " my definited  annotation  test ....");
    }

    public void calculate(int... nums)
    {
        int sum = 0;

        for (int num : nums)
        {
            sum += num;
        }

        System.out.println("sum = " + sum);
    }
}
