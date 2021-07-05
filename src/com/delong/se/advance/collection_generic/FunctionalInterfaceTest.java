package com.delong.se.advance.collection_generic;

import java.util.Arrays;
import java.util.function.*;

public class FunctionalInterfaceTest
{
    //函数式编程：
    public static void main (String[] args)
    {
//                testFristLambdaByIHuman();

                testSecondLambdaByIHuman();

        //        testFirstLambdaByComputer();

        //        testSecondLambdaByComputer();

        //        testFirstConsumerByStudent();

        //        testSecondConsumerByStudent();

        //        testFirstSupplierByStudent();

        //        testSecondSupplierByStudent();

        //        testFirstPridecateByStudent();

        //        testSecondPredicateByStudent();

        //        Computer cc = (a, b) -> a+b;


        //        mysum((a, b) -> a+b, 3, 10);

//        testFirstFunctionByStudent();

//        testSecondFunctionByStudent();

//        BiFunction<String, String, String> biFunction = new BiFunction<String, String, String>()
//        {
//            @Override
//            public String apply (String s1, String s2)
//            {
//                return s1.concat(s2);
//            }
//        };
//
//        String result = biFunction.apply("aaa", "bbb");
//
//        System.out.println("result = " + result);

        IntFunction<Integer[]> integerIntFunction = new IntFunction<Integer[]>(){

            @Override
            public Integer[] apply (int value)
            {
                return new Integer[value];
            }
        };

    }

    private static void testSecondFunctionByStudent ()
    {
        Function<Student, Stu> function = student -> new Stu(student.getName());
        Stu stu = function.apply(new Student(111111, "shangzhendong"));
        System.out.println("stu = " + stu.getStuName().toUpperCase());
    }

    private static void testFirstFunctionByStudent ()
    {
        Function<Student, Stu> studentStuFunction = new Function<Student, Stu>()
        {

            @Override
            public Stu apply (Student student)
            {
                return new Stu(student.getName());
            }
        };

        Stu stu = studentStuFunction.apply(new Student(54321, "delong_accp"));

        System.out.println("stu = " + stu);
    }

    public static void mysum (Computer computer, int x, int y)
    {
        int r = computer.sum(x, y);
        System.out.println(r);
    }


    private static void testSecondPredicateByStudent ()
    {
        Predicate<Student> predicate = student -> student.getName().contains("ch");

        System.out.println(predicate.test(new Student(1234, "abcchenqi2")));
    }

    private static void testFirstPridecateByStudent ()
    {
        //断言型接口
        Predicate<Student> predicate = new Predicate<Student>()
        {
            @Override
            public boolean test (Student student)
            {
                return student.getName().contains("ch");
            }
        };

        System.out.println(predicate.test(new Student(555, "zhaoliu")));
    }

    private static void testSecondSupplierByStudent ()
    {
        //供给型接口
        Supplier<Student> supplier = () -> new Student(333, "chenqi");
        Student student = supplier.get();
        System.out.println(student);
    }

    private static void testFirstSupplierByStudent ()
    {
        Supplier<Student> supplier = new Supplier<Student>()
        {
            @Override
            public Student get ()
            {
                return new Student(222, "lisi");
            }
        };

        Student student = supplier.get();

        System.out.println("student = " + student.getName().toUpperCase());
    }

    private static void testSecondConsumerByStudent ()
    {
        //消费型接口
        Consumer<Student> consumer = student -> System.out.println(student);

        consumer.accept(new Student(111, "accp"));
    }

    private static void testFirstConsumerByStudent ()
    {
        Consumer<Student> consumer = new Consumer<Student>()
        {
            @Override
            public void accept (Student student)
            {
                System.out.println(student);
            }
        };

        consumer.accept(new Student(1, "delong"));
    }

    private static void testSecondLambdaByComputer ()
    {
        Computer computer = (a, b) -> a + b;
        System.out.println("computer.sum(3, 5) = " + computer.sum(3, 5));
    }

    private static void testFirstLambdaByComputer ()
    {
        Computer computer = new Computer()
        {
            @Override
            public int sum (int a, int b)
            {
                return a + b;
            }
        };

        int result = computer.sum(3, 5);

        System.out.println("result = " + result);
    }

    private static void testSecondLambdaByIHuman ()
    {
        IHuman ih = str -> System.out.println(str + " 吃饭");

        ih.eat("张三");
    }

    private static void testFristLambdaByIHuman ()
    {
        IHuman ih = new IHuman()
        {
            @Override
            public void eat (String name)
            {
                System.out.println(name + " 吃饭");
            }
        };

        ih.eat("张三");
    }
}

class Stu
{
    private String stuName;

    public Stu ()
    {
    }

    public Stu (String stuName)
    {
        this.stuName = stuName;
    }

    public String getStuName ()
    {
        return stuName;
    }

    public void setStuName (String stuName)
    {
        this.stuName = stuName;
    }

    @Override
    public String toString ()
    {
        return "stuName = " + stuName;
    }
}

class Student
{
    private int id;

    private String name;

    public Student ()
    {
    }

    public Student (int id, String name)
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
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

