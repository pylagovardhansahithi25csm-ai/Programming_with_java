package Observations;
 import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterface {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(40);

        System.out.println("Set: " + set);
        System.out.println("first(): " + set.first());
        System.out.println("last(): " + set.last());
        System.out.println("headSet(30): " + set.headSet(30));
        System.out.println("tailSet(30): " + set.tailSet(30));
        System.out.println("subSet(20, 40): " + set.subSet(20, 40));
        System.out.println("comparator() (natural ordering): " + set.comparator());

        SortedSet<Integer> reverseSet = new TreeSet<>(Collections.reverseOrder());
        System.out.println("comparator() (reverse order set) is not null: "
                + (reverseSet.comparator() != null));
    }
} 