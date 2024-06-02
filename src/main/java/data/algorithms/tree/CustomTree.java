package data.algorithms.tree;

public class CustomTree {

    static class Node {
       int value;
       Node left;
       Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;

    public CustomTree(Node root) {
        this.root = root;
    }

    void insert(int value) {
        var newNode = new Node(value);

        if(root == null) {
            root = newNode;
            return;
        }

        var current = root;

        while (true) {
            if(value <= current.value) {

            }


        }
    }
}


class TestApp {
    static int i = 4;

    public static void main(String[] args) {
        int i =3;

        System.out.println(i);
        makeFive();
        System.out.println(i);

    }

    static void makeFive() {
        i=5;
    }
}