package bardia.java;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
     try
      {
          daneshjoo();
      }
         catch (Stu e)
         {
             System.out.println("INCORRECT USER NAME OR PASSWORD");
         }
    }
    public static void daneshjoo ()throws Stu
    {
            String name="bardia";
            String username="bardiami";
            String password="bardia1234";
    Scanner bardia=new Scanner(System.in);
        System.out.println("Enter your name :");
            String name1= bardia.nextLine();
        System.out.println("Enter your username :");
            String username1= bardia.nextLine();
        System.out.println("Enter your password :");
            String password1= bardia.nextLine();
            if (!name.equals(name1) || !username.equals(username1) || !password.equals(password1))
            {
                throw new Stu("INCORRECT USERNAME OR PASSWORD !!!");
            }
            else
            {
                System.out.println("CORRECT");
            }

    }
}
