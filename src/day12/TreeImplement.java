package day12;

import java.util.LinkedList;
import java.util.Queue;

public class TreeImplement {
    class Node {
        int data;
        Node left, right;

        public Node(int val) {
            data = val;
            left = right = null;
        }
    }

    Node root;

    public void addNode(int val) {
        Node newNode = new Node(val);

        if (root == null) {
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();

            if (temp.left == null) {
                temp.left = newNode;
                break;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = newNode;
                break;
            } else {
                queue.add(temp.right);
            }
        }
    }

    public void levelOrderTraversal() {
        if (root == null) {
            System.out.println("Tree is Empty....");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.print(temp.data + " ");

            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        System.out.println();
    }

    public boolean search(int target) {
        if (root == null) {
            System.out.println("Tree is Empty....");
            return false;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            if (temp.data == target) {
                return true;
            }
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }
        return false;
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // 🔹 Find Minimum value in tree
    public int findMin() {
        if (root == null) throw new RuntimeException("Tree is empty!");
        int min = root.data;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            if (temp.data < min) min = temp.data;
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }

        return min;
    }

    // 🔹 Find Maximum value in tree
    public int findMax() {
        if (root == null) throw new RuntimeException("Tree is empty!");
        int max = root.data;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            if (temp.data > max) max = temp.data;
            if (temp.left != null) queue.add(temp.left);
            if (temp.right != null) queue.add(temp.right);
        }

        return max;
    }

    public static void main(String[] args) {
        TreeImplementation tree = new TreeImplementation();
        int[] values = {15, 50, 23, 34, 51, 2, 1, 4, 5, 6};
        for (int v : values) {
            tree.addNode(v);
        }

        System.out.println("Level Order Traversal:");
        tree.levelOrderTraversal();
        System.out.println();

        System.out.println("Minimum node: " + tree.findMin());
        System.out.println("Maximum node: " + tree.findMax());
    }
}
