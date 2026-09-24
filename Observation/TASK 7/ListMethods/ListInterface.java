package Observations;
import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        // add(E e)
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Mango");

        System.out.println("Original List: " + list);

        // add(int index, E element)
        list.add(1, "Orange");
        System.out.println("After adding at index 1: " + list);

        // get(int index)
        System.out.println("Element at index 2: " + list.get(2));

        // set(int index, E element)
        list.set(2, "Grapes");
        System.out.println("After setting index 2: " + list);

        // remove(int index)
        list.remove(3);
        System.out.println("After removing index 3: " + list);

        // indexOf(Object o)
        System.out.println("First index of Mango: "
                + list.indexOf("Mango"));

        // lastIndexOf(Object o)
        System.out.println("Last index of Mango: "
                + list.lastIndexOf("Mango"));

        // subList(int fromIndex, int toIndex)
        List<String> sub = list.subList(1, 3);
        System.out.println("SubList: " + sub);

        // sort(Comparator)
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + list);
    }
}

