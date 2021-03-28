package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void remove() {}

    public boolean contains() {
        return false;
    }

    public int find() {
        //returns index of first instance or -1
        return -1;
    }

    public int size() {
        return 0;
    }

    public int get(int index) {
        return 0;
    }

    public void copy() {}

    public void sort() {}


    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("Empty List");
        }
        while (current != null) {
            System.out.println( current.data + " ");
            current = current.next;
        }
    }
}
