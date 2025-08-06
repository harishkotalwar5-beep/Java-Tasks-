import java.util.Vector;

public class Task7 {
    public static void main(String[] args) {
        
        Vector<String> books = new Vector<>();

        // Add 3 book names
        books.add("The Great Gatsby");
        books.add("To Kill a Mockingbird");
        books.add("1984");

      
        books.add(0, "Pride and Prejudice");

        
        System.out.println("Books in the Vector:");
        for (String book : books) {
            System.out.println(book);
        }
    }
}
