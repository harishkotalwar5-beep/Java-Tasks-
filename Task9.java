import java.util.Stack;

public class Task9 {
    public static void main(String[] args) {
      
        Stack<Integer> numbers = new Stack<>();

        numbers.push(5);
        numbers.push(10);
        numbers.push(15);
        numbers.push(20);

      
        numbers.push(25);  

        System.out.println("Stack elements:");
        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
