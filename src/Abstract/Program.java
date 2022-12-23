package Abstract;

public class Program {
    public static void main(String[] args) {
        Employee sasha= new Employee("Sasha","Aa.Bank");
        sasha.display();
        Client pasha = new Client("Pasha","Aa.Bank");
        pasha.display();
    }
}
abstract class Person {
    private String name;

    public String getName() {
        return name;
    }
    public Person(String name){
        this.name=name;
    }
    public abstract void display();
}
class Employee extends Person{
    private String bank;

    public Employee(String name, String company){
        super(name);
        this.bank=company;
    }
    public void display(){
        System.out.println("Employee Name: "+ super.getName()+" Bank: "+bank);
    }
}
class Client extends Person{
    private String bank;

    public Client(String name, String company){
        super(name);
        this.bank=company;
    }
    public void display(){
        System.out.println("Client Name: "+ super.getName()+" Bank: "+bank);
    }
}