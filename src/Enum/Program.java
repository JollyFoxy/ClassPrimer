package Enum;

public class Program {
    public static void main(String[] args) {
        Book book = new Book("Idiot", "F. Dostoevsky", Type.BELLETRE);
        System.out.println(book.name+" "+book.bookType);
        switch (book.bookType){
            case BELLETRE:
                System.out.println("Belletre");
                break;
            case SCIENCE:
                System.out.println("Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science fiction");
                break;
            case PHANTASY:
                System.out.println("Phantasy");
                break;
        }
        Type[] types= Type.values();
        for (Type s:types){
            System.out.println(s);
            System.out.println(s.ordinal());
        }
    }
}
class Book{
    String name;
    Type bookType;
    String author;

    Book(String name,String author, Type type){
        bookType=type;
        this.name = name;
        this.author = author;
    }
}
enum Type{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}
