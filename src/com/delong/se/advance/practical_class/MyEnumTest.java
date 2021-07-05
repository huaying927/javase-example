package com.delong.se.advance.practical_class;

import java.util.Arrays;

public class MyEnumTest
{
    public static void main (String[] args)
    {
        //        testMyEnum();
        testMyEnum2();
    }

    private static void testMyEnum2 ()
    {
//        System.out.println("MyEnum2.BLUE = " + MyEnum2.BLUE);
//        System.out.println("MyEnum2.CYAN = " + MyEnum2.CYAN);
//        System.out.println("MyEnum2.valueOf(\"RED\") = " + MyEnum2.valueOf("RED"));
//        System.out.println("MyEnum2.valueOf(MyEnum2.class, \"BLUE\") = " + MyEnum2.valueOf(MyEnum2.class, "BLUE"));
//        System.out.println("MyEnum2.values() = " + Arrays.toString(MyEnum2.values()));

        MyEnum2[] values = MyEnum2.values();

        for (MyEnum2 value : values)
        {
//            System.out.println("value.getColor() = " + value.getColor());
//            System.out.println("value.ordinal() = " + value.ordinal());
//            System.out.println("value.name() = " + value.name());

            System.out.println("++value.ordinal() + \" ==>\" + value.name() = " + value.ordinal() + " ==>" + value.name());
        }

    }

    private static void testMyEnum ()
    {
        //        System.out.println("MyEnum.BLUE = " + MyEnum.BLUE);
        //        System.out.println("MyEnum.CYAN = " + MyEnum.CYAN);

        //        System.out.println("MyEnum.valueOf(\"BLUE\") = " + MyEnum.valueOf("BLUE"));
        //        System.out.println("MyEnum.valueOf(MyEnum.class, \"GREEN\") = " + MyEnum.valueOf(MyEnum.class, "GREEN"));
        //
        //        System.out.println("MyEnum.values() = " + Arrays.toString(MyEnum.values()));
    }
}
