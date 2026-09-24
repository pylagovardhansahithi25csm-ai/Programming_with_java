package Observations;
    import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {

        // Creating PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add()
        pq.add(30);
        pq.add(10);
        pq.add(50);

        // offer()
        pq.offer(20);
        pq.offer(40);

        System.out.println("PriorityQueue: " + pq);

        // peek()
        System.out.println("Head using peek(): " + pq.peek());

        // contains()
        System.out.println("Contains 30: " + pq.contains(30));

        // remove(Object)
        pq.remove(30);
        System.out.println("After remove(30): " + pq);

        // poll()
        System.out.println("Removed head using poll(): " + pq.poll());
        System.out.println("After poll(): " + pq);

        // size()
        System.out.println("Size of PriorityQueue: " + pq.size());
    }
}