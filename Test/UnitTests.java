package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import src.VectorHeap;

public class UnitTests {

    @Test
    public void testAdd() {
        VectorHeap<Integer> testVectorHeap = new VectorHeap<>();
        ArrayList<Integer> tIntegers = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            testVectorHeap.add(i);
            testVectorHeap.add(5);
        }
        
        tIntegers.add(testVectorHeap.peek());
        
        int intRemoved = testVectorHeap.removeTop();


        assertEquals(intRemoved, tIntegers.get(0));
    }
    
}
