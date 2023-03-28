import java.util.PriorityQueue;

public class VectorHeap<Integer extends Comparable<Integer>> {

    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

    public void add(Integer integer) {
        priorityQueue.add(integer);
    }

    public void remove(Integer integer) {
        priorityQueue.remove(integer);
    }
}
