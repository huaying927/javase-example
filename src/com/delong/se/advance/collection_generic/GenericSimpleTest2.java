package com.delong.se.advance.collection_generic;

import java.util.ArrayList;
import java.util.List;

public class GenericSimpleTest2
{
    public static void main (String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("ccc");
        list.add("aaa");

        GenericSimple2<List<String>> gs = new GenericSimple2<>();
        gs.testGeneric(list);

    }
}
