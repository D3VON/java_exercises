import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Question 1:
 * What will the structures 'stack' and 'queue' contain after the code is executed?
 */
public class StacksAndQueues {

    public static void main(String args[]){

        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<String>();

        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        queue.add(stack.pop());
        stack.push("Dingleberry");
        stack.push("Eggplant");
        queue.add("fig");
        stack.push(queue.remove());
        queue.add(stack.pop());
        queue.add(stack.pop());

        System.out.println(stack);
        System.out.println(queue);

    }
}
