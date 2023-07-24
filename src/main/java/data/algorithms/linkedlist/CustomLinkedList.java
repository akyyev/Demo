package data.algorithms.linkedlist;

import java.util.List;

public class CustomLinkedList<T> {

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    boolean isEmpty() {
        return head == null;
    }

    //adding element
    void addElement(T element) {
        var node = new Node<T>(element); // creating new node for new element

        if (isEmpty()) {
            head = tail = node;
        } else {
            // update next of tail with new node, then change tail with newly added node
            tail.next = node;
            tail = node;
        }
        size++;
    }

    void addElementToBeginning(T element) {
        var node = new Node<>(element);
        if(isEmpty()) {
            head = tail = node;
        } else {
            // link new node to head
            node.next = head;
            head = node;
        }
        size++;
    }

    void addAll(List<T> elements) {
        for (var each: elements) {
            addElement(each);
        }
    }

    int getSize() {
        return size;
    }

    void printAll() {
        var current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    int indexOf(T element) {
        var current = head;
        var index = 0;
        while (current != null) {
            if(current.data.equals(element)) {
                return index;
            } else {
                index++;
                current = current.next;
            }
        }
        return -1;
    }

    boolean contains(T element) {
        return indexOf(element) != -1;
    }

    boolean delete(T element) {
        var current = head;
        var previous = head;

        while (current != null) {
            // element is last
            // element in the beginning
            // element in the middle
            if(current.data.equals(element)) {
                if(current == head) {
                    head = current.next;
                    current.next = null; // free up memory
                } else if(current == tail) {
                    previous.next = null;
                    tail = previous;
                } else {
                    previous.next = current.next;
                    current.next = null; // to remove extra pointer to preceding element
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false;
    }

    // TODO
    T getKthElementFromLast(int k) {
        // two pointers
        var pointer1 = head;
        var pointer2 = head;

        // move pointer2 k-1 times
        for (var i=0; i<k-1; i++) {
            pointer2 =  pointer2.next;
        }

        // move both pointers until pointer2 hits the last element
        while (pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        // return kth element from last
        assert pointer1 != null;
        return pointer1.data;
    }

    void removeKthElementFromLast(int k) {
        // three pointers
        Node<T> previous = null;
        var pointer1 = head;
        var pointer2 = head;

        // move pointer2 k-1 times
        for (var i=0; i<k-1; i++) {
            pointer2 = pointer2.next;
        }

        // move both pointers until pointer2 hits the last element
        while (pointer2.next != null) {
            previous = pointer1;
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        // now delete the item on pointer1
        // 3 cases
        if(pointer1 == head) {
             head = pointer1.next;
            pointer1.next = null;
        } else if(pointer1 == tail) {
            previous.next = null;
            tail = previous;
        } else {
            previous.next = pointer1.next;
            pointer1.next = null;
        }
        size--;
    }
}
