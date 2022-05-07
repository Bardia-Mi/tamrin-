package bardia.java;

public class Main
{
    public static void main(String[] args)
    {
        Random person = new Random();
        person.setName("Bardia");
        person.setFamily("Mirakhorloo");
        person.setAge(18);
        person.setJob("com eng");
        person.setUsername("Bardia_mi");
        person.setPassword("bardiabardia");
        System.out.println("name= "+ person.getName());
        System.out.println("family name= "+ person.getFamily());
        System.out.println("age= "+ person.getAge());
        System.out.println("job= "+ person.getJob());
        System.out.println("username= "+ person.getUsername());
        System.out.println("password= "+ person.getPassword());
    }
}
