package Inheritance;

public class Program {
    public static void main(String[]args) {
        Person1 pasha = new Person1("Pasha");
        pasha.display();
        Person1 sasha = new Employee("Sasha","FCLTA.inc");
        sasha.display();
    }
}
class Person1 {
    String name;
    public String getName(){
        return name;
    }
    public Person1(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Name: "+ name);
    }
}
class Employee extends Person1 {

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
