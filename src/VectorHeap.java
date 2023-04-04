package src;

import java.util.PriorityQueue;

public class VectorHeap<E extends Comparable<E>> {

    PriorityQueue<E> priorityQueue = new PriorityQueue<>();

    public void add(E integer) {
        priorityQueue.add(integer);
    }

    public void remove(E integer) {
        priorityQueue.remove(integer);
    }

    public E peek() {
        System.out.println(priorityQueue.peek()); 
        return priorityQueue.peek();
    }

    public E removeTop() {
        System.out.println(priorityQueue.poll()); 
        return priorityQueue.poll();
    }

    public void showQueue() {
        System.out.println(priorityQueue);
    }
}
