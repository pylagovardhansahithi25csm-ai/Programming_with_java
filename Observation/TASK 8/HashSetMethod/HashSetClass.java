package Observations;
    import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {

        // Creating a HashSet
        HashSet<String> set = new HashSet<>();

        // add()
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Orange");
        set.add("Apple");   // Duplicate is not added

        System.out.println("HashSet after add(): " + set);

        // contains()
        System.out.println("Contains Banana: " + set.contains("Banana"));

        // remove()
        set.remove("Mango");
        System.out.println("HashSet after remove(): " + set);

        // size()
        System.out.println("Size of HashSet: " + set.size());

        // isEmpty()
        System.out.println("Is HashSet empty? " + set.isEmpty());

        // clear()
        set.clear();
        System.out.println("HashSet after clear(): " + set);

        // isEmpty() after clear
        System.out.println("Is HashSet empty after clear()? " + set.isEmpty());
    }
}
