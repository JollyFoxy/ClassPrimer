package Inheritance;

public class Person {
    String name;
    public String getName(){
        return name;
    }
    public Person(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Name: "+ name);
    }
}
