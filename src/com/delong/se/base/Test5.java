package com.delong.se.base;

import java.util.Arrays;

/**
 * 数组(array)：
 */
public class Test5
{
    public static void main (String[] args)
    {
        //        firstArray();
        //                secondArray();

        //        thirdArray();

        fourthArray();
    }

    private static void fourthArray ()
    {
        //直接赋值
        int[] arr = {3, 2, 4, 1, 0};
        //冒泡排序算法：外层循环是数组的长度-1；
        // 内层循环是数组的长度-1-外层循环变量
        //在判断数组中连续的2个元素
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

//        for (int i = 0; i < arr.length; i++)
//        {
//            System.out.println("arr[" + i + "]=" + arr[i]);
//        }

        for (int i : arr)
        {
            System.out.println(i);
        }
    }

    private static void thirdArray ()
    {
        //直接赋值
        int[] arr = {3, 2, 4, 1, 0};

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    private static void secondArray ()
    {
        //直接赋值
        int[] arr = new int[]{3, 2, 4, 1, 0};

        //排序:二叉树(二分查找法)
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    private static void firstArray ()
    {
        //直接定义数组
        int[] firstArr = new int[5];

        //赋值
        //        firstArr[0] = 0;
        //        firstArr[1] = 1;
        //        firstArr[2] = 2;
        //        firstArr[3] = 3;
        //        firstArr[4] = 4;
        //        firstArr[5] = 5;

        //        System.out.println(firstArr.length);

        //        System.out.println(Arrays.toString(firstArr));

        for (int i = 0; i < firstArr.length; i++)
        {
            System.out.println("firstArr[" + i + "] = " + i);
        }
    }
}
