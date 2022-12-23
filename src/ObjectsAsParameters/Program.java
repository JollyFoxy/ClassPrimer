package ObjectsAsParameters;

public class Program {
    public static void main(String[] args){
        Person pasha = new Person("Pasha");
        System.out.println(pasha.getName());
        changePerson (pasha);
        System.out.println(pasha.getName());
    }
    static void changePerson(Person p){
        p=new Person("Victor");
        p.setName("Vica");
    }
    static void changeName(Person p){
        p.setName("Victor");
    }
}
class Person{
    private String name;

    Person(String name){
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}