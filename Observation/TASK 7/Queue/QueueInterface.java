package Observations;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayBlockingQueue<>(3);

        System.out.println("add(\"A\"): " + queue.add("A"));
        System.out.println("add(\"B\"): " + queue.add("B"));
        System.out.println("offer(\"C\"): " + queue.offer("C"));
        System.out.println("Queue: " + queue);

        System.out.println("offer(\"D\") on full queue: " + queue.offer("D"));
        try {
            queue.add("D");
        } catch (IllegalStateException e) {
            System.out.println("add(\"D\") on full queue: IllegalStateException - "+ e.getMessage());
        }

        System.out.println("element(): " + queue.element());
        System.out.println("peek(): " + queue.peek());
        System.out.println("Queue after element() and peek(): " + queue);

        System.out.println("remove(): " + queue.remove());
        System.out.println("poll(): " + queue.poll());
        System.out.println("Queue after remove() and poll(): " + queue);

        System.out.println("poll(): " + queue.poll());
        System.out.println("Queue: " + queue);

        System.out.println("poll() on empty queue: " + queue.poll());
        System.out.println("peek() on empty queue: " + queue.peek());

        try {
            queue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("remove() on empty queue: NoSuchElementException");
        }
        try {
            queue.element();
        } catch (NoSuchElementException e) {
            System.out.println("element() on empty queue: NoSuchElementException");
        }
    }
}