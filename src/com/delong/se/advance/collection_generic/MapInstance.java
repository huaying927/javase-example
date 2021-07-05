package com.delong.se.advance.collection_generic;

import java.util.*;
import java.util.Map.*;
import java.util.function.BiConsumer;


public class MapInstance
{
    public void testHashtable ()
    {
        //key-value:
        Hashtable<String, String> ht = new Hashtable<>();

        ht.put("a", "aaa");
        ht.put("d", "ddd");
        ht.put("b", "bbb");
        ht.put("c", "ccc");
        ht.put("e", "eee");

        //        System.out.println(ht);
        //        System.out.println(ht.size());

        //迭代键
        //        for (Enumeration<String> ele = ht.keys(); ele.hasMoreElements(); )
        //        {
        //            System.out.println(ele.nextElement());
        //        }

        //迭代键
        //        Set<String> set = ht.keySet();
        //        for (Iterator<String> it = set.iterator(); it.hasNext(); )
        //        {
        //            System.out.println(it.next());
        //        }

        //迭代值
        //        for (Enumeration<String> ele = ht.elements(); ele.hasMoreElements(); )
        //        {
        //            System.out.println(ele.nextElement());
        //        }

        //迭代值
        //        Collection<String> collection = ht.values();
        //        for(Iterator<String> iterator = collection.iterator(); iterator.hasNext();)
        //        {
        //            System.out.println(iterator.next());
        //        }

        //泛型
        //        Set<Entry<String, String>> entries = ht.entrySet();
        //        for(Iterator<Entry<String, String>> it = entries.iterator(); it.hasNext();)
        //        {
        //            Entry<String, String> entry = it.next();
        //            System.out.println(entry.getKey() + "==>" + entry.getValue());
        //
        //            //            System.out.println(entry);
        //        }

        for (Entry<String, String> entry : ht.entrySet())
        {
            System.out.println(entry.getKey() + "====" + entry.getValue());
        }


    }

    public void testHashMap ()
    {
        //key-value:
        Map<String, String> map = new HashMap<>();

        map.put("a", "aaa");
        map.put("d", "ddd");
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("e", "eee");

        //        System.out.println(map);
        //        System.out.println(map.size());


        //迭代键
        //        Set<String> set = map.keySet();
        //        for (Iterator<String> it = set.iterator(); it.hasNext(); )
        //        {
        //            System.out.println(it.next());
        //        }


        //迭代值
        //        Collection<String> collection = map.values();
        //        for (Iterator<String> iterator = collection.iterator(); iterator.hasNext(); )
        //        {
        //            System.out.println(iterator.next());
        //        }

        //泛型
        //        Set<Entry<String, String>> entries = map.entrySet();
        //        for (Iterator<Entry<String, String>> it = entries.iterator(); it.hasNext(); )
        //        {
        //            Entry<String, String> entry = it.next();
        //            System.out.println(entry.getKey() + "==>" + entry.getValue());
        //
        //            //            System.out.println(entry);
        //        }


        for (Entry<String, String> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "====" + entry.getValue());
        }

    }

    public void testTreeMap ()
    {
        //key-value:
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("a", "aaa");
        map.put("d", "ddd");
        map.put("b", "bbb");
        map.put("c", "ccc");
        map.put("e", "eee");

        //        System.out.println(map);
        //        System.out.println(map.size());


        //迭代键
        //        Set<String> set = map.keySet();
        //        for (Iterator<String> it = set.iterator(); it.hasNext(); )
        //        {
        //            System.out.println(it.next());
        //        }


        //迭代值
        //        Collection<String> collection = map.values();
        //        for (Iterator<String> iterator = collection.iterator(); iterator.hasNext(); )
        //        {
        //            System.out.println(iterator.next());
        //        }

        //泛型
        //        Set<Entry<String, String>> entries = map.entrySet();
        //        for (Iterator<Entry<String, String>> it = entries.iterator(); it.hasNext(); )
        //        {
        //            Entry<String, String> entry = it.next();
        //            System.out.println(entry.getKey() + "==>" + entry.getValue());
        //
        //            //            System.out.println(entry);
        //        }

          Set ts =  new TreeSet();
        //        for (Entry<String, String> entry : map.entrySet())
        //        {
        //            System.out.println(entry.getKey() + "====" + entry.getValue());
        //        }

    }
}
