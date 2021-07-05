package com.delong.se.advance.io.transform.byte_to_char;

import java.io.*;

public class ByteToCharExample
{
    public void testCharToByte()
    {
        try (BufferedReader printReader =
                new BufferedReader(
                        new InputStreamReader(
                                new BufferedInputStream(
                                        new DataInputStream(
                                                new FileInputStream(
                                                        new File("src/com/delong/se/advance/io/io.txt")))))))
        {
        }
        catch (Exception e)
        {

        }
    }
}
