package com.delong.se.advance.practical_class;

public class VarCharSequence
{
    public void testStringBuilder ()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("[")
                .append("a")
                .append(",")
                .append("b")
                .append(",")
                .append("c")
                .append("]");

        System.out.println(sb);


        //禁止使用
        //        String s = new String();
        //        s += "a";
        //        s+="b";
        //        System.out.println("s = " + s);
    }

    public void testStringBuffer ()
    {
        StringBuffer sb = new StringBuffer();

        sb.append("[")
                .append("a")
                .append(",")
                .append("b")
                .append(",")
                .append("c")
                .append("]");

        System.out.println(sb);


//禁止使用
//        String s = new String();
//        s += "a";
//        s+="b";
//        System.out.println("s = " + s);
    }
}
