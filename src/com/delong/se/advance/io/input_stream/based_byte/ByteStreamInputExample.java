package com.delong.se.advance.io.input_stream.based_byte;

import java.io.*;

public class ByteStreamInputExample
{
    public void testFirstInput ()
    {
        File file = new File("src/com/delong/se/advance/io/input_stream/based_byte/byte_stream.txt");

        try (InputStream fis = new FileInputStream(file);)
        {
            int read = 0;
            while ((read = fis.read()) != -1)
            {
                if (read == -1)
                {
                    break;
                }

                System.out.println(read);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testSecondInput ()
    {
        File file = new File("src/com/delong/se/advance/io/input_stream/based_byte/byte_stream.txt");

        try (InputStream fis = new FileInputStream(file);)
        {
            byte[] bytes = new byte[512];
            int len = 0;
            while ((len = fis.read(bytes)) != -1)
            {
                String cont = new String(bytes);
                System.out.println(cont);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testThirdInput ()
    {
        File file = new File("src/com/delong/se/advance/io/input_stream/based_byte/byte_stream.txt");

        try (InputStream fis = new FileInputStream(file);)
        {
            byte[] bytes = new byte[512];
            int len = 0;
            while ((len = fis.read(bytes, 0, bytes.length)) != -1)
            {
                String cont = new String(bytes, 0, len);
                System.out.println(cont);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

