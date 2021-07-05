package com.delong.se.base;



public class Test4
{
    public static void main (String[] args)
    {
        //        testLoopByWhile();

        //        testLoopByDoWhile ();

        //        testLoopByFor();

        //        testLoopByFor2 ();
//        testLoopByFor3();
//        testLoopByFor4();

//        testMultipartLoop();

//        testMultipartLoop2();

//        testMultipartLoop3 ();

        testMultipartLoop4 ();
    }

    private static void testMultipartLoop4 ()
    {
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.printf("%d x %d = %-2d ", j, i, i*j);
            }
            System.out.println();
        }
    }

    private static void testMultipartLoop3 ()
    {
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " * " + i + " = " + i*j + "\t");
            }
            System.out.println();
        }
    }

    private static void testMultipartLoop2 ()
    {
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void testMultipartLoop ()
    {
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 1; j <= 9; j++)
            {
                if (j <= i)
                {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }


    //通过判断奇数来求5以内的偶数和
    private static void testLoopByFor4 ()
    {
        int sum = 0;
        int i = 0;

        for (; i <= 5; )
        {
//            i++;
            if (++i > 5)
            {
                break;//在其作用域的范围内，强制终止循环执行
            }
            if (i % 2 != 0)
            {
                continue;//在其作用域的范围内，强制终止本次循环，进入下次循环
            }
            sum += i;

        }
        System.out.println("sum = " + sum);
    }

    private static void testLoopByFor3 ()
    {
        int sum = 0;
        int i = 0;

        for (; i <= 5; )
        {
            if (i % 2 != 0)
            {
                sum += i;
            }

            i++;
        }
        System.out.println("sum = " + sum);
    }

    //求5以内的偶数和
    private static void testLoopByFor2 ()
    {
        int sum = 0;
        int i = 0;

        for (; i <= 5; )
        {
            sum += i;

            i += 2;
        }
        System.out.println("sum = " + sum);
    }


    private static void testLoopByFor ()
    {
        int sum = 0;
        //for中的条件：
        //1. 初始化条件，只使用一次
        //2. 判断条件,如果条件满足然后执行循环体
        //3. 增量计算后则回头判断第二个条件是否满足，
        // 若满足则继续执行循环体，否则跳出循环
        int i = 0;
        for (; i <= 5; )
        {
            sum += i;

            i++;
        }
        System.out.println("sum = " + sum);
    }

    private static void testLoopByDoWhile ()
    {
        int num = 6;
        int sum = 0;
        do
        {
            sum += num; //sum += num;
            num++;
        } while (num <= 5);
        System.out.println("sum = " + sum);
    }

    private static void testLoopByWhile ()
    {
        int num = 6;
        int sum = 0;
        while (num <= 5)
        {
            sum += num; //sum += num;
            num++;
        }
        System.out.println("sum = " + sum);
    }
}
