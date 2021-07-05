package com.delong.se.advance.io.file;

import java.io.File;
import java.io.IOException;

public class FileTest
{
    public static void main (String[] args)
    {
        //        testDirectory();
//        testFile();
        testFileMethod();
    }

    private static void testFileMethod ()
    {
        File file = new File("src"+File.separator+"com/delong/se/advance/io/file/io.txt");

        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.canExecute() = " + file.canExecute());
        System.out.println("file.canRead() = " + file.canRead());
        System.out.println("file.canWrite() = " + file.canWrite());

        file.setExecutable(true);
        System.out.println("file.canExecute() = " + file.canExecute());

        file.setReadOnly();
        System.out.println("file.canWrite() = " + file.canWrite());

        System.out.println("File.separator = " + File.separator);
        System.out.println("File.separatorChar = " + File.separatorChar);
        System.out.println("File.pathSeparator = " + File.pathSeparator);
        System.out.println("File.pathSeparatorChar = " + File.pathSeparatorChar);

        System.out.println("file.getName() = " + file.getName());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        try
        {
            System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    private static void testFile ()
    {
        File file = new File("src/com/delong/se/advance/io/file/io.txt");
//        File file = new File("src/com/delong/se/advance/io/file", "io.txt");
//        File file = new File(new File("src/com/delong/se/advance/io/file"), "io.txt");

        System.out.println("file.isFile() = " + file.isFile());


    }

    private static void testDirectory ()
    {
        File file = new File("src/com/delong/se/advance/io/file2");

        //        System.out.println("file.exists() = " + file.exists());
        //        if (!file.exists())
        //        {
        //            file.mkdir();//make directory
        //        }

        //        if (file.isDirectory())
        //        {
        //            System.out.println("是目录");
        //        }

        System.out.println("file.isFile() = " + file.isFile());
    }
}

