package Encapsulation;

import java.util.Set;

public class Encapsulation {
    public static void main(String[]a){

    }
}
class Person {
    private String name;
    private int age=1;
    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 110)
            this.age = age;
    }
}