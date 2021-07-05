package com.delong.se.oop;

//java中所有的类都从Object类派生出来
public class Human extends Object
{
    //属性：具有getter或setter方法的成员变量(字段)就叫属性
    private String name;

    private int age;


    /**
     * 构造方法的作用：初始化对象的属性信息
     * 没有形参的构造方法叫默认构造方法，在没有其他构造方法的前提下，
     * 默认构造方法不管你是否显示写出，系统均会自动生成一个
     */
    public Human ()
    {

        //super()调用父类中默认构造方法
        //在构造方法中，super()必须放在方法体中的第一行
//        super();

        //this()调用同一个类的构造方法
        //在构造方法中，this()必须放在方法体中的第一行
        this(null);
//        this.name = null;//this代表当前对象
//        this.age = 0;
    }

    public Human (String name)
    {
//        this.name = name;
        this(name, 0);
    }

//    public Human (int age)
//    {
//        this.age = age;
//    }

    public Human (String name, int age)
    {
        this.name = name;
        this.age = age;
    }


    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    //getter方法的作用：获取成员变量的值
    public int getAge ()
    {
        return age;
    }
    //setter方法的作用：为成员变量赋值
    public void setAge (int age)
    {
        this.age = age;
    }

    public Human (int name, String age)
    {
        this.age = name;
        this.name = age;
    }

        public void eat (int a, String b)
        {
            this.eat();
            this.toString();
            System.out.println("吃饭");
        }

    //    public void eat (String name)
    //    {
    //        System.out.println(name + "吃饭");
    //    }

    public String eat ()
    {
        return this.name + "吃饭";
    }

    //形式参数：简称形参
    public String eat (String name,  int c)
    {
        return this.name + "吃饭";
    }

    protected   void  drinking()
    {
        System.out.println("喝水");
    }
//    @Override
//    public String toString ()
//    {
//        System.out.println();
////        super.toString();//super代表父类中的实例
//        return "name = " + name + ", age=" + age;
//    }
}
