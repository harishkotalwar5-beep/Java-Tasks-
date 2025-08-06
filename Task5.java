import java.util.LinkedList;
import java.util.Queue;

public class Task5 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }
        System.out.println("Queue elements:");
        for (Integer num : queue) {
            System.out.println(num);
        }
    }
}




