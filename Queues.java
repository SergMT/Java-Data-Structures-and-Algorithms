import java.util.Queue;
import java.util.LinkedList;



public class Queues{
	public static void main(String[] args) {
		/*	Queue = FIFO data structure. First-in First-out (ex. A line of people)
			A collection designed for holding elements prior to proccessing linear
			data structure

			add 	= enqueue, offer()
			remove 	= dequeue, poll()
		*/

		Queue<String> queue = new LinkedList<String>();

		queue.offer("Naruto");
		queue.offer("Satoru Gojo");
		queue.offer("Gobling Slayer");
		queue.offer("Thorfin");
		queue.offer("Guts"); 

		System.out.println(queue.isEmpty());

		System.out.println(queue.peek());

		queue.poll();
		queue.poll();
		queue.poll();

		System.out.println(queue);

		System.out.println(queue.size());

		System.out.println(queue.contains("Thorfin"));

		/*Where are queues useful?
		1. Keyboard Buffer (letters should appear ono the screen in the order they're pressed)
		2. Printer Queue (Print jobs should be completed in order)
		3. Used in LinkedLists, PriorityQueues, Breadth-first search*/
	}
}