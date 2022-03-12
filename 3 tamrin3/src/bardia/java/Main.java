package bardia.java;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        try
        {
        str();
        }
        catch (Reshte e)
        {
            System.out.println("adad dar jomle ");
        }
    }
    public static void str()throws Reshte
    {
        Scanner bardia=new Scanner(System.in);
        System.out.println("enter sth :");
        String str = bardia.nextLine();
        int adad=0;
        for (int i=0 ;i<str.length();i++)
        {
            if (str.charAt(i)>=48 && str.charAt(i)<=57)
                adad++;
        }
        if (adad>0)
        {
            throw new Reshte("add dar jomle");
        }
        else
        {
            System.out.println("tool reshte :"+str.length());
        }
    }
}
