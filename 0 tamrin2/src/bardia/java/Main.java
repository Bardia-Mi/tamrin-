//tamrin 2 bardia mirakhorloo 40012341054176
package bardia.java;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner bardia=new Scanner(System.in);
        int[] a = new int[50];
        int n,i,j;
        System.out.println("Enter n :");
        n= bardia.nextInt();
        System.out.println("Enter Numbers :");
        for (i=0;i<n;i++)
         {
         a[i]=bardia.nextInt();
         }
        j= a[i];
        for (;i>=0;i--)
         {
           if (a[i]>j)
           {
           j= a[i];
           }
         }
        System.out.println(j);
        }
}
