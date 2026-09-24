package Observations;

    import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {

        // Creating a Vector
        Vector<String> v = new Vector<>();

        // add()
        v.add("Apple");
        v.add("Banana");
        v.add("Mango");

        System.out.println("After add(): " + v);

        // addElement()
        v.addElement("Orange");
        System.out.println("After addElement(): " + v);

        // get()
        System.out.println("Element at index 1: " + v.get(1));

        // set()
        v.set(1, "Grapes");
        System.out.println("After set(): " + v);

        // remove(index)
        v.remove(2);
        System.out.println("After remove(2): " + v);

        // removeElement()
        v.removeElement("Orange");
        System.out.println("After removeElement(): " + v);

        // size()
        System.out.println("Size of Vector: " + v.size());

        // capacity()
        System.out.println("Capacity of Vector: " + v.capacity());

        // contains()
        System.out.println("Contains Apple: " + v.contains("Apple"));
        System.out.println("Contains Orange: " + v.contains("Orange"));
    }
}
