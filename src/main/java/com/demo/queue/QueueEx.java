package com.demo.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<String> Q
                = new LinkedList<String>();

        // Add programme languages to end of Queue
        Q.add("JAVA");
        Q.add("C#");
        Q.add("PHP");
        Q.add("C++");
        Q.add("C");
        Q.add("PYTHON");
        Q.add("GO");
        Q.add("VB.NET");
        Q.add("COBOL");


        // print queue
        System.out.println("Queue: " + Q);

        // print head and deletes the head
        System.out.println("Queue's head: " + Q.poll());

        // print queue
        System.out.println("Queue: " + Q);

        Q.add("FORTRAN");
        // print queue
        System.out.println("Queue: " + Q);

        // print head and deletes the head
        System.out.println("Queue's head: " + Q.remove());

        // print queue
        System.out.println("Queue: " + Q);


        // print head and deleted the head
        System.out.println("Queue's head: " + Q.remove());

        // print queue
        System.out.println("Queue: " + Q);

    }
}
