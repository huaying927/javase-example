package com.delong.se.base;

import java.util.Scanner;

public class Test3
{
    //静态方法只能调用静态方法或静态变量
    //静态方法不能调用非静态方法或非静态变量
    public static void main (String[] args)
    {
        //        testChangeStructureByIf();

        testChangeStructureBySwitch();

    }

    private static void testChangeStructureBySwitch ()
    {
        //具备从控制台输入的功能
        Scanner scanner = new Scanner(System.in);
        //需要在控制台输入
        byte score = scanner.nextByte();

        switch (score / 10)
        {
            case 10:
                //                System.out.println("优秀");
                //                break;
            case 9:
                //                System.out.println("优秀");
                //                break;
            case 8:
                System.out.println("优秀");
                break;
            case 7:
                System.out.println("良好");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格或无成绩");
                break;
        }
    }

    private static void testChangeStructureByIf ()
    {
        int num = 5;
        int num2 = 3;

        if (num > num2)
        {
            System.out.println("5大于3");
        }
        else if (num < num2)
        {
            System.out.println("5小于3");
        }
        else
        {
            System.out.println("5等于3");
        }
    }
}
