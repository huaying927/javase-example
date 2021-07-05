package com.delong.se.advance.reflect_proxy.proxy.static_proxy;

//代理主题角色：
public class ProxyHiredHouse extends AbstractHiredHouse
{
    private HouseMaster houseMaster;

    public ProxyHiredHouse ()
    {
    }

    public ProxyHiredHouse (HouseMaster houseMaster)
    {
        this.houseMaster = houseMaster;
    }

    @Override
    public void hiredHouse ()
    {
        beforeHiredHouse();

        if (houseMaster == null)
        {
            this.houseMaster = new HouseMaster();
        }

        this.houseMaster.hiredHouse();

        this.afterHiredHouse();
    }

    public void beforeHiredHouse()
    {
        System.out.println("房子出租之前可以配置全套的家用电器");
    }

    public void afterHiredHouse()
    {
        System.out.println("房子出租成功之后负责给租房人介绍对象");
    }
}
