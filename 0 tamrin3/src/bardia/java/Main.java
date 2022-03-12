//tamrin 3 bardia mirakhorloo 40012341054176
package bardia.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner bardia=new Scanner(System.in);
        int a,b;
        System.out.println("Enter number 1 :");
        a=bardia.nextInt();
        System.out.println("Enter number 2 :");
        b=bardia.nextInt();
        int num;
        System.out.println("Enter num between 1 to 4 :\n1 = +    2 = -    3 = *    4 = / ");
        num=bardia.nextInt();
        switch (num)
        {
            case 1 :
                    System.out.println(a+b);
                break;
            case 2 :
                if (a>b)
                 {
                    System.out.println(a-b);
                 }
                else if (b>a)
                 {
                    System.out.println(b-a);
                 }
                break;
            case 3 :
                    System.out.println(a*b);
                break;
            case 4 :
                if (a>b)
                 {
                    System.out.println(a/b);
                 }
                else if (b>a)
                 {
                    System.out.println(b/a);
                 }
                break;
            default:
                    System.out.println("Error");
        }
    }
}
