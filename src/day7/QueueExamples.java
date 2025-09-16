package day7;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        int removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue Empty? " + isEmpty);
      
        int size = queue.size();
        System.out.println("Queue Size: " + size);

        boolean contains20 = queue.contains(20);
        System.out.println("Queue contains 20? " + contains20);

        queue.clear();
        System.out.println("queue after clear: " + queue);

    }
}
