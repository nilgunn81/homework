package com.demo.tree;

public class Node {
    Object data;
    Node leftChild, rightChild;

    public Node(Object data) {
        this.data = data;
        leftChild = rightChild = null;
    }
}
