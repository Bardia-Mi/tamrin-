package bardia.java;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("1=riazi  \t2=mabani\t3=andishe1  \t4=riazi2\t5=brnme pishrfte\t6=andishe2");
        Scanner bardia= new Scanner(System.in);
        int name=bardia.nextInt();
        Class a =new Class();
        switch (name)
        {
            case 1:
                a.riazi1();
                break;
            case 2:
                a.mabani();
                break;
            case 3:
                a.andishe1();
                break;
            case 4:
                a.riazi2();
                break;
            case 5:
                a.barname_pishrafte();
                break;
            case 6:
                a.andishe2();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
