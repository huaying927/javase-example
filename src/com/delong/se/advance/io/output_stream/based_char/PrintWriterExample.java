package com.delong.se.advance.io.output_stream.based_char;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterExample
{
    public void testPrintWriter ()
    {
        try (PrintWriter printWriter = new PrintWriter(new File("src/com/delong/se/advance/io/output_stream/based_char/writer.txt")))
        {
//            printWriter.write(65);
            printWriter.write("as2189的同志长得都很好看，游戏玩儿得都NB Plus");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testPrintWriter2 ()
    {
        try (PrintWriter printWriter = new PrintWriter(new File("src/com/delong/se/advance/io/output_stream/based_char/writer.txt")))
        {
            final Scanner scanner = new Scanner(System.in);
            String content = null;
            while((content = scanner.next()) != null)
            {
                if("q".equalsIgnoreCase(content))
                {
                    break;
                }

                printWriter.println(content);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testPrintWriter3 ()
    {
        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("src/com/delong/se/advance/io/output_stream/based_char/writer.txt"))))
        {
            final Scanner scanner = new Scanner(System.in);
            String content = null;
            while((content = scanner.next()) != null)
            {
                if("q".equalsIgnoreCase(content))
                {
                    break;
                }

                printWriter.println(content);
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
