package com.delong.se.advance.reflect_proxy.proxy.dynamic_proxy;

//真实主题角色
public class HouseMaster implements IHiredHouse
{
    @Override
    public void hiredHouse ()
    {
        System.out.println("出租房子。。。");
    }
}
