package Observations;
    import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // add()
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("TreeSet after add(): " + set);

        // contains()
        System.out.println("Contains 30: " + set.contains(30));

        // remove()
        set.remove(20);
        System.out.println("TreeSet after remove(20): " + set);

        // first() and last()
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // higher() and lower()
        System.out.println("Higher than 30: " + set.higher(30));
        System.out.println("Lower than 30: " + set.lower(30));

        // ceiling() and floor()
        System.out.println("Ceiling of 35: " + set.ceiling(35));
        System.out.println("Floor of 35: " + set.floor(35));

        // pollFirst()
        System.out.println("Removed first element: " + set.pollFirst());
        System.out.println("TreeSet after pollFirst(): " + set);

        // pollLast()
        System.out.println("Removed last element: " + set.pollLast());
        System.out.println("TreeSet after pollLast(): " + set);
    }
}

