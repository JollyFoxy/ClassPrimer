package study;

import java.util.Scanner;
import static java.lang.System.*;

public class Program {
    public static void main (String[] args){
        Scanner scanner =new Scanner(in);

        Person jane = new Person("Jane",15,"7 Street","+12345678");
        jane.displayName();
        jane.displayAge();
        jane.displayPhone();

        out.println(jane.name);
        out.println(jane.address);
        out.println(jane.age);
    }
}
 class Person {
    String name;
    protected int age;
    public String address;
    private String phone;
    public Person(String name, int age,String address, String phone){
        this.name=name;
        this.age=age;
        this.address=address;
        this.phone=phone;
    }
    public void displayName(){
        out.printf("Name: %s \n", name);
    }
    void displayAge(){
        out.printf("Age: %d \n", age);
    }
    private void displayAddress (){
        out.printf("Address: %s \n",address);
    }
    protected void displayPhone(){
        out.printf("Phone: %s \n",phone);
    }
}
