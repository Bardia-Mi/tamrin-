package bardia.java;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner bardia=new Scanner(System.in);
      Shekl chanzeli =new Shekl();
        System.out.println("Enter tool :");
      chanzeli.tool= bardia.nextInt();
        System.out.println("Enter arz :");
      chanzeli.arz= bardia.nextInt();

      chanzeli.mohit();
      chanzeli.masahat();
    }
}
