package bardia.java;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Daneshjoo bardia = new Daneshjoo();
        bardia.setName("Bardia");
        bardia.setNumber(4004176);
        bardia.setScore (18.24);

        Map map = new TreeMap();
        map.put("name",bardia.getName());
        map.put("shomare daneshjooyi",bardia.getNumber());
        map.put("nomre",bardia.getScore());

        System.out.println("name , shomare daneshjooyi , nomre :");
        Collection result = map.values();
        for (Object t : result)
        {
            System.out.println(t);
        }
    }
}
