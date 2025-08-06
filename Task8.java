import java.util.LinkedList;

public class Task8 {
    public static void main(String[] args) {
        
        LinkedList<String> colors = new LinkedList<>();

        
        colors.add("Blue");
        colors.add("White");
        colors.add("Purple");
        colors.add("Grey");

        
        colors.addLast("Purple");

      
        System.out.println("Colors in the LinkedList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}


