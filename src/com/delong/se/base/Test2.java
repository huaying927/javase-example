package com.delong.se.base;

import java.util.ArrayList;

public class Test2
{
    public static void main (String[] args)
    {
        int num = 5;
        int num2 = 3;
        //        System.out.println(num + num2);
        //        System.out.println(num - num2);
        //        System.out.println(num * num2);
        //        System.out.println(num / num2);
        //对于取模来说，余数的符号与被除数的符号相同
        //        System.out.println(num % -num2);

        //        ++num;
        //        System.out.println(num++);

        //        System.out.println(num == num2);

        // 逻辑运算符：&&(并且) ||（或者） !(逻辑非)
        // 逻辑运算符是 短路运算符
        // 按位运算符是非短路运算符
        //        System.out.println(!false);

        //        System.out.println(num < num2 & ++num2 < 5);
        //        System.out.println(num2);

        //        System.out.println(num | num2);//5(101) 3(011)

        int sum = 0;
        //        sum += num;//sum  =  sum + num
        //        sum -= num;//sum  =  sum - num
        //        sum /= num;//sum  =  sum / num
        //        sum %= num;//sum  =  sum % num
        //        sum <<= num;//sum  =  sum << num

        //请用最有效率的方式写出2*8的结果
        System.out.println(2 * 8);
        //有符号左移运算符：左移一位相当于乘以2
        //有符号右移运算符：右移一位相当于除以2
        //无符号右移运算符：右移一位相当于除以2
        //        System.out.println(2 << 3);
        //        System.out.println(2 >> 3);
        //        System.out.println(2 >>> 3);

        //三元运算符： 产生布尔值的expression ？值 ：值2，
        // 其本质是一个if-else语句
        System.out.println(num < num2 ? 'a' : "2189");

        if (num > num2)
        {
            System.out.println('a');
        }
        else
        {
            System.out.println("2198");
        }

    }
}
