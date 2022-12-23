package Interface;

public class Program {
    public static void main(String[] args) {
        Book bookIdiot = new Book("Idiot", "Dostoevsky");
        bookIdiot.print();

        Printable printable =new Book("Dog's heart","Bulgakov");
        printable.print();
        printable = new Journal("TopGer");
        printable.print();

        Printable p = new Journal("National Geographic");
        p.print();

        String name = ((Journal)p).getName();
        System.out.println(name);
    }
}
interface Printable{
    default void print(){
        System.out.println("Ne robit :(");
    }
    static void read(){
        System.out.println("read");
    }
}
class Book implements Printable{
    String name;
    String author;

    Book(String name, String author){
        this.author=author;
        this.name=name;
    }
    public void print (){
        System.out.println("Author "+author+" book name "+name);
    }
}
class Journal implements Printable{
    private String name;

    public String getName() {
        return name;
    }
    Journal(String name){
        this.name=name;
    }
    public void print(){
        System.out.println("Journal name "+name);
    }
}