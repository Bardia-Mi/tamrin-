package bardia.java;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner bardia=new Scanner(System.in);
        double []a=new double[50];
        int []b=new int[50];
        int n,i,z=0;
        double moadel,j=0;
        System.out.println("Enter n lesson :");
        n=bardia.nextInt();
        for (i=0;i<n;i++)
        {
            System.out.println("Enter your points :");
            a[i]= bardia.nextDouble();
            System.out.println("Enter * for lesson :");
            b[i]=bardia.nextInt();
            if (a[i]>20 || a[i]<0)
            {
                System.out.println("Erorr");
            }
            j=j+(a[i]*b[i]);
            z+=b[i];
        }
        moadel=j/z;
        System.out.println(moadel);
        if (moadel>=10)
        {
            System.out.println("pass!");
        }
        else
        {
            System.out.println("fail!");
        }
    }
}
