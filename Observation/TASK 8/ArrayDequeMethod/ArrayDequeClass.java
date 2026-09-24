package Observations;
    import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {

        // Creating ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // addFirst() and addLast()
        deque.addFirst(20);
        deque.addLast(30);
        deque.addFirst(10);

        System.out.println("After addFirst() and addLast(): " + deque);

        // offerFirst() and offerLast()
        deque.offerFirst(5);
        deque.offerLast(40);

        System.out.println("After offerFirst() and offerLast(): " + deque);

        // peekFirst() and peekLast()
        System.out.println("First element using peekFirst(): "
                           + deque.peekFirst());
        System.out.println("Last element using peekLast(): "
                           + deque.peekLast());

        // pollFirst()
        System.out.println("Removed first element using pollFirst(): "
                           + deque.pollFirst());

        System.out.println("Deque after pollFirst(): " + deque);

        // pollLast()
        System.out.println("Removed last element using pollLast(): "
                           + deque.pollLast());

        System.out.println("Deque after pollLast(): " + deque);
    }
}
