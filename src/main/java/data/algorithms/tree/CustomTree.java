package data.algorithms.tree;

class Node {
    int value;
    Node left;
    Node right;

     public Node(int value) {
         this.value = value;
     }

     public Node(int value, Node left, Node right) {
         this.value = value;
         this.left = left;
         this.right = right;
     }
 }

public class CustomTree {

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

    public boolean hasPathSum(Node root, int targetSum) {

        if(root == null) return false;
        if(root.left == null && root.right == null && targetSum - root.value == 0) {
            return true;
        }

        return hasPathSum(root.left, targetSum - root.value) ||
               hasPathSum(root.right, targetSum - root.value);
    }
}


class TestApp {

    /*
        target = 8 [1 -> 3 -> 4]
        node = [1,3,2, null, 4, null, 10]
              1
          3       2
        n   4    n  10

     */
    public static void main(String[] args) {
        CustomTree tree = new CustomTree(new Node(1, new Node(3, null, new Node(4)), new Node(2, null, new Node(10))));
        var hasIt = tree.hasPathSum(tree.root, 13);
        System.out.println(hasIt);
    }
}