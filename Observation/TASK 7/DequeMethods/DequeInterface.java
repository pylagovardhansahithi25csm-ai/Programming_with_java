package Observations;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DequeInterface {
    public static void main(String[] args) {
        // Capacity-restricted deque (capacity = 3)
        Deque<Integer> dq = new LinkedBlockingDeque<>(3);

        // addFirst() and addLast()
        dq.addFirst(20);
        dq.addLast(30);
        dq.addFirst(10);
        System.out.println("After addFirst(20), addLast(30), addFirst(10): " + dq);

        // Deque is full: add throws exception, offer returns false
        try {
            dq.addFirst(5);
        } catch (IllegalStateException e) {
            System.out.println("addFirst(5)  -> Exception: " + e);
        }
        System.out.println("offerFirst(5) : " + dq.offerFirst(5));
        System.out.println("offerLast(40) : " + dq.offerLast(40));

        // peekFirst() and peekLast()
        System.out.println("peekFirst()   : " + dq.peekFirst());
        System.out.println("peekLast()    : " + dq.peekLast());
        System.out.println("Deque after peek: " + dq);

        // removeFirst() and removeLast()
        System.out.println("removeFirst() : " + dq.removeFirst());
        System.out.println("removeLast()  : " + dq.removeLast());
        System.out.println("Deque after remove: " + dq);

        // offerFirst() and offerLast() now succeed
        System.out.println("offerFirst(5) : " + dq.offerFirst(5));
        System.out.println("offerLast(40) : " + dq.offerLast(40));
        System.out.println("Deque after offer: " + dq);

        // pollFirst() and pollLast()
        System.out.println("pollFirst()   : " + dq.pollFirst());
        System.out.println("pollLast()    : " + dq.pollLast());
        System.out.println("Deque after poll: " + dq);

        // Make the deque empty
        dq.pollFirst();
        System.out.println("Deque after emptying: " + dq);

        // Empty deque: poll/peek return null, remove throws exception
        System.out.println("pollFirst()   : " + dq.pollFirst());
        System.out.println("pollLast()    : " + dq.pollLast());
        System.out.println("peekFirst()   : " + dq.peekFirst());
        System.out.println("peekLast()    : " + dq.peekLast());

        try {
            dq.removeFirst();
        } catch (NoSuchElementException e) {
            System.out.println("removeFirst() -> Exception: " + e);
        }
        try {
            dq.removeLast();
        } catch (NoSuchElementException e) {
            System.out.println("removeLast()  -> Exception: " + e);
        }
    }
}