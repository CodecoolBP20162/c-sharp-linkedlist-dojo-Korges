package com.codecool.krk;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {




    @Test
    void addTest() {
        LinkedList linkedList = createList(11);
        String expected = "0 1 2 3 4 5 6 7 8 9 10 ";
        assertEquals(expected, linkedList.toString());
    }

    @Test
    void lastTest() {
        LinkedList linkedList = createList(11);
        int expected = 10;
        Node node = linkedList.getLast();
        assertEquals(expected, node.getData());
    }

    @Test
    void removeTest() {
        LinkedList linkedList = createList(11);
        linkedList.remove(1);
        String expected = "0 2 3 4 5 6 7 8 9 10 ";
        assertEquals(expected, linkedList.toString());
    }

    @Test
    void lengthTest() {
        LinkedList linkedList = createList(11);
        int expected = 11;
        assertEquals(expected, linkedList.getLength());
    }

    private LinkedList createList(int numOfElements) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < numOfElements; ++i)
        {
            list.append(i);
        }
        return list;
    }



}