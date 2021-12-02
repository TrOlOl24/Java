package com.company;
import java.util.Arrays;
import java.util.Objects;

public class MyArrayList
{
    private Object[] arr;
    private int size = 0;
    private int defaultsize = 8;

    public MyArrayList()
    {
        arr = new Object[defaultsize];
    }
    public MyArrayList(int size)
    {
        arr = new Object[size];
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return (size <= 0);
    }
    public void clear()
    {
        for (int i = 0; i < size; i++)
        {
            arr[i] = null;
        }
        size = 0;
    }
    public void add(Object a)
    {
        if (size >= arr.length)
        {
            int NLength = arr.length + 1;
            Object[] NList = new Object[NLength];
            System.arraycopy(arr, 0, NList, 0, arr.length);
            arr = NList;
        }
        arr[size] = a;
        size++;
    }
    public void add(Object a, int index)
    {
        int NLength = arr.length + 1;
        Object[] NList = new Object[NLength];
        for (int i = 0; i < index; i++)
        {
            NList[i] = arr[i];
        }
        NList[index] = a;
        for (int i = index + 1; i < NLength; i++)
        {
            NList[i] = arr[i-1];
        }
        arr = NList;
        size++;
    }
    @Override
    public String toString()
    {
        return "MyArrayList: " + "arr = " + Arrays.toString(arr) + ", size = " + size;
    }
}
