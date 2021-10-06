package com.company;

public class Number3
{
    public static String recursion3(int a, int b)
    {
        if (a > b)
        {
            if (a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + recursion3(a - 1, b);
        }
        else
        {
            if (a == b)
            {
                return Integer.toString(a);
            }
            return a + " " + recursion3(a + 1, b);
        }
    }
}
