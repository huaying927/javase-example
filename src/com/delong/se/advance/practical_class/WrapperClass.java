package com.delong.se.advance.practical_class;

/**
 * WrapperClass:
 * 1.原生类型-->包装类型(自动装箱)
 *   byte --> Byte
 *   short --> Short
 *   char --> Character
 *   int --> Integer
 *   long --> Long
 *   float --> Float
 *   double --> Double
 *   boolean --> Boolean
 */
public class WrapperClass
{
    public void testWrapperClass ()
    {
        //-128--127
        Integer i1 =  127;
        Integer i2 =  127;

//        System.out.println(i1 == i2);

        Integer i3 =  new Integer(127);
        Integer i4 =  new Integer(127);

//        System.out.println(i3 == i4);

        System.out.println("i3.intValue() = " + i3.intValue());

        System.out.println("Integer.parseInt(\"127\") = " + Integer.parseInt("127"));

        System.out.println(Integer.toHexString(16));
        System.out.println(Integer.toOctalString(16));
        System.out.println(Integer.toBinaryString(16));


        System.out.println("Integer.compare(3, 5) = " + Integer.compare(5, 3));
    }
}
