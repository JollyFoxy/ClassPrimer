package Interface;

public class Program {
    public static void main(String[] args) {
        Book bookIdiot = new Book("Idiot", "Dostoevsky");
        bookIdiot.print();

        Printable printable =createPrintable("TopGer",false);
        printable.print();

        read(new Book("Hobbit","Tolkien"));
        read(new Journal("News"));

        Printable p = new Journal("National Geographic");
        p.print();

        String name = ((Journal)p).getName();
        System.out.println(name);


    }
    static void read(Printable p){
        p.print();
    }
    static Printable createPrintable(String name, boolean option){
        if (option)
            return new Book(name, "No");
        else
            return  new Journal(name);
    }
}
interface Printable{
    default void print(){
        System.out.println("Ne robit :(");
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