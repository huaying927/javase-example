package com.delong.se.advance.collection_generic.fourth_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public class OptionalSimple
{

    public void testOptional ()
    {
        List<String> list = new ArrayList<>();
        list.add("ccc");
        list.add("bbb");
        list.add("ddd");
        list.add("DDDD");
        list.add("ccc");
        list.add("aaa");
        list.add("eee");

        //        Optional<String> optional = list.stream().findFirst();
        //        String s = optional.get();
        //        System.out.println("s = " + s);

        List<String> list2 = null;
//        Optional<List<String>> op = Optional.of(list2);//空指针异常
        Optional<List<String>> op = Optional.ofNullable(list2);//空指针异常
//        Optional<List<String>> op = Optional.empty();//空指针异常
//        System.out.println(op);
        getData(op);

    }

    public List<String> getData(List<String> list)
    {
        list = new ArrayList<>();
        list.add("ccc");
        list.add("bbb");
        list.add("ddd");
        return list;
    }

    //Optional的作用：主要是为了避免空指针异常
    public static Optional<List<String>> getData(Optional<List<String>> op)
    {

        if (op.isPresent())
        {
            if (op.get() != null)
            {

            }
        }
        return op;
    }
}
