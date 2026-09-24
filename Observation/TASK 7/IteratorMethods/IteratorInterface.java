package Observations;
 import java.util.*;


public class IteratorInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
            Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry"));
        System.out.println("Original list          : " + list);

        // hasNext() and next()
        Iterator<String> it = list.iterator();
        System.out.println("Traversal using hasNext() and next():");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("hasNext() after loop   : " + it.hasNext());

        // remove()
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            String fruit = it2.next();
            if (fruit.equals("Banana")) {
                it2.remove();
            }
        }
        System.out.println("List after remove()    : " + list);

        // forEachRemaining()
        Iterator<String> it3 = list.iterator();
        System.out.println("First element via next(): " + it3.next());
        System.out.println("forEachRemaining():");
        it3.forEachRemaining(fruit -> System.out.println(fruit));

        // remove() before next() is illegal
        Iterator<String> it4 = list.iterator();
        try {
            it4.remove();
        } catch (IllegalStateException e) {
            System.out.println("remove() before next() -> Exception: " + e);
        }
    }
}

