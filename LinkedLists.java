import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        /*
         * LinkedList = Stores Nodes in 2 parts (data + address)
         *              Nodes are in non-consecutive memory locations
         *              Elements are linked using pointers
         * 
         *                      Singly Linked List
         *          Node                Node                Node
         *    [data | address] -> [data | address] -> [data | address]
         *                          
         *                      Doubly Linked List
         *              Node                            Node
         *    [address | data | address] <-> [address | data | address]
         * 
         *    Advantages:
         *    1. Dynamic Data Structure (allocates needed memory while running)
         *    2. Insertion and Deletion of Nodes is easy. O(1)
         *    3. No/Low memory waste
         * 
         *    Disadvantages
         *    1. Greater memory usage (additional pointer)
         *    2. No random access of elements (no index i)
         *    3. Accessing/searching elements is more time consuming. O(n)
         * 
         *    Uses:
         *    1. Implement Stacks/Queues
         *    2. GPS navigation
         *    3. Music playlist
         */
        
        LinkedList<String> linkedlist = new LinkedList<String>();

        // Linked lists can be used as Stacks
        // linkedlist.push("A");
        // linkedlist.push("B");
        // linkedlist.push("C");
        // linkedlist.push("D");
        // linkedlist.push("F");
        // linkedlist.pop();

        // Linked lists can be used as Queues
        // linkedlist.offer("A");
        // linkedlist.offer("B");
        // linkedlist.offer("C");
        // linkedlist.offer("D");
        // linkedlist.offer("F");
        // linkedlist.poll();

        //Example of Linked List methods
        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");

        linkedlist.add(4, "E"); //Inserts "E" on index 4
        linkedlist.add("G"); //Inserts "G" on last index
        linkedlist.remove("E");

        System.out.println("Index of letter F: " + linkedlist.indexOf("F")); // Returns 4

        System.out.println("First element in the linked list: " + linkedlist.peekFirst());
        System.out.println("Last element in the linked list: " + linkedlist.peekLast());

        linkedlist.addFirst("0");
        linkedlist.addLast("H");

        String first = linkedlist.removeFirst();
        String last = linkedlist.removeLast();

        System.out.println("First element removed: " + first);
        System.out.println("Last element removed: " + last);

        System.out.println("Final linked list: " + linkedlist);
    }
}
