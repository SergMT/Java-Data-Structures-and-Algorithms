import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

    public static void main(String[] args) {
        
        /* Priority Queue = A FIFO data structure that serves elements
         *                  with the highest priorities first
         *                  before elements with lower priority
         */

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        queue.offer(5.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        Queue<String> queue2 = new PriorityQueue<>(Collections.reverseOrder());

        Queue<String> queue3 = queue2;

        queue2.offer("B");
        queue2.offer("C");
        queue2.offer("A");
        queue2.offer("F");
        queue2.offer("D");

        System.out.println("Queue 2 ordered alphabetically: ");
        while (!queue2.isEmpty()) {
            System.out.println(queue2.poll());
        }

        System.out.println("Queue 3 ordered alphabetically reversed: ");
        while (!queue3.isEmpty()) {
            System.out.println(queue3.poll());
        }
    }
}