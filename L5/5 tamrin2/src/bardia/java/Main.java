package bardia.java;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner bardia=new Scanner(System.in);
        System.out.println("enter your name");
        Info.getInstance().name = bardia.nextLine();
        System.out.println("enter your username");
        Info.getInstance().username = bardia.nextLine();
        System.out.println("enter your password");
        Info.getInstance().password = bardia.nextLine();
        System.out.println("your information :");
        Info.getInstance().show();

    }
}
