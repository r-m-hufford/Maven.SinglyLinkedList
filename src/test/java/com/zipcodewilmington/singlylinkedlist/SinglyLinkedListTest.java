package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void size() {
        SinglyLinkedList sList = new SinglyLinkedList();

        sList.add(1);
        sList.add(1);
        sList.add(1);
        sList.add(1);

        int expected = 4;
        int actual = sList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        SinglyLinkedList sList = new SinglyLinkedList();

        sList.add(1);
        sList.add(2);
        sList.add(3);
        sList.add(4);

        sList.remove(1);
        Assert.assertFalse(sList.contains(2));
    }

    @Test
    public void contains() {
        SinglyLinkedList sList = new SinglyLinkedList();

        sList.add(1);
        sList.add(2);
        sList.add(3);
        sList.add(4);

        Assert.assertTrue(sList.contains(2));
    }

    @Test
    public void find() {
        SinglyLinkedList sList = new SinglyLinkedList();

        sList.add(1);
        sList.add(2);
        sList.add(3);
        sList.add(4);

        int actual = sList.find(2);
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        SinglyLinkedList sList = new SinglyLinkedList();

        sList.add(1);
        sList.add(2);
        sList.add(3);
        sList.add(4);
        sList.add(5);
        sList.add(6);

        int actual = sList.getData(4);
        int expected = 5;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void sort() {
        SinglyLinkedList sList = new SinglyLinkedList();

        sList.add(2);
        sList.add(1);
        sList.add(6);
        sList.add(4);
        sList.add(3);
        sList.add(5);


        sList.sort();
        int expected = 3;
        int actual = sList.getData(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void copy() {
        SinglyLinkedList expected = new SinglyLinkedList();

        expected.add(2);
        expected.add(1);
        expected.add(6);
        expected.add(4);
        expected.add(3);
        expected.add(5);

        SinglyLinkedList actual = expected.copy();

        Assert.assertEquals(expected.getData(2), actual.getData(2));
    }










}
