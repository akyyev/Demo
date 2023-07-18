package data.algorithms;

public class CustomLinkedList {
}


// node is nothing but [data + address of next ob]
// one object refers to another one, similarly another points to another (Dynamic Memory Allocation)
// all are linked to each other
// So there is HEAD and TAIL
// if node.next == null then it means node is TAIL

class UserNode {
    String name, lastName; // <-- this is my data
    UserNode next;          // <-- next obj
}
