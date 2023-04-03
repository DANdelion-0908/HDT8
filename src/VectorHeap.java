package src;

import java.util.PriorityQueue;

public class VectorHeap<E extends Comparable<E>> {

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public void add(Integer integer) {
        priorityQueue.add(integer);
    }

    public void remove(Integer integer) {
        priorityQueue.remove(integer);
    }
}
