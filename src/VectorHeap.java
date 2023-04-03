package src;

import java.util.PriorityQueue;

public class VectorHeap<E extends Comparable<E>> {

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public void add(int integer) {
        priorityQueue.add(integer);
    }

    public void remove(int integer) {
        priorityQueue.remove(integer);
    }

    public void peek() {
        System.out.println(priorityQueue.peek()); 
    }

    public void removeTop() {
        System.out.println(priorityQueue.poll()); 
    }

    public void showQueue() {
        System.out.println(priorityQueue);
    }
}
