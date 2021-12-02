package com.company;
import com.company.MovableCircle;
import com.company.MovablePoint;
public class Main
{
    public static void main(String[] args)
    {
        MovablePoint mp = new MovablePoint(3, 1, 5, 3);
        System.out.println(mp);
        mp.moveDown();
        mp.moveLeft();
        System.out.println(mp);
        MovableCircle mc = new MovableCircle(2, 4, 5, 2, 6);
        MovableCircle mcCopy = mc.copy();
        System.out.println("До копирования");
        System.out.println(mc);
        System.out.println(mcCopy);
        mc.moveUp();
        mc.moveRight();
        System.out.println("После копарования");
        System.out.println(mc);
        System.out.println(mcCopy);
    }
}