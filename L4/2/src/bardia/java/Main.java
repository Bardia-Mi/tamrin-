package bardia.java;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner bardia = new Scanner(System.in);
        User user = new User();
        User copy1 = null;
        User copy2 = null;
        User copy3 = null;

        System.out.print("enter your name=");
        user.setName(bardia.nextLine());
        System.out.print("enter your family=");
        user.setFamily(bardia.nextLine());
        System.out.print("enter your age=");
        user.setAge(bardia.nextInt());


    try {
    copy1 = (User) user.clone();
    }catch (CloneNotSupportedException e){
    System.out.println("clone 1 error");
    }try {
    copy2 = (User) user.clone();
    }catch (CloneNotSupportedException e){
        System.out.println("clone 2 error");
    }try {
        copy3 = (User) user.clone();
    }catch (CloneNotSupportedException e){
        System.out.println("clone 3 error");
    }
        if(!user.equals(copy1) && !user.equals(copy2) && !user.equals(copy3))
        {
            System.out.println("info :");

            System.out.println(user);
            System.out.println(copy1);
            System.out.println(copy2);
            System.out.println(copy3);

            System.out.println("name= "+ user.getName());
            System.out.println(copy1.getName());
            System.out.println(copy2.getName());
            System.out.println(copy3.getName());

            System.out.println("family= "+ user.getFamily());
            System.out.println(copy1.getFamily());
            System.out.println(copy2.getFamily());
            System.out.println(copy3.getFamily());

            System.out.println("age= "+ user.getAge());
            System.out.println(copy1.getAge());
            System.out.println(copy2.getAge());
            System.out.println(copy3.getAge());

        }
    }
}
