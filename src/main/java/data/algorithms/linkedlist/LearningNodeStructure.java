package data.algorithms.linkedlist;

public class LearningNodeStructure {

    public static void main(String[] args) {
        Node n1 = new Node("John", "Doe");
        Node n2 = new Node("Jane", "Doe");
        Node n3 = new Node("Jack", "Doe");
        Node n4 = new Node("Jerry", "Doe");

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // jumping to last node starting from first element
        System.out.println(n1.next.next.next == n4);

        // iterating
        var current = n1; // here n1 is our HEAD node
        while (current != null) {
            System.out.println(current.name);
            current = current.next;
        }
    }

}


// node is nothing but [data + address of next ob]
// one object refers to another one, similarly another points to another (Dynamic Memory Allocation)
// all are linked to each other
// So there is HEAD and TAIL
// if node.next == null then it means node is TAIL

class Node {
    String name, lastName; // <-- this is my data
    Node next;          // <-- next obj

    public Node(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
