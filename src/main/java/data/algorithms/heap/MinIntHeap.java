package data.algorithms.heap;

import java.util.Arrays;

public class MinIntHeap {
    private int capacity = 10;
    private int size = 0;

    int[] items = new int[capacity];

    public int size() {
        return size;
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private int getLeftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    private int getRightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    private int getParent(int index) {
        return items[getParentIndex(index)];
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureExtraCapacity() {
        if(size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    public int peek() {
        if (size == 0) {
            throw new IllegalStateException();
        }
        return items[0];
    }

    public int poll() {
        if( size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(int item) {
        ensureExtraCapacity();
        items[size++] = item;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && getParent(index) > items[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;

        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && getRightChild(index) < getLeftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if( items[index] < items[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }

            index = smallerChildIndex;
        }
    }

}

class TestMinHeap {

    public static void main(String[] args) {
        var minHeap = new MinIntHeap();
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(5);
        // 5,20,10
        System.out.println("Heap peek: " + minHeap.peek());
        minHeap.add(30);
        System.out.println("Heap peek: " + minHeap.peek());

        minHeap.poll();
        minHeap.add(8);
        System.out.println("Heap peek: " + minHeap.peek());

        /**
         * We can use Java Priority Queue as a Heap.
            
            Min Heap: --> to keep the min element always on top, so you can access it in O(1).
            PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
            
            Max Heap: --> to keep the max element always on top, the same order as above.
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
            
            And we can use:
            add --> to add element to the queue. O(log n)
            remove --> to get and remove the min/max. O(log n)
            peek --> to get, but not remove the min/max. O(1)
         */

        // Find kth largest element in an array
        // Can be solved using priority queue or our custom MinIntHeap class
        int[] arr = {500, 10, 3, 6, 7, 9, 1};
        System.out.println("--------------------");
        System.out.println();
        System.out.println("1st largest" + findKthLargest(arr, 1));
        System.out.println("2nd largest" + findKthLargest(arr, 2));
        System.out.println("3rd largest" + findKthLargest(arr, 3));
    }


    public static int findKthLargest(int[] arr, int k) {
        var minHeap = new MinIntHeap();

        for(var num: arr) {
            minHeap.add(num);
            if(minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
}