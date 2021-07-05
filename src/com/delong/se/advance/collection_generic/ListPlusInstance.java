package com.delong.se.advance.collection_generic;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ListPlusInstance
{
    public void testListPlus()
    {
        Employee emp1 = new Employee(1, "zhangsan");
        Employee emp2 = new Employee(2, "lisi");
        Employee emp3 = new Employee(3, "wangwu");
        Employee emp4 = new Employee(4, "zhaoliu");
        Employee emp5 = new Employee(5, "chenqi");

        List<Employee> list = new ArrayList<>();
        list.add(emp3);
        list.add(emp1);
        list.add(emp5);
        list.add(emp4);
        list.add(emp2);

//        System.out.println(list);

        //1.命名的外部类实现
//        Collections.sort(list, new MyComparatorByOuterClass());

        //2.命名的内部类实现
//        Collections.sort(list, new MyComparatorByInnerClass());

        //3. 方法的引用
//        Collections.sort(list, new MyComparatorByInnerClass()::compare);

        //4. 匿名内部类的实现
//        Collections.sort(list, new Comparator<Employee>()
//        {
//            @Override
//            public int compare (Employee o1, Employee o2)
//            {
//                return o1.getId() - o2.getId();
//            }
//        });

        //5. lambda方式排序: ->
        //lambda(->)：lambda表达式的左边是匿名内部类中实现方法的形参，
        // 如果形参大于1，则要加上一对小括号把形参包括起来，并且其形参的
        // 类型可以省略.如果形参只有一个，则可以把小括号及其类型省略。
        //lambda表达式的右边是匿名内部类中实现方法的方法体.如果该方法由
        // 返回值，则一定要在lambda表达式的右边加上一对大括号；或者方法
        // 体中的代码行数大于一行也要加上大括号。
//        Collections.sort(list, (e1, e2) -> { return e1.getId() - e2.getId(); });


//                Comparator<Employee> comparator = new Comparator<Employee>()
//                {
//                    @Override
//                    public int compare (Employee o1, Employee o2)
//                    {
//                        return o1.getId() - o2.getId();
//                    }
//                };
//
//                Collections.sort(list, comparator);

        //函数式编程：是功能性接口或叫函数式接口
        Collections.sort(list, (o1,  o2) -> o1.getId() - o2.getId());



//        for (Employee employee : list)
//        {
//            System.out.println(employee);
//        }

//        for(Iterator<Employee> it = list.iterator();it.hasNext();)
//        {
//            System.out.println(it.next());
//        }

        //输出结果的匿名内部类的实现方式
//        list.forEach(new Consumer<Employee>()
//        {
//            @Override
//            public void accept (Employee employee)
//            {
//                System.out.println(employee);
//            }
//        });

//        list.forEach(e -> System.out.println(e));

        list.stream().filter(e -> e.getId() > 3).forEach(e -> System.out.println(e));

    }


    private class MyComparatorByInnerClass implements Comparator<Employee>
    {
        @Override
        public int compare (Employee o1, Employee o2)
        {
            return o1.getName().compareTo(o2.getName());
        }
    }


}


class Employee
{
    private int id;

    private String name;

    public Employee ()
    {
    }

    public Employee (int id, String name)
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
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
