public class Static {
    public static void main (String[] a){
        Person1 pasha = new Person1();
        Person1 saasha =
    }
}
class Person1{
    private int id;
    static int counter=1;
    Person1(){
        id= counter++;
    }
    public void displayId(){
        System.out.printf("ID: %d \n", id);

    }
}
