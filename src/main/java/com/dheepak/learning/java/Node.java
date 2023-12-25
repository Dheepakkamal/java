package com.dheepak.learning.java;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Node {

//    private static List<Node> nodes = new ArrayList<>();
    private static Node head;
    private static Node tail;
    private int number;

    public Node(int number) {
        if(this.head == null) {
            this.number = number;
            this.head = this;
            this.tail = null;
        } else {
            this.number = number;
            Node node = this.head;
            node.setTail(this);
            this.setHead(node);
            this.setTail(null);
        }
    }

//    public Node(int number) {
//        this.number = number;
//        if(getNodes().isEmpty()) {
//            nodes.add(this);
//            setHead(this);
//            setTail(null);
//        } else {
//            Node node = getNodes().get(getNodes().size() - 1);
//            getNodes().remove(getNodes().size() - 1);
//            this.setTail(null);
//            this.setHead(node);
//            node.setTail(this);
//
//            getNodes().add(node);
//            getNodes().add(this);
//        }
//    }

//    public List<Node> getNodes() {
//        return nodes;
//    }
//
//    public void setNodes(List<Node> nodes) {
//        this.nodes = nodes;
//    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public static void printNodes() {
        Node node = head;
        while(node != null) {
            System.out.println(node.getNumber());
            node = node.getTail();
        }
    }



}
