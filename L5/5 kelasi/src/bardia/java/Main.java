package bardia.java;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner bardia=new Scanner(System.in);
        System.out.println("enter your first number");
        int a = bardia.nextInt();
        System.out.println("enter your second number");
        int b = bardia.nextInt();
        System.out.println("- or +?");
        Calculate hesab = CalcFactory.getCalc(bardia.next().charAt(0));
        System.out.println(hesab.calc(a , b));
    }
}
