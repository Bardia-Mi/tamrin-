package bardia.java;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        try
        {
        info();
        }
        catch (Karbar e)
        {
            System.out.println("Tekrari !!!");
        }
    }
    public static void info ()throws Karbar
    {
        Scanner bardia=new Scanner(System.in);
    String[]a =new String[5];
    String[]b =new String[5];
        System.out.println("Enter name 1 :");
            a[0]=bardia.nextLine();
        System.out.println("Enter family 1 :");
            a[1]=bardia.nextLine();
        System.out.println("Enter age 1 :");
            a[2]=bardia.nextLine();
        System.out.println("Enter name 2 :");
            b[0]=bardia.nextLine();
        System.out.println("Enter family 2 :");
            b[1]=bardia.nextLine();
        System.out.println("Enter age 2 :");
            b[2]=bardia.nextLine();
        if (a[0].equals(b[0]) && a[1].equals(b[1]) && a[2].equals(b[2]))
        {
            throw new Karbar("karbar tekrri");
        }
        else
        {
            System.out.println("new karbar");
        }

    }
}
