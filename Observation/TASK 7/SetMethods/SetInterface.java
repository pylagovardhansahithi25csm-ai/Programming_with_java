package Observations;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();

        System.out.println("Is set empty? " + set.isEmpty());

        System.out.println("add(\"Apple\"): " + set.add("Apple"));
        System.out.println("add(\"Banana\"): " + set.add("Banana"));
        System.out.println("add(\"Cherry\"): " + set.add("Cherry"));
        System.out.println("add(\"Apple\") again: " + set.add("Apple"));

        System.out.println("Set after adding: " + set);
        System.out.println("Size: " + set.size());

        System.out.println("contains(\"Banana\"): " + set.contains("Banana"));
        System.out.println("contains(\"Mango\"): " + set.contains("Mango"));

        System.out.println("remove(\"Banana\"): " + set.remove("Banana"));
        System.out.println("remove(\"Mango\"): " + set.remove("Mango"));

        System.out.println("Set after removal: " + set);
        System.out.println("Size: " + set.size());

        set.clear();
        System.out.println("After clear(): " + set);
        System.out.println("Is set empty? " + set.isEmpty());
    }
}