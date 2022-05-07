package bardia.java;
import java.util.ArrayList;
import java.util.List;
public class Main
{
    public static void main(String[] args)
    {
        Daneshjoo num1 = new Daneshjoo();
        num1.setName("BARDIA");
        num1.setStu_num(4004176);
        num1.setFatherName("SHAHRAM");

        List<String> list = new ArrayList<>();
        list.add("12.5");
        list.add("19");
        list.add("18");
        list.add("15");
        list.add("20");

        System.out.println("esm = "+ num1.getName());
        System.out.println("shomare daneshjooyi = "+ num1.getStu_num());
        System.out.println("esm pedar = "+ num1.getFatherName());
        System.out.println("nomarat =");
        for (String s : list)
        {
            System.out.println(s);
        }

    }
}
