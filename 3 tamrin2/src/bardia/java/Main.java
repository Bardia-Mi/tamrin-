package bardia.java;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
        x();
        }
        catch (Moadele e)
        {
            System.out.println("moadele javab nadarad");
        }
    }
    public static void x()throws Moadele
    {
        Scanner bardia=new Scanner(System.in);
        int a,b,c,x,delta;
        System.out.println("ax^2+bx+c=0");
        System.out.println("Enter a :");
        a=bardia.nextInt();
        System.out.println("Enter b :");
        b=bardia.nextInt();
        System.out.println("Enter c :");
        c=bardia.nextInt();
        delta=(b*b)-(4*(a*c));
        System.out.println(delta);
        if (delta<0)
        {
            throw new Moadele("delta<0");
        }
        else if (delta==0)
        {
            System.out.println("yek rishe ="+(-b+(Math.sqrt(delta)))/(2*a));
        }
        else
        {
            System.out.println("2 rishe darad");
            System.out.println("rishe 1="+(-b+(Math.sqrt(delta)))/(2*a));
            System.out.println("rishe 2="+(-b-(Math.sqrt(delta)))/(2*a));
        }
    }
}
