package com.delong.se.oop.throwabel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 错误和异常：
 * 1. 错误和异常的根类是Throwable
 * 2. 错误一般情况都是语法造成的，需要修改代码
 * 3. 异常情况分为运行时异常和编译时异常
 * 4. 开发中几乎所有的问题都是运行时异常
 *
 * 请写出5个常见的运行时异常
 * (1). ArithmeticException
 * (2). IndexOutOfBoundsException
 * (3). ArrayIndexOutOfBoundsException
 * (4). ClassCastException
 * (5). NullPointerException
 *
 * 5.编译时异常：一般情况下代码本身没有问题，是由于系统的外部环境造成的
 *   (1)try-catch-finally
 *   (2)try-catch-catch-finally
 *   (3)try-catch
 *   (4)try-catch-catch: 捕获异常的顺序是先捕获子类，再捕获父类；如果无继承关系，则先捕获谁则无所谓
 *   (5)try-finally
 *   jdk1.7: try-with-resource: 只有实现Colseable或AutoColseable接口的类都可以放到try后的小括号中
 *
 * 6.异常的根类是Throwable,该类有两个直接子类：Error和Exception
 * 7.异常处理中有五个关键字：try  catch finally  throws throw
 *
 */
public class ThrowableTest
{
    public static void main (String[] args)
    {
//        testError();
//        testRuntimeException();

        testCompileException();

    }

    private static void testCompileException2 ()
    {
        File file = new File("/Users/sunfei/IdeaProjects/javase-2189/src/com/delong/se/oop/throwabel/test.txt");

        try(InputStream fis = new FileInputStream(file);)
        {




            System.out.println("没有异常");

        }
        catch (FileNotFoundException e)
        {
            System.out.println("有异常。。。");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void testCompileException ()
    {

        try
        {
            File file = new File("/Users/sunfei/IdeaProjects/javase-2189/src/com/delong/se/oop/throwabel/test.txt");

            InputStream fis = new FileInputStream(file);

            System.out.println("没有异常");

        }
        catch (FileNotFoundException e)
        {
            System.out.println("有异常。。。");
            e.printStackTrace();
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

    private static void testRuntimeException ()
    {
        //代码编译后没有报错，但运行时控制台报错
        //System.out.println(5 / 0);
    }

    private static void testError ()
    {
        //错误：需要修改代码
        float num = 1.3f;
    }
}
