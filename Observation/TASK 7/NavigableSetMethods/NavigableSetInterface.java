package Observations;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetInterface {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);
        set.add(40);

        System.out.println("Set: " + set);

        System.out.println("lower(30): " + set.lower(30));
        System.out.println("lower(10): " + set.lower(10));
        System.out.println("floor(30): " + set.floor(30));
        System.out.println("floor(25): " + set.floor(25));
        System.out.println("ceiling(30): " + set.ceiling(30));
        System.out.println("ceiling(25): " + set.ceiling(25));
        System.out.println("higher(30): " + set.higher(30));
        System.out.println("higher(50): " + set.higher(50));

        System.out.println("descendingSet(): " + set.descendingSet());

        System.out.println("pollFirst(): " + set.pollFirst());
        System.out.println("pollLast(): " + set.pollLast());
        System.out.println("Set after polling: " + set);

        NavigableSet<Integer> empty = new TreeSet<>();
        System.out.println("pollFirst() on empty set: " + empty.pollFirst());
    }
} 