package com.delong.se.advance.collection_generic;

import java.util.*;

public class SetInstance
{
    public void testHashSet ()
    {
        Set<String> hs = new HashSet<>();

        hs.add("ccc");
        hs.add("aaa");
        hs.add("ccc");
        hs.add("ddd");
        hs.add("bbb");

        //        System.out.println(hs);

        //        for (String h : hs)
        //        {
        ////            System.out.println(h);
        //            System.out.println("h = " + h);
        ////            System.out.printf("%s", h);
        //        }


        for (Iterator<String> iterator = hs.iterator(); iterator.hasNext(); )
        {
            System.out.println(iterator.next());
        }
    }

    public void testTreeSet ()
    {
        NavigableSet<String> hs = new TreeSet<>();

        hs.add("ccc");
        hs.add("aaa");
        hs.add("ccc");
        hs.add("ddd");
        hs.add("bbb");


        for (Iterator<String> iterator = hs.iterator(); iterator.hasNext(); )
        {
            System.out.println(iterator.next());
        }
    }
}
