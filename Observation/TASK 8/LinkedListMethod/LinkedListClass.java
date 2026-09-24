package Observations;

    import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // add(E e)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("After add()            : " + list);

        // addFirst(E e) / addLast(E e)
        list.addFirst("Mango");
        list.addLast("Grapes");
        System.out.println("After addFirst/addLast : " + list);

        // get(int index)
        System.out.println("get(2)                 : " + list.get(2));

        // getFirst() / getLast()
        System.out.println("getFirst()             : " + list.getFirst());
        System.out.println("getLast()              : " + list.getLast());

        // remove(int index) / remove(Object o)
        list.remove(2);
        System.out.println("After remove(2)        : " + list);
        list.remove("Cherry");
        System.out.println("After remove(\"Cherry\") : " + list);

        // removeFirst() / removeLast()
        System.out.println("removeFirst()          : " + list.removeFirst());
        System.out.println("removeLast()           : " + list.removeLast());
        System.out.println("After removeFirst/Last : " + list);

        // offer(E e)
        list.offer("Orange");
        list.offer("Papaya");
        System.out.println("After offer()          : " + list);

        // peek()
        System.out.println("peek()                 : " + list.peek());

        // poll()
        System.out.println("poll()                 : " + list.poll());
        System.out.println("After poll()           : " + list);

        // poll() / peek() on an empty list
        list.clear();
        System.out.println("poll() on empty list   : " + list.poll());
        System.out.println("peek() on empty list   : " + list.peek());
    }
}