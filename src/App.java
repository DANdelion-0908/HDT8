package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> separatedList = new ArrayList<>();
        
        System.out.println("Colas de prioridad \n");
        System.out.println("Leyendo archivo...");
        new ProgressBar();
        
        BufferedReader br = new BufferedReader(new FileReader("src/procesos.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            String[] dataStrings = line.split(",");

            separatedList.add(dataStrings[0]);
            separatedList.add(dataStrings[1]);
            separatedList.add(dataStrings[2]);
        }

        VectorHeap<Integer> myBinaryHeap = new VectorHeap<>();

        myBinaryHeap.add(nice1);
        myBinaryHeap.add(nice2);
        myBinaryHeap.add(nice3);
        myBinaryHeap.add(nice4);

        myBinaryHeap.showQueue();
        
        br.close();
    }

    private static void orderNums(ArrayList<String> params) {
        VectorHeap<Integer> myHeap = new VectorHeap<>();

        for (String s : params) {
            String[] line = s.split(",");
            int nice = Integer.parseInt(line[2]);

            myHeap.add(nice);
        }

        for (String b : params) {
            int num = myHeap.removeTop();
        }
    }
}
