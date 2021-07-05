package com.delong.se.advance.reflect_proxy.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//动态代理：只能代理接口
public class DynamicProxyTest
{
    public static void main (String[] args)
    {
        final InvocationHandler handler = new ProxyHiredHouse();

        final IHiredHouse iHiredHouse =
                (IHiredHouse) Proxy.newProxyInstance(IHiredHouse.class.getClassLoader(), new Class<?>[]{IHiredHouse.class}, handler);

        iHiredHouse.hiredHouse();

    }
}
