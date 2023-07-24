package data.algorithms.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class StackTest {

    public static void main(String[] args) {
        CustomStack<String> stack = new CustomStack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");


        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.pop() = " + stack.pop());

        stack.pop(); //removes C
        stack.pop(); //removes B
        stack.pop(); //removes A

        System.out.println("stack.length() = " + stack.length());

        // Deque can be used as LinkedList or ArrayQueue; (Double ended stack structure)
        Deque<Integer> collectionStack = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        collectionStack.addFirst(0);
        System.out.println("collectionStack.removeFirst() = " + collectionStack.removeFirst());

        System.out.println("collectionStack.peek() = " + collectionStack.peek());
        System.out.println("collectionStack.pop() = " + collectionStack.pop());
        System.out.println("collectionStack.peek() = " + collectionStack.peek());
    }
}
