package day13;
public class BinarySearchTreeImplementation {

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    Node root;

    public void addNode(int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            while (true) {
                if (val < current.data) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeImplementation binarySearchTree = new BinarySearchTreeImplementation();

        binarySearchTree.addNode(20);
        binarySearchTree.addNode(24);
        binarySearchTree.addNode(23);
        binarySearchTree.addNode(12);
        binarySearchTree.addNode(10);
        binarySearchTree.addNode(10);
        
    }
}
