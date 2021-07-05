package com.delong.se.advance.network.socker.client;

import java.io.IOException;
import java.net.Socket;

public class ClientMain
{
    public static void main (String[] args)
    {
        try
        {
            final Socket client = new Socket("127.0.0.1", 9999);

            final ClientInputStream clientInputStream = new ClientInputStream(client);

            final ClientOutputStream clientOutputStream = new ClientOutputStream(client);

            clientInputStream.start();

            clientOutputStream.start();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
