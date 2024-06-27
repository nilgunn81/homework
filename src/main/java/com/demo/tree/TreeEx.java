package com.demo.tree;

public class TreeEx {
    public static void main(String[] args) {
        BinaryTreeEx tree = new BinaryTreeEx();
        tree.root = new Node("A");
        tree.root.leftChild = new Node("B");
        tree.root.rightChild = new Node("C");
        tree.root.leftChild.leftChild = new Node("D");
        tree.root.leftChild.rightChild = new Node("E");
        tree.root.rightChild.leftChild = new Node("F");
        tree.root.rightChild.rightChild = new Node("G");

        System.out.println("\nBFS (Breadth-First Search) Of Tree");
        tree.printBFS(tree.root);

        System.out.println("\nInorder traversal Of Tree");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal Of Tree");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal Of Tree");
        tree.postorder(tree.root);
    }
}
