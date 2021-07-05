package com.delong.se.advance.io.output_stream.based_char;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedWriterExample
{
    public void testBufferedWriter()
    {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(
                        new File("src/com/delong/se/advance/io/output_stream/based_char/writer2.txt"))))
        {
//            bufferedWriter.write(97);
            bufferedWriter.write("as2189 888");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testBufferedWriter2()
    {
        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(
                        new File("src/com/delong/se/advance/io/output_stream/based_char/writer3.txt"))))
        {
            final Scanner scanner = new Scanner(System.in);

            String content = null;
            while((content = scanner.next()) != null)
            {
                if("q".equalsIgnoreCase(content))
                {
                    break;
                }
                bufferedWriter.write(content);

                bufferedWriter.flush();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testBufferedWriter3()
    {
        try (PrintWriter bufferedWriter = new PrintWriter(new BufferedWriter(
                new FileWriter(
                        new File("src/com/delong/se/advance/io/output_stream/based_char/writer4.txt")))))
        {
            final Scanner scanner = new Scanner(System.in);

            String content = null;
            while((content = scanner.next()) != null)
            {
                if("q".equalsIgnoreCase(content))
                {
                    break;
                }
                bufferedWriter.println(content);

                bufferedWriter.flush();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
