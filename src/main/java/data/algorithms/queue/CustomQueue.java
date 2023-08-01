package data.algorithms.queue;

import java.util.NoSuchElementException;
import java.util.Stack;

public class CustomQueue<T> {

    // FIFO
    // enqueue (putting) (putting element after Tail)
    // dequeue (removing first) (removing HEAD)
    // peek
    // size
    // Lets create Custom Queue using Linked List
    private static class QNode<T> {
        T value;
        QNode<T> node;
        QNode<T> next;

        QNode(T value) {
            this.value = value;
        }
    }

    private QNode<T> front;
    private QNode<T> back;
    private int size;

    boolean isEmpty() {
        return front == null;
    }

    T peek() {
        return front.value;
    }

    void enqueue(T item) {
        if(isEmpty()) {
            front = back = new QNode<>(item);
        } else {
            var newBack = new QNode<T>(item);
            back.next = newBack;
            back = newBack;
        }
        size++;
    }

    // removing first element and return its value
    T dequeue() {
        if(isEmpty()) throw new NoSuchElementException();

        // removing head (front)
        var oldFront = front;
        if(front == back) {
            front = back = null;
        } else {
            front = front.next;
        }
        size--;
        return oldFront.value;
    }

    int size() {
        return size;
    }

    // write a method that reverses first K elements of a queue
    // input = [10,20,30,40,50,60] k=4
    // output = [40,30,20,10,50,60]
    void reverseFirstKItems(int k) {
        if(size<k) throw new IllegalArgumentException("Size of a queue is smaller than input k");
        var stack = new Stack<T>();

        // 1. put first K elements in stack
        int t = 0;
        while (t < k) {
            stack.push(dequeue());
            t++;
        }
        // stack = 10,20,30,40
        // queue = 50,60

        // 2. Pop elements from stack and put them back in queue
        while (!stack.isEmpty()) {
            var popped = stack.pop(); // 40,30,20,10
            enqueue(popped);
        }
        // queue = 50,60,40,30,20,10

        // 3. Remove and add elements to maintain the order of last elements
        var c = size - k;
        while (c > 0) {
            enqueue(dequeue());
            c--;
        }
        // queue = 40,30,20,10,50,60
    }
}

class TestApp {
    public static void main(String[] args) {
        var lettersQueue = new CustomQueue<String>();
        lettersQueue.enqueue("A");
        lettersQueue.enqueue("B");
        lettersQueue.enqueue("C");

        System.out.println("lettersQueue.size() = " + lettersQueue.size());
        System.out.println("lettersQueue.dequeue() = " + lettersQueue.dequeue());
        System.out.println("lettersQueue.dequeue() = " + lettersQueue.dequeue());
        System.out.println("lettersQueue.dequeue() = " + lettersQueue.dequeue());
        System.out.println("lettersQueue.size() = " + lettersQueue.size());

        System.out.println("----------------------------");

        var numbersQueue = new CustomQueue<Integer>(); // 1,2,3,4,5,6...,8,9,10
        for (int i = 1; i <= 10; i++) {
            numbersQueue.enqueue(i);
        }

        numbersQueue.reverseFirstKItems(4); // 4,3,2,1,5,6...,8,9,10
        while (!numbersQueue.isEmpty()) {
            System.out.println("numbersQueue.dequeue() = " + numbersQueue.dequeue());
        }
    }
}
