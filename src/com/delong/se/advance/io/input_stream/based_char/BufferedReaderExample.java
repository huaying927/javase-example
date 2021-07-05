package com.delong.se.advance.io.input_stream.based_char;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderExample
{
    public void testBufferedReader ()
    {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/com/delong/se/advance/io/input_stream/based_char/reader.txt"))))
        {
            //            System.out.println("bufferedReader.read() = " + bufferedReader.read());

            System.out.println("bufferedReader.readLine() = " + bufferedReader.readLine());
            System.out.println("bufferedReader.readLine() = " + bufferedReader.readLine());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testBufferedReader2 ()
    {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/com/delong/se/advance/io/input_stream/based_char/reader.txt"))))
        {
            String content = null;
            while ((content = bufferedReader.readLine()) != null)
            {
                System.out.println("content = " + content);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testBufferedReader3 ()
    {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/com/delong/se/advance/io/input_stream/based_char/reader.txt"))))
        {

            while (true)
            {
                String content = bufferedReader.readLine();
                if ("".equals(content) || null == content)
                {
                    break;
                }
                System.out.println("content = " + content);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
