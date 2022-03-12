package bardia.java;

import java.util.Scanner;

public class Add implements Myinteger
{
    Scanner bardia=new Scanner(System.in);
    int a;
    public void vorodi()
    {
        System.out.println("enter num :");
        a=bardia.nextInt();
    }
    @Override
    public void isEven() {
        if(a%2==0 && a!=0)
        {
            System.out.println("number is even");
        }
    }
    @Override
    public void isOdd() {
        if (a%2!=0)
        {
            System.out.println("number is odd");
        }
    }
    @Override
    public void isPosetive() {
        if(a>0)
        {
            System.out.println("number is positive");
        }
    }
    @Override
    public void isNegetive() {
        if(a<0)
        {
            System.out.println("number is negetive");
        }
    }
    @Override
    public void isZero() {
        if(a==0)
        {
            System.out.println("number is zero");
        }
    }
}
