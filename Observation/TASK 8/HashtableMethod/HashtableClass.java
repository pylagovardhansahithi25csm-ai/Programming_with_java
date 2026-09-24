package Observations;
    import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableClass {
    public static void main(String[] args) {

        // Creating Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // put()
        table.put(101, "Apple");
        table.put(102, "Banana");
        table.put(103, "Mango");
        table.put(104, "Orange");

        System.out.println("Hashtable: " + table);

        // get()
        System.out.println("Value for key 102: " + table.get(102));

        // containsKey()
        System.out.println("Contains key 103: "
                           + table.containsKey(103));

        // containsValue()
        System.out.println("Contains value Mango: "
                           + table.containsValue("Mango"));

        // remove()
        table.remove(104);
        System.out.println("After removing key 104: " + table);

        // keys()
        System.out.print("Keys: ");
        Enumeration<Integer> keys = table.keys();

        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }

        System.out.println();

        // elements()
        System.out.print("Values: ");
        Enumeration<String> values = table.elements();

        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }

        System.out.println();

        // size()
        System.out.println("Size of Hashtable: " + table.size());

        // isEmpty()
        System.out.println("Is Hashtable empty? " + table.isEmpty());
    }
}