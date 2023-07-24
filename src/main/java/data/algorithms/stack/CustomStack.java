package data.algorithms.stack;

import java.util.NoSuchElementException;

public class CustomStack<T> {

    // pop & push --> FILO, LIFO logic
    // Very similar to linked list structure, instead of HEAD/TAIL we have Bottom/Top

    static class SNode<T> {
        T value;
        SNode next;

        public SNode(T value) {
            this.value = value;
        }
    }

    private SNode<T> bottom;
    private SNode<T> top;
    private int size;

    public int length() {
        return size;
    }

    public boolean isEmpty() {
        return bottom == null;
    }

    public void push(T item) {
        var node = new SNode<>(item);

        if(isEmpty()) {
            bottom = top = node;
        } else {
            top.next = node;
            top = node;
        }
        size++;
    }

    // peek method returns top element
    public T peek() {
        return (T) top.value;
    }

    public T pop() {
        SNode<T> peekNode = top;
        if(isEmpty()) throw new NoSuchElementException();

        if(top==bottom) {
            bottom = top = null;
        } else {
            SNode<T> prev = bottom;
            while (prev.next != top) {
                prev = prev.next;
            }
            prev.next = null;
            top = prev;
        }
        size--;
        return peekNode.value;
    }

}
