package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        int count = 0;
        int res = 0;

        System.out.println("Карты 1 игрока:");
        for (int i = 0; i < 5; i++)
        {
            arr.add(s.nextInt());
        }
        System.out.println("Карты 2 игрока:");
        for (int i = 0; i < 5; i++)
        {
            arr1.add(s.nextInt());
        }

        for (int i = 0; i < 106; i++)
        {
            count+=1;
            if ((arr.get(0) != 0) && (arr.get(0) != 9) && (arr1.get(0) != 0) && (arr1.get(0) != 9) && (arr.get(0) > arr1.get(0)))
            {
                arr.add(arr.get(0));
                arr.add(arr1.get(0));
                arr.remove(0);
                arr1.remove(0);
            }
            else if ((arr.get(0) == 0) && arr1.get(0) == 9)
            {
                arr.add(arr.get(0));
                arr.add(arr1.get(0));
                arr.remove(0);
                arr1.remove(0);
            }
            else if ((arr.get(0) != 0) && (arr.get(0) != 9) && (arr1.get(0) != 0) && (arr1.get(0) != 9) && (arr1.get(0) > arr.get(0)))
            {
                arr1.add(arr.get(0));
                arr1.add(arr1.get(0));
                arr.remove(0);
                arr1.remove(0);
            }
            else if ((arr1.get(0) == 0) && arr.get(0) == 9)
            {
                arr1.add(arr.get(0));
                arr1.add(arr1.get(0));
                arr.remove(0);
                arr1.remove(0);
            }

            if (arr1.size() == 0)
            {
                System.out.println("First; Количество ходов:" + count);
                res = 1;
                break;
            }
            else if (arr.size() == 0)
            {
                System.out.println("Second; Количество ходов:" + count);
                res = 1;
                break;
            }
        }
        if (res != 1)
        {
            System.out.println("Botva");
        }
    }
}