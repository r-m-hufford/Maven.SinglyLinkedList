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

    public void remove(int index) {
        Node current = head;
        int counter = 0;
        while (counter > index) {
            current = current.next;
            counter++;
        }
        current.next = current.next.next;
    }

    public boolean contains(int data) {
        Node current = head;

        while (current.next != null) {
            if(current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int find(int data) {
        Node current = head;
        int counter = 0;

        while (current.next != null) {
            if(current.data == data) {
                break;
            }
            current = current.next;
            counter++;
        }
        return counter;
    }

    public int size() {
        Node current = head;
        int counter = 0;

        while(current != null)  {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public int get(int index) {
        Node current = head;
        int counter = 0;

        while (counter < index) {
            current = current.next;
            counter++;
        }
        return current.data;
    }

    public void copy() {}

    public void sort() {
        Node current = head;
        boolean stillSorting = true;
        while (stillSorting) {
            stillSorting = false;
            for (int i = 0; i < size(); i++) {
                if (current.data > current.next.data) {
                    Node temp = current;
                    current = current.next;
                    current.next = temp;
                    stillSorting = true;
                }
            }
        }
    }


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
