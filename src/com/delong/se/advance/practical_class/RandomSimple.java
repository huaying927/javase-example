package com.delong.se.advance.practical_class;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongFunction;
import java.util.stream.IntStream;

public class RandomSimple
{
    public void testRandom ()
    {
        Random random = new Random();
        //        System.out.println("random.nextDouble() = " + random.nextDouble());//[0,1)
        //        System.out.println("random.nextInt() = " + random.nextInt());
        //        System.out.println("random.nextInt(100) = " + random.nextInt(100));//[0, 100)

        //        IntStream intStream = random.ints(5);
        //        intStream.forEach(num -> System.out.println(num));
        //        random.ints(5).forEach(num -> System.out.println(num));
        //        random.ints(5).forEach(System.out::println);

                System.out.println("random.ints(100, 100) = " + random.ints(1, 100));
    }




}


