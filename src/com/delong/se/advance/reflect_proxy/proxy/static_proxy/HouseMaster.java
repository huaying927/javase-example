package com.delong.se.advance.reflect_proxy.proxy.static_proxy;

//真实主题角色
public class HouseMaster extends AbstractHiredHouse
{
    @Override
    public void hiredHouse ()
    {
        System.out.println("出租房子。。。");
    }
}
