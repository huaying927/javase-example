package com.delong.se.advance.collection_generic.fourth_interface;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

/**
 * 消费型接口
 */
public class StreamSimple
{
    public void testConsumer ()
    {

//        Consumer<String> consumer = s -> System.out.println(s);
//        consumer.accept("shangzhendong");

        List<String> list = new ArrayList<>();
        list.add("ccc");
        list.add("bbb");
        list.add("ddd");
        list.add("DDDD");
        list.add("ccc");
        list.add("aaa");
        list.add("eee");

//        Collections.sort(list);
//        Collections.sort(list, (s, s2) -> s.toLowerCase().compareTo(s2.toLowerCase()));

//        list.sort((s, s2) -> s.compareTo(s2));
//        list.sort((s, s2) -> s.toLowerCase().compareTo(s2.toLowerCase()));

//        list.forEach(s -> System.out.println(s));
//        list.forEach(s -> System.out.println(s));


//        Predicate<String> predicate2 = s -> s.length()>3;
//        System.out.println("predicate2.test(\"DDDD\") = " + predicate2.test("DDDD"));

//        Stream<String> stringStream = list.stream();
//        stringStream.forEach(s -> System.out.println(s));
//        stringStream.forEach(s -> System.out.println(s));//会报错

//        list.stream().forEach(s -> System.out.println(s));
//        list.stream().forEach(s -> System.out.println(s));

        //并行流是无序的
//        list.parallelStream().forEach(s -> System.out.println(s));
//        list.parallelStream().forEach(s -> System.out.println(s));

//        list.stream().skip(3).forEach(s -> System.out.println(s));
//        list.stream().distinct().forEach(s -> System.out.println(s));
//        System.out.println("list.stream().count() = " + list.stream().count());
//        list.stream().limit(2).forEach(s -> System.out.println(s));

//        list.stream().filter(s -> s.length()<4).forEach(s -> System.out.println(s));

//        BiFunction<Integer, String, Person> bf = Person::new;
//        BiFunction<Integer, String, Person> bf = (n, s) -> new Person(s);

//        Person aaa = bf.apply();

//        System.out.println("aaa = " + bf.apply(0, "aaa"));
        
    }
}

class Person
{
    private int id;
    private String name;

    public Person ()
    {
    }

    public Person (String name)
    {
        this.name = name;
    }

    public Person (int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId ()
    {
        return id;
    }

    public void setId (int id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString ()
    {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
