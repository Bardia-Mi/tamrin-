package bardia.java;

public class Info
{
    private static Info singletonInfo;
    public synchronized static Info getInstance() {
        if(singletonInfo == null)
        {
            singletonInfo = new Info();
        }
        return singletonInfo;
    }
    private Info(){}
    public String name;
    public String username;
    public String password;

    public void show(){
        System.out.println("your name: "+ name);
        System.out.println("your username: "+ username);
        System.out.println("your password: "+ password);
    }
}
