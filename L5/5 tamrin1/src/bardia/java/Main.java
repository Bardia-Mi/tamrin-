package bardia.java;

public class Main {
    public static void main(String[] args)
    {
        builder bardia = new builder().setName("Bardia").setFamily("Mirakhorloo").setAge(18).setNumber(4004176).setUsername("bardiami").setPassword("bardia123").setAddress("jordan").setTahsilat("diplom");
        System.out.println("name: " + bardia.getName());
        System.out.println("family: " + bardia.getFamily());
        System.out.println("age: " + bardia.getAge());
        System.out.println("number: " + bardia.getNumber());
        System.out.println("tahsilat: " + bardia.getTahsilat());
        System.out.println("address: " + bardia.getAddress());
        System.out.println("username: " + bardia.getUsername());
        System.out.println("password: " + bardia.getPassword());
    }
}
