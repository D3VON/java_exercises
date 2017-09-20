import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class passByReference {
/**
 * Reason for this program:
 * What is Java's behavior regarding passing arguments.
 *
 * Pass-by-reference, I"m told.
 *
 * JAVA IS ALWAYS PASS BY VALUE.  "Pass by reference" in java means that a reference (an address) is passed
 * by value.  IT ISN'T A POINTER LIKE IN C++, IT'S A REFERENCE, WHICH IS MUCH LESS MAGICAL.
 *
 * everytihing is passed by value but, everything that isn't a primitive type is a reference.
 * A reference is "an address".
 *
 * A reference that is passed to a function is very similar to an integer data type.  It can be referenced,
 * but as soon as it's changed (assign another object to it) that change only lives in the scope of the
 * function, and vanishes when the function vanishes.  The original reference outside the function
 * remains unchanged.
 *
 * Here's a great discussion about this:
 * https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
 *
 */
public class StacksAndQueues {

//    public static void main(String args[]){

//        Stack<String> stack = new Stack<String>();
//        Queue<String> queue = new LinkedList<String>();
//
//        stack.push("Apple");
//        stack.push("Banana");
//        stack.push("Cherry");
//        queue.add(stack.pop());
//        stack.push("Dingleberry");
//        stack.push("Eggplant");
//        queue.add("fig");
//        stack.push(queue.remove());
//        queue.add(stack.pop());
//        queue.add(stack.pop());
//
//        System.out.println(stack);
//        System.out.println(queue);

    }
}