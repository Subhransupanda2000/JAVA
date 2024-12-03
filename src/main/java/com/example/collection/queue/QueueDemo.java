package com.example.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue<>();
        for (int i=10;i>=1;i--)
        {
            priorityQueue.offer(i);
        }
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.remove(4));
        System.out.println(priorityQueue.offer(4));
        System.out.println(priorityQueue);


    }
}
