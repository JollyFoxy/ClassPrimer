package Hierarchy;

public class Program {
    public static void main(String[] args) {
        Person dasha = new Person("Dasha");
        dasha.display();
        Employee sasha = new Employee("Sasha", "BaBank");
        ((Person)sasha).display();
        Client pasha = new Client("Pasha","BaBank",5000);
        pasha.display();

        Object sergey = new Employee("Sergey","BaBank");

        Employee emp = (Employee) sergey;
        emp.display();
        System.out.println(emp.getCompany());

        Object viktor = new Client("Victor","BaBank",10000);
        if (viktor instanceof Employee employeeVictor){
            employeeVictor.display();
        }
        else{
            System.out.println("Ne-a");
        }
    }
}
class Person{
    private String name;

    public String getName() {
        return name;
    }
    public Person(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Person: " + name);
    }
}
class Employee extends Person{
    private String company;
    public Employee(String name, String company){
        super(name);
        this.company=company;
    }

    public String getCompany() {
        return company;
    }

    public void display() {
        System.out.println("Employee "+ super.getName()+" works "+company);
    }
}
class Client extends Person{
    private int sum;
    private String bank;

    public Client(String name, String bank, int sum){
        super(name);
        this.sum = sum;
        this.bank = bank;
    }

    public void display() {
        System.out.println("Clients "+super.getName()+" has account in "+bank);
    }

    public int getSum() {
        return sum;
    }

    public String getBank() {
        return bank;
    }
}