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
        return priorityQueue.peek();
    }

    public E removeTop() {
        return priorityQueue.poll();
    }

    public void showQueue() {
        System.out.println(priorityQueue);
    }
}
