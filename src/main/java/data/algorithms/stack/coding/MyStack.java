package data.algorithms.stack.coding;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack<T> {
    
    Queue<T> q1;

    public MyStack() {
        q1 = new LinkedList<>();
    }

    // 1,2,3
    // q1 = 
    // q2 = 1,2


    public void push(T x) {
        q1.add(x);

        for(int i = 0; i < q1.size() - 1; i ++) {
            q1.add(q1.poll());
        }
    }

    public T pop() {
        return q1.poll();
    }

    public T top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public void print() {
        System.out.println(q1);
    }
}

class Test {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.print();
        stack.pop();
        stack.push(4);
        stack.push(5);
        stack.print();

    }
}