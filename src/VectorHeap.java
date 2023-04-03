package src;

import java.util.PriorityQueue;

public class VectorHeap<E extends Comparable<E>> {

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    /**
     * Adds the integer to the priority queue.
     * 
     * @param integer The integer to be added to the priority queue.
     */
    public void add(int integer) {
        priorityQueue.add(integer);
    }

    /**
     * Removes the integer to the priority queue.
     * 
     * @param integer The integer to be removed from the priority queue.
     */
    public void remove(int integer) {
        priorityQueue.remove(integer);
    }

    /**
     * It returns the top element of the priority queue.
     * 
     * @return The element with the highest priority.
     */
    public int peek() {
        System.out.println(priorityQueue.peek()); 
        return priorityQueue.peek();
    }

    /**
     * It removes the top element from the priority queue.
     * 
     * @return The top element of the priority queue.
     */
    public int removeTop() {
        System.out.println(priorityQueue.poll()); 
        return priorityQueue.poll();
    }

    /**
     * The above function prints the priority queue
     */
    public void showQueue() {
        System.out.println(priorityQueue);
    }
}
