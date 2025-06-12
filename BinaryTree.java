package javaprojects;
class Node {
    String name;
    Node left, right;

    public Node(String name) {
        this.name = name;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node("Alice");
        tree.root.left = new Node("Bob");
        tree.root.right = new Node("Charlie");

        System.out.println("Root: " + tree.root.name);
        System.out.println("Left Child of Root: " + tree.root.left.name);
        System.out.println("Right Child of Root: " + tree.root.right.name);
    }
}