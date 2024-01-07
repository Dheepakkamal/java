package com.dheepak.learning.java.dsa_play;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }


    public static LinkedList insertNode(LinkedList list, int data) {
        Node newNode = new Node(data);
        if(list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while(last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void printLinkedList(LinkedList list) {
        Node currentNode = list.head;
        while(currentNode !=null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insertNode(list, 1);
        list = insertNode(list, 2);
        list = insertNode(list, 3);
        list = insertNode(list, 4);
        list = insertNode(list, 5);
        list = insertNode(list, 6);
        list = insertNode(list, 7);
        list = insertNode(list, 8);

        printLinkedList(list);
    }


}
