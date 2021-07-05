package com.delong.se.advance.practical_class;

import java.util.Arrays;
import java.util.Objects;

/**
 * 1.==和equals的区别：
 *   ==比较的是两个对象是不是指的同一个对象
 *   equals比较的是两个对象是不是指的同一个
 *   对象，只有在重写了该对象中的hashCode和
 *   equals方法的情况下才是比较两个对象的内
 *   容是不是相同
 * 2.如果两个对象的hashCode相同，不一定是同
 *   一个对象；如果判断两个对象是同一个对象，
 *   必须同时重写hashCode和equals方法
 *
 * 3.jvm的内存模型：堆区和栈区
 * 4.字符串池：堆中的一块单独区域；字符串
 *   对象的产生先会查找字符串池中是否有该对象。
 *   如果没有则先在字符串池中创建该对象；如果
 *   new肯定会创建新的对象
 * 5.对象的产生：new 出来对象都会在堆区中
 */
public class StringSimple
{
    public void  testString3()
    {

        String str = "abc";
        String str2 = "eFg";

        System.out.println("str.startsWith(\"c\") = " + str.startsWith("a"));
        System.out.println("str.endsWith(\"c\") = " + str.endsWith("c"));
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str2.toLowerCase() = " + str2.toLowerCase());
        System.out.println("str.concat(str2) = " + str.concat(str2));
        System.out.println("str.compareTo(str2) = " + str.compareTo(str2));
        System.out.println("str.contains(\"bc\") = " + str.contains("bc"));
        System.out.println("str.contentEquals(\"abc\") = " + str.contentEquals("abc"));
        System.out.println("str.charAt(1) = " + str.charAt(0));
        System.out.println("str.getBytes() = " + Arrays.toString(str.getBytes()));
        System.out.println("str.indexOf(97) = " + str.indexOf(97));
        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a"));
        System.out.println("str.indexOf(\"a\", 2) = " + str.indexOf("a", 2));
        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));
        System.out.println("str.matches(\".\") = " + str.matches(".*"));
        String str3 = "a,b,c d,e";
        System.out.println("str.split(\",\") = " + Arrays.toString(str3.split(" ")));
        System.out.println("str.split(\",\") = " + str3.split(",").length);
        System.out.println("str.replace(\"a\", \"AAA\") = " + str.replace("a", "AAA"));
        System.out.println("str.replace(\"bc\", \"CB\") = " + str.replace("bc", "CB"));
        System.out.println("str.substring(1) = " + str.substring(1));
        System.out.println("str3.substring(1,3) = " + str3.substring(1,3));
        System.out.println("str3.trim() = " + str3.trim());
    }

    public void  testString2()
    {

        String str = "abc";
        String str2 = new String("abc");
        String str3 = new String("abc");

        System.out.println(str2.intern() == str3.intern());


    }

    public void  testString()
    {
        String str = "abc";
        String str2 = new String("abc");
        String str3 = new String("abc");

        System.out.println("str == str2 = " + str == str2);
        System.out.println("str.equals(str2) = " + str.equals(str2));
        System.out.println("str2 == str3 = " + str3 == str2);
        System.out.println("str2.equals(str3) = " + str3.equals(str2));


        Student stu = new Student("abc");
        Student stu2 = new Student("abc");
        System.out.println(stu == stu2);
        System.out.println("stu.equals(stu2) = " + stu.equals(stu2));
        System.out.println(stu);
        System.out.println(stu2);

    }
}

class Student
{
    private String name;

    public Student (String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals (Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode ()
    {
        return Objects.hash(name);
    }
}
