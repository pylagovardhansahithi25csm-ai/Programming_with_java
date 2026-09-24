package Observations;
   import java.util.*;

public class SortedMapInterface {
    public static void main(String[] args) {
        SortedMap<Integer, String> sm = new TreeMap<>();

        // Insert in unsorted order; TreeMap keeps keys sorted
        sm.put(40, "Dinesh");
        sm.put(10, "Arun");
        sm.put(30, "Chitra");
        sm.put(20, "Bala");
        sm.put(50, "Eswar");
        System.out.println("SortedMap              : " + sm);

        // firstKey() and lastKey()
        System.out.println("firstKey()             : " + sm.firstKey());
        System.out.println("lastKey()              : " + sm.lastKey());

        // headMap(), tailMap(), subMap()
        System.out.println("headMap(30)            : " + sm.headMap(30));
        System.out.println("tailMap(30)            : " + sm.tailMap(30));
        System.out.println("subMap(20, 40)         : " + sm.subMap(20, 40));

        // comparator() - null means natural ordering
        System.out.println("comparator() is null   : " + (sm.comparator() == null));

        // TreeMap with a custom comparator (descending order)
        SortedMap<Integer, String> rev = new TreeMap<>(Collections.reverseOrder());
        rev.putAll(sm);
        System.out.println("\nReverse-ordered map    : " + rev);
        System.out.println("firstKey()             : " + rev.firstKey());
        System.out.println("lastKey()              : " + rev.lastKey());
        System.out.println("headMap(30)            : " + rev.headMap(30));
        System.out.println("comparator() is null   : " + (rev.comparator() == null));
    }
} 

