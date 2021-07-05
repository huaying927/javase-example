package com.delong.se.oop;

import com.delong.se.oop.Human;

public class HumanTest
{
    public static void main (String[] args)
    {

        Human human = new Human();

        //         直接赋值
//                human.name = "zhangsan";
//
//                human.age = 29;

        //        System.out.println("name = " + human.name + ", age = " + human.age);

        //        human.eat();

        //java不支持直接输出一个对象信息，它会强制将对象信息转换成字符串方式来表示
        //        System.out.println(human.toString());
        //        System.out.println(human);
        //
        //        String resultValue =  human.eat();
        //
        //        System.out.println("无形参带返回值： " +  resultValue);
        //
        //        //实际参数：简称实参
        //        String resultValue2 =  human.eat(human.name);
        //
        //        System.out.println("有形参带返回值： " +  resultValue2);

        //构造赋值
        Human human2 = new Human("delong", 23);

        human2.setName("sunfei");
        human2.setAge(35);

//        System.out.println("Human2: " + human2);

        System.out.println(human2.getName());
    }
}
