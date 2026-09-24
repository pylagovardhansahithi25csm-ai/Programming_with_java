package Observations;
import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {

        // Creating a Collection using ArrayList
        Collection<String> c1 = new ArrayList<>();

        // add(E e)
        c1.add("Apple");
        c1.add("Banana");
        c1.add("Mango");
        c1.add("Orange");

        System.out.println("Collection: " + c1);

        // addAll(Collection<? extends E> c)
        Collection<String> c2 = new ArrayList<>();
        c2.add("Grapes");
        c2.add("Pineapple");

        c1.addAll(c2);
        System.out.println("After addAll(): " + c1);

        // remove(Object o)
        c1.remove("Banana");
        System.out.println("After remove(): " + c1);

        // removeAll(Collection<?> c)
        c1.removeAll(c2);
        System.out.println("After removeAll(): " + c1);

        // contains(Object o)
        System.out.println("Contains Mango? " + c1.contains("Mango"));

        // containsAll(Collection<?> c)
        Collection<String> c3 = new ArrayList<>();
        c3.add("Apple");
        c3.add("Mango");

        System.out.println("Contains all c3 elements? "
                + c1.containsAll(c3));

        // size()
        System.out.println("Size of collection: " + c1.size());

        // isEmpty()
        System.out.println("Is collection empty? " + c1.isEmpty());

        // iterator()
        System.out.println("Elements using Iterator:");
        Iterator<String> it = c1.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        c1.clear();
        System.out.println("After clear(): " + c1);
        System.out.println("Is collection empty? " + c1.isEmpty());
    }
}
