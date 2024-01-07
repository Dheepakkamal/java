package com.dheepak.learning.java.dsa_play;

public class QueueImpl {
    static class Queue {
        int arr[];
        int front, rear, size;
        int capacity;

        Queue(int capacity) {
            this.capacity = capacity;
            this.front = this.rear = this.size = 0;
//            this.rear = capacity-1;
            this.arr = new int[capacity];
        }

        boolean isFull(Queue queue) {

            return queue.size == queue.capacity;
        }

        boolean isEmpty(Queue queue) {
            return queue.size == 0;
        }

        void enQueue(int data) {
            if(isFull(this)) {
                System.out.println("Item not added to queue");
            } else {
//                this.rear = (this.rear+1) % this.capacity;
                this.arr[this.rear] = data;
                ++this.rear;
                ++this.size;
                System.out.println("Item added to queue");
            }
        }

        int deQueue() {
            if(isEmpty(this)) {
                return Integer.MIN_VALUE;
            } else {
                int item = this.arr[this.front];
                --this.size;
                ++ this.front;
                return item;

            }

        }

        void printQueue() {
            for(int i = front; i< rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }


    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        System.out.println(queue.size);
        queue.deQueue();
        System.out.println(queue.size);

        queue.printQueue();
    }
}
