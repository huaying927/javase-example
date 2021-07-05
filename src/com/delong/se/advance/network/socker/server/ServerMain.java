package com.delong.se.advance.network.socker.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain
{
    public static void main (String[] args)
    {
        try (final ServerSocket server = new ServerSocket(9999);)
        {
            while (true)
            {
                final Socket accept = server.accept();

                final ServerInputStream serverInputStream = new ServerInputStream(accept);

                final ServerOutputStream serverOutputStream = new ServerOutputStream(accept);

                serverInputStream.start();

                serverOutputStream.start();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
