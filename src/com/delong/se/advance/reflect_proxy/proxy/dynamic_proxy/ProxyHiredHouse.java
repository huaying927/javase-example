package com.delong.se.advance.reflect_proxy.proxy.dynamic_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//代理主题角色：实现InvocationHandler接口
public class ProxyHiredHouse implements InvocationHandler
{
    private HouseMaster houseMaster;
    private ExtraFunction extraFunction;

    public ProxyHiredHouse ()
    {
    }

    public ProxyHiredHouse (HouseMaster houseMaster, ExtraFunction extraFunction)
    {
        this.houseMaster = houseMaster;
        this.extraFunction = extraFunction;
    }

    @Override
    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable
    {
        if (this.extraFunction == null)
        {
            this.extraFunction = new ExtraFunction();
        }

        this.extraFunction.beforeHiredHouse();

        if (houseMaster == null)
        {
            this.houseMaster = new HouseMaster();
        }

        final Object returnObj = method.invoke(houseMaster, args);

        this.extraFunction.afterHiredHouse();

//        System.out.println("returnObj = " + returnObj);
        return returnObj;
    }


}
