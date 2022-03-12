//tamrin kelasi bardia mirakhorloo 40012341054176
package bardia.java;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner bardia=new Scanner(System.in);
        int []a=new int[50];
        int b,n,i;
        int tekrar=0;
        System.out.println("Enter single number :");
        b=bardia.nextInt();
        System.out.println("Enter n :");
        n=bardia.nextInt();
        System.out.println("Enter n numbers :");
        for (i=0;i<n;i++)
            {
            a[i]=bardia.nextInt();
            }
        for (i=0;i<n;i++)
        {
            if (a[i]==b)
            tekrar=tekrar+1;
        }
        if (tekrar==0)
        {
            System.out.print("false \n tedad tekrar :");
        }
        else
            System.out.print("true \n tedad tekrar :");
            System.out.print(tekrar);
    }
}
