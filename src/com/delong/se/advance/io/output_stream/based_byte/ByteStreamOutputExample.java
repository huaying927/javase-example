package com.delong.se.advance.io.output_stream.based_byte;

import java.io.*;
import java.util.Scanner;

public class ByteStreamOutputExample
{

    public void testFirstOutput()
    {
        File file = new File("src/com/delong/se/advance/io/output_stream/based_byte/byte_stream.txt");

        OutputStream fos =  null;
        try
        {
            fos = new FileOutputStream(file);
            fos.write(97);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fos.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
    public void testSecondOutput()
    {
        File file = new File("src/com/delong/se/advance/io/output_stream/based_byte/byte_stream.txt");

        //try-with-resource:小括号中只能放实现了Closeable或AutoCloseable接口的类
        try(OutputStream fos = new FileOutputStream(file);)
        {
            String content = "abbc";
            fos.write(content.getBytes());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void testThirdOutput()
    {
        File file = new File("src/com/delong/se/advance/io/output_stream/based_byte/byte_stream.txt");

        Scanner scanner = new Scanner(System.in);
        String content =null;
        //try-with-resource:小括号中只能放实现了Closeable或AutoCloseable接口的类
        try(OutputStream fos = new FileOutputStream(file);)
        {
            while((content = scanner.next()) != null)
            {
                if ("q".equalsIgnoreCase(content))
                {
                    break;
                }
                byte[] bytes = content.getBytes();
                fos.write(bytes, 0, bytes.length);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
