package com.company;

public class Number1
{
    public static String recursion1(int n)
    {
        int sum = 0;
        int j = 0;
        if (n == 1)
        {
            System.out.print("1");
        }
        else
        {
            for (int i = 1; sum < n; i++)
            {
                sum += i;
                j = i;
            }
            System.out.print(recursion1(--n) + " " + j);
        }
        return "";
    }
}