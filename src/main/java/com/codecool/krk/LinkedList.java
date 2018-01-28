package com.codecool.krk;

public class LinkedList {

    Node head;
    Node last;
    int length;

    public LinkedList() {
        this.head = null;
    }

    public void append(int data) {
        Node node = new Node(data);
        node.setNext(null);
        if(head != null) {
            last.setNext(node);
            last = node;
        } else {
            head = node;
            last = node;
        }
    }

    public void remove(int index) {

        Node current = head;
        for (int i=0; i<index-1; i++) {
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        int length = 0;
        while(head!= null) {
            length++;
            head = head.getNext();
        }
        return length;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        while(head != null) {
            sb.append(head.getData() + " ");
            head = head.getNext();
        }
        return sb.toString();
    }
}
