package com.delong.se.advance.collection_generic;

import java.util.Comparator;

public class MyComparatorByOuterClass implements Comparator<Employee>
{
    /**
     * @param o1
     * @param o2
     * @return o1.getId()-o2.getId()：
     *         返回负值：则为正序排列
     *         返回零值：则为同序排列
     *         返回正值：则为倒序排列
     *
     */
    @Override
    public int compare (Employee o1, Employee o2)
    {
        return o1.getId() - o2.getId();
    }
}
