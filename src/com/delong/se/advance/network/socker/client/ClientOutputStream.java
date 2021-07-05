package com.delong.se.advance.network.socker.client;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientOutputStream extends Thread
{
    private Socket socket;

    public ClientOutputStream (Socket socket)
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
