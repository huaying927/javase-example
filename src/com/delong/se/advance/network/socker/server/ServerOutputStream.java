package com.delong.se.advance.network.socker.server;

import sun.reflect.annotation.ExceptionProxy;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ServerOutputStream extends Thread
{
    private Socket socket;

    public ServerOutputStream (Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run ()
    {
        try (OutputStream outputStream = socket.getOutputStream(); Scanner scanner = new Scanner(System.in);)
        {
            String input = null;

            while ((input = scanner.next()) != null)
            {
                outputStream.write(input.getBytes(), 0, input.length());
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
