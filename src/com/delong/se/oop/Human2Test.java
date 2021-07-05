package com.delong.se.oop;

public class Human2Test
{
    public static void main (String[] args)
    {
        Human2 human2 = new Human2(1, "laosun", 42);

        System.out.println(human2);
        System.out.println(human2.toString());
        //        System.out.println(Human2.class.getName() + "@" + human2.hashCode());
        //        System.out.println(Human2.class.getName() + "@" + Integer.toHexString(human2.hashCode()));

        human2.setId(2);
        human2.setUserName("zhangsan");
        human2.setAge(21);

        System.out.println(human2);

        System.out.println("id: " + human2.getId() + ",  name: " + human2.getUserName());

        String result = human2.drinking("lisi");
        System.out.println(result);
    }
}
