package bardia.java;
import java.util.Scanner;

public class Calculator implements Amaliat
{
Scanner bardia=new Scanner(System.in);
double a,b;
public void vorodi ()
{
    System.out.println("enter first num :");
 a= bardia.nextDouble();
    System.out.println("enter second num :");
 b= bardia.nextDouble();
}
    @Override
    public void jam() {
        System.out.println("jam ="+(a+b));
    }
    @Override
    public void tafrigh() {
        System.out.println("tafrigh =" + (a - b));
    }
    @Override
    public void taghsim() {
        System.out.println("taghsim ="+(a/b));
    }
    @Override
    public void zarb() {
        System.out.println("zarb ="+(a*b));
    }
}
