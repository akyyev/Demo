package data.algorithms.linkedlist.interview;


public class AddGcpBetweenNodes {
    
    private static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
     }

    private static void addGcpBetweenNodes(ListNode head){

        var first = head;
        var second = head.next;

        while (second != null) {
            var gcd = gcd(first.val, second.val);

            var newGcdNode = new ListNode(gcd, null);

            newGcdNode.next = second;
            first.next = newGcdNode;

            first = second;
            second = second.next;
        }
    }

    public static void main(String[] args) {
        var nodes = new ListNode(6, new ListNode(8, new ListNode(20, null)));
        System.out.println("Before: ");
        nodes.printAll();

        addGcpBetweenNodes(nodes);
        System.out.println("After: ");
        nodes.printAll();
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    void printAll() {
        var curr = this;

        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}