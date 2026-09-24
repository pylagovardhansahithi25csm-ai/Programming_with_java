package Observations;

 import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {

        // Creating a LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // add()
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Apple"); // Duplicate is not added

        System.out.println("LinkedHashSet after add(): " + set);

        // contains()
        System.out.println("Contains Banana: " + set.contains("Banana"));

        // remove()
        set.remove("Mango");
        System.out.println("LinkedHashSet after remove(): " + set);

        // size()
        System.out.println("Size of LinkedHashSet: " + set.size());

        // clear()
        set.clear();
        System.out.println("LinkedHashSet after clear(): " + set);
    }
} 