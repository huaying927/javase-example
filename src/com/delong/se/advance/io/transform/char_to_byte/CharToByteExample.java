package com.delong.se.advance.io.transform.char_to_byte;

import java.io.*;

public class CharToByteExample
{
    public void testCharToByte()
    {
        try (PrintWriter printWriter = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new BufferedOutputStream(
                                        new DataOutputStream(
                                                new FileOutputStream(
                                                        new File("src/com/delong/se/advance/io/io.txt"))))))))
        {
        }
        catch (Exception e)
        {

        }
    }
}
