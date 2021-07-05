package com.delong.se.oop.throwabel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ThrowableTest2
{
    public static void main (String[] args)
    {


        testCompileException();

    }

    private static void testCompileException ()
    {

        try
        {
            File file = new File("test.txt");
            //throw 后跟异常对象
            throw new FileNotFoundException("文件没有找到");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally//一般情况下finally中的代码一定会执行
        {
            //finally中的代码只有System.exit(0);不被执行，但禁止使用
            System.out.println("finally is executed..");
        }

    }
}
