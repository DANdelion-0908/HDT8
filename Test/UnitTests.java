package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import src.VectorHeap;

import java.util.ArrayList;


public class UnitTests {

    // A test case for the add method.
    @Test
    public void testAdd() {
        VectorHeap<Integer> testVectorHeap = new VectorHeap<>();
        ArrayList<Integer> tIntegers = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            testVectorHeap.add(i);
            testVectorHeap.add(5);
        }
        
        for (int i = 0; i <= 4; i++) {
            testVectorHeap.removeTop();
        }

        tIntegers.add(testVectorHeap.peek());



        assertEquals(5, tIntegers.get(0));
    }
    
}
