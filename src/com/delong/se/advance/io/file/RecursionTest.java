package com.delong.se.advance.io.file;

import java.io.File;

//递归:方法自己调用方法自己，但要有一个出口
public class RecursionTest
{
    public static void main (String[] args)
    {
        File file = new File(File.separator + "Users" + File.separator + "sunfei" + File.separator + "nacos");

        //        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());

        testRecursiveMethod(file);
    }

    public static void testRecursiveMethod (File file)
    {
//        if (file != null)
//        {
            if (file.isDirectory())
            {
                File[] files = file.listFiles();

                if (files != null)
                {
                    for (File f : files)
                    {
                        testRecursiveMethod(f);
                    }
                }
            }
            else
            {
                System.out.println("file.getName() = " + file.getName());
            }
//        }
//        else
//        {
//            System.out.println("该目录为空");
//        }

    }
}
