import java.util.LinkedList;

public class Task8 {
    public static void main(String[] args) {
        
        LinkedList<String> colors = new LinkedList<>();

        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        
        colors.addLast("Purple");

      
        System.out.println("Colors in the LinkedList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

