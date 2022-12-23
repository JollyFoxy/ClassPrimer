package Ststic;

public class Static {
    public static void main (String[] a){
        Person pasha = new Person();
        Person sasha = new Person();

        pasha.displayId();
        sasha.displayId();

        System.out.println(Operation.sum(54,22));
        System.out.println(Operation.multiply(64,2));
        System.out.println(Operation.subtract(8,45));

//        double radius =60;
//        System.out.println("Radius: "+radius);
//        System.out.println("Area: "+ Math.PI*radius);
    }
}
class Math{
    public static final double PI=3.14;
}
class Person {
    private int id;
    private static int counter=1;
//    static {
//        counter=105;
//        System.out.println("Ststic.Static initializer");
//    }
    Person(){
        id= counter++;
        System.out.println("Constructor");
    }
    public static void displayCounter(){
        System.out.println("Counter: "+ counter);
    }
    public void displayId(){
        System.out.printf("ID: %d \n", id);
    }
}
class Operation{
    static int sum(int x,int y){
        return x+y;
    }
    static int subtract(int x, int y){
        return x-y;
    }
    static int multiply(int x, int y){
        return x*y;
    }
}
