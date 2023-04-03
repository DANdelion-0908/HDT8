package Test;

import org.junit.Test;

import src.VectorHeap;

public class UnitTests {

    @Test
    public void testAdd() {
        VectorHeap<Integer> testVectorHeap = new VectorHeap<>();
        
        for (int i = 0; i <= 10; i++) {

            testVectorHeap.add(i);
            testVectorHeap.add(5);
            
        }
        
        testVectorHeap.showQueue();
    }
    
}
