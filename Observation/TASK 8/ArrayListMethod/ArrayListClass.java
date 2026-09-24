package Observations;
import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("isEmpty() (new list)   : " + list.isEmpty());

        // add(E e)
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana");
        System.out.println("After add(E e)         : " + list);

        // add(int index, E element)
        list.add(1, "Mango");
        System.out.println("After add(1, \"Mango\")  : " + list);

        // get()
        System.out.println("get(2)                 : " + list.get(2));

        // set()
        System.out.println("set(0, \"Apricot\")      : " + list.set(0, "Apricot"));
        System.out.println("After set()            : " + list);

        // contains(), indexOf(), lastIndexOf()
        System.out.println("contains(\"Cherry\")     : " + list.contains("Cherry"));
        System.out.println("contains(\"Grapes\")     : " + list.contains("Grapes"));
        System.out.println("indexOf(\"Banana\")      : " + list.indexOf("Banana"));
        System.out.println("lastIndexOf(\"Banana\")  : " + list.lastIndexOf("Banana"));

        // size() and isEmpty()
        System.out.println("size()                 : " + list.size());
        System.out.println("isEmpty()              : " + list.isEmpty());

        // sort()
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted (ascending)     : " + list);
        list.sort(Comparator.reverseOrder());
        System.out.println("Sorted (descending)    : " + list);

        // remove(int index) and remove(Object o)
        System.out.println("remove(0)              : " + list.remove(0));
        System.out.println("remove(\"Banana\")       : " + list.remove("Banana"));
        System.out.println("After remove()         : " + list);
        System.out.println("size()                 : " + list.size());

        // clear()
        list.clear();
        System.out.println("After clear()          : " + list);
        System.out.println("size()                 : " + list.size());
        System.out.println("isEmpty()              : " + list.isEmpty());
    }
}
