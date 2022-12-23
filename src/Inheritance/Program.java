package Inheritance;

public class Program {
    public static void main(String[]args) {
        Person pasha = new Person("Pasha");
        pasha.display();
        Person sasha = new Employee("Sasha","FCLTA.inc");
        sasha.display();
    }
}
class Person {
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
class Employee extends Person{

    String company;
    public Employee(String name, String company){
        super(name);
        this.company=company;
    }

    @Override
    public void display() {
        System.out.println("Employee "+super.getName()+" Works: "+ company);
    }
}
