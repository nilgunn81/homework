package com.demo.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeEx {
    Node root;

    BinaryTreeEx() {
        root = null;
    }

    void postorder(Node node) {
        if (node == null)
            return;

        // Traverse the left subtree
        postorder(node.leftChild);
        // Traverse the right subtree
        postorder(node.rightChild);
        // Visit the node
        System.out.print(node.data + "-->");
    }

    void inorder(Node node) {
        if (node == null)
            return;

        // Traverse the left subtree
        inorder(node.leftChild);
        // Visit the node
        System.out.print(node.data + "-->");
        // Traverse the right subtree
        inorder(node.rightChild);
    }

    void preorder(Node node) {
        if (node == null)
            return;

        // Visit the node
        System.out.print(node.data + "-->");
        // Traverse the left subtree
        preorder(node.leftChild);
        // Traverse the right subtree
        preorder(node.rightChild);
    }

    public void printBFS(Node node) {
        if (node == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + "-->");

            if (current.leftChild != null) {
                queue.add(current.leftChild);
            }

            if (current.rightChild != null) {
                queue.add(current.rightChild);
            }
        }
    }
}
