package queue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Properties of Queue:
 * - Stored in random order
 * - Processed in order. Default: natural ordering (alphabetical order)
 *
 * @author Rodney Taylor (u228616)
 */
public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList("Cat", "Koi", "Monkey", "Koala", "Zebra")); // Stored in natural ordering: alphabetical order
        System.out.println(queue);
        System.out.println("Size: " + queue.size());
        System.out.println("Processed: " + queue.poll());
        System.out.println("Processed: " + queue.poll());
        System.out.println("Processed: " + queue.poll());
        System.out.println("Processed: " + queue.poll());
        System.out.println("Processed: " + queue.poll());
        System.out.println("Size: " + queue.size());

        // Putting in more elements: either add() or offer()
        System.out.println("=======================");
        queue.offer("Racoon");
        System.out.println(queue);
        queue.offer("Rabbit");
        System.out.println(queue);
        queue.add("Dog");
        System.out.println(queue);
        System.out.println("Size: " + queue.size());

        System.out.println("Processed: " + queue.poll());
        System.out.println("Processed: " + queue.poll());
        System.out.println("Processed: " + queue.poll());
        System.out.println("Processed: " + queue.poll());
    }
}
