package com.delong.se.oop.throwabel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * final  finally  finalize的区别
 * 1. final
 * 2. finally
 * 3. finalize: 垃圾回收(GC)的一种机制
 */
public class ThrowableTest3
{
    public static void main (String[] args)
    {
        testCompileException();
    }

    //用在方法的签名后边的异常
    private static void testCompileException ()
    {

        try
        {
            MyException me = new MyException("我的自定义异常：文件路径不正确或文件不存在");
            throw me;

        }
        catch (MyException e)
        {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
    }
}
