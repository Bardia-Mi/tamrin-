package bardia.java;

import java.util.Scanner;

public class builder
{
    private String name;
    private String family ;
    private int age;
    private String address;
    private  int number;
    private String tahsilat;
    private String username;
    private String password;

    Scanner bardia=new Scanner(System.in);

    public builder setName(String name) {
        this.name = name;
        return this;
    }

    public builder setFamily(String family) {
        this.family = family;
        return this;
    }

    public builder setAge(int age) {
        this.age = age;
        return this;
    }

    public builder setAddress(String address) {
        this.address = address;
        return this;
    }

    public builder setNumber(int number) {
        this.number = number;
        return this;
    }

    public builder setTahsilat(String education) {
        this.tahsilat = education;
        return this;
    }

    public builder setUsername(String username) {
        this.username = username;
        return this;
    }

    public builder setPassword(String password) {
        this.password = password;
        return this;
    }


    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public String getTahsilat() {
        return tahsilat;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
