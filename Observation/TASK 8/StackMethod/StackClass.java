package Observations;

    import java.util.Stack;

public class StackClass{
    public static void main(String[] args) {

        // Creating a Stack
        Stack<String> stack = new Stack<>();

        // push()
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Mango");
        stack.push("Orange");

        System.out.println("Stack after push(): " + stack);

        // peek()
        System.out.println("Top element using peek(): " + stack.peek());

        // search()
        System.out.println("Position of Banana: " + stack.search("Banana"));

        // pop()
        System.out.println("Removed element using pop(): " + stack.pop());
        System.out.println("Stack after pop(): " + stack);

        // empty()
        System.out.println("Is stack empty? " + stack.empty());
    }
}
