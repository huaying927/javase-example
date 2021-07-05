package com.delong.se.advance.network.url;


import jdk.nashorn.internal.ir.CallNode;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class UrlTest
{
    public static void main (String[] args)
    {
        getFirstUrl();

//        getSecondUrl();
    }

    private static void getSecondUrl ()
    {
        try
        {
            final URL url = new URL("https://www.163.com");

            final InputStream inputStream = url.openStream();

            int len =0;

            byte[] b = new byte[512];

            while ((len = inputStream.read(b, 0, b.length)) != -1)
            {
                final String string = new String(b, 0, len);

                System.out.println(string);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void getFirstUrl ()
    {
        try
        {
            final URL url = new URL("https://www.163.com");

            final URLConnection urlConnection = url.openConnection();

            final InputStream inputStream = urlConnection.getInputStream();

            int len =0;

            byte[] b = new byte[512];

            while ((len = inputStream.read(b, 0, b.length)) != -1)
            {
                final String string = new String(b, 0, len);

                System.out.println(string);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
