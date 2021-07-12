import java.util.Random;
public class BookApp {
    public static void main(String [] args) {
        Book Book1 = new Book("The Bear", "Bla Blu", " This is children book", 19.07f, true);
        System.out.println(Book1.getAuthor());

        Book Book2 = new Book("Java", "Ruth", "Learning material", 77.92f, false);
        System.out.println(Book2.getAuthor());

    }
}
