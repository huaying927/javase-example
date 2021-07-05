package com.delong.se.advance.reflect_proxy.proxy.dynamic_proxy;

public class ExtraFunction
{
    public void beforeHiredHouse ()
    {
        System.out.println("房子出租之前可以配置全套的家用电器");
    }

    public void afterHiredHouse ()
    {
        System.out.println("房子出租成功之后负责给租房人介绍对象");
    }
}
