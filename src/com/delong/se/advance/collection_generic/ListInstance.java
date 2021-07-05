package com.delong.se.advance.collection_generic;

import java.util.*;

public class ListInstance
{
    //数组：相同数据类型的集合
    public void testArray ()
    {
        int[] arr = new int[]{4, 2, 1, 5, 3};

        //        System.out.println(Arrays.toString(arr));

        //        for (int i = 0; i < arr.length; i++)
        //        {
        //            System.out.println(arr[i]);
        //        }

        for (int i = arr.length - 1; i >= 0; i--)
        {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        //增强for循环：冒号后面是要迭代的类型， 冒号左边是要迭代的类型中的元素类型
        for (int i : arr)
        {
            System.out.println(i);
        }
    }

    //Vector是集合中的一个类
    public void testVector ()
    {
        Vector vector = new Vector();

        vector.add("aaa");//Object o = new String("aaa");
        vector.add("aaa");
        //int:Integer byte:Byte short:Short  char:Character
        //long:Long float:Float double:Double boolean:Boolean
        vector.add(3);//int -> Integer 自动装箱(autobox)
        vector.add(new Integer(1));//int -> Integer 自动装箱(autobox)

        //        System.out.println(vector.size());

        //        System.out.println(vector);

        //        System.out.println(vector.get(2));

        //        for (int i = 0; i < vector.size(); i++)
        //        {
        //            System.out.println(vector.get(i));
        //        }

        //        for (int i = vector.size() - 1; i >= 0; i--)
        //        {
        //            System.out.println(vector.get(i));
        //        }

        for (Object o : vector)
        {
            System.out.println(o);
        }
    }

    //泛型：
    //Vector是一个动态数组
    public void testVectorByGeneric ()
    {
        //类型推断
        Vector<String> vector = new Vector<>();

        vector.add("ddd");
        vector.add("aaa");
        vector.add("eee");
        vector.add("ccc");
        vector.add("bbb");

        //        System.out.println(vector.size());

        //        for (String s : vector)
        //        {
        //            System.out.println(s);
        //        }

//        for (int i = 0; i < vector.size(); i++)
//        {
//            System.out.println(vector.get(i));
//        }

        for(Enumeration<String> elements = vector.elements(); elements.hasMoreElements();)
        {
            System.out.println(elements.nextElement());
        }
    }

    public void testArrayListByGeneric ()
    {
        List<String> list = new ArrayList<>();

        list.add("eee");
        list.add("ccc");
        list.add("aaa");
        list.add("ddd");
        list.add("bbb");

        //        Iterator<String> iterator = list.iterator();
        //
        //        while (iterator.hasNext())
        //        {
        //            System.out.println(iterator.next());
        //        }


        //        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); )
        //        {
        //            System.out.println(iterator.next());
        //        }


        //                Collections.sort(list);
        //           Collections.reverse(list);
        //        Collections.shuffle(list);

        System.out.println(list);

        Vector<String> vector = new Vector<>();

        vector.add("delong");
        vector.add("accp");

        list.addAll(vector);

        System.out.println(list);

    }

    //
    public void testLinkedListByGeneric ()
    {
        List<String> list = new LinkedList<>();

        list.add("eee");
        list.add("ccc");
        list.add("aaa");
        list.add("ddd");
        list.add("bbb");

        //        System.out.println(list);

        //        for (String s : list)
        //        {
        //            System.out.println(s);
        //        }

        //next:从数据结构的角度来说，next叫后置
        //        for(Iterator<String> it = list.iterator(); it.hasNext();)
        //        {
        //            System.out.println(it.next());
        //        }


        //        for(ListIterator<String> li = list.listIterator();li.hasNext();)
        //        {
        //            System.out.println(li.next());
        //        }

        //previous:从数据结构的角度来说，previous叫前趋
        for (ListIterator<String> li = list.listIterator(list.size()); li.hasPrevious(); )
        {
            System.out.println(li.previousIndex() + ":" + li.previous());
        }

    }
}
