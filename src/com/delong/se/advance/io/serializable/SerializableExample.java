package com.delong.se.advance.io.serializable;

import java.io.*;

public class SerializableExample
{
    public void testSerializableExample ()
    {
        final Employee emp = new Employee(111, "zhangsan");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(
                                new File("src/com/delong/se/advance/io/serializable/seria.txt")))))
        {
            objectOutputStream.writeObject(emp);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void testReSerializableExample ()
    {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new DataInputStream(new BufferedInputStream(new FileInputStream(new File("src/com/delong/se/advance/io/serializable/seria.txt"))))))
        {
            Employee emp = (Employee) objectInputStream.readObject();
            System.out.println(emp);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
