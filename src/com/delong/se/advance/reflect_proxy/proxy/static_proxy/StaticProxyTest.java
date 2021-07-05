package com.delong.se.advance.reflect_proxy.proxy.static_proxy;

public class StaticProxyTest
{
    public static void main (String[] args)
    {

        final AbstractHiredHouse proxyHiredHouse = new ProxyHiredHouse();

        proxyHiredHouse.hiredHouse();
    }
}
