package com.delong.se.advance.network.socker.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientInputStream extends Thread
{
    private Socket socket;

    public ClientInputStream (Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run ()
    {
        try (InputStream inputStream = socket.getInputStream();)
        {
            byte[] b = new byte[512];

            int len = 0;
            while ((len = inputStream.read(b, 0, b.length)) != -1)
            {
                final String s = new String(b, 0, len);

                System.out.println(s);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
