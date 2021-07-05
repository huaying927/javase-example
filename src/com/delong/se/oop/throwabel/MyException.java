package com.delong.se.oop.throwabel;

/**
 * 自定义异常：一定要继承异常根类Exception, 并且要重写异常中所有的构造方法，
 *           根据需求自己也可以定义异常构造方法
 */
public class MyException extends Exception
{
    public MyException ()
    {
        super();
    }

    public MyException (String message)
    {
        super(message);
    }

    public MyException (String message, Throwable cause)
    {
        super(message, cause);
    }

    public MyException (Throwable cause)
    {
        super(cause);
    }

    protected MyException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
