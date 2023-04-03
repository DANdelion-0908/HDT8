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
            separatedList.add(line);
        }

        System.out.println(separatedList);

        VectorHeap<Process> myBinaryHeap = new VectorHeap<>();

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
       
    private static ArrayList<String> priorityArrayList(ArrayList<String> arrayList) {
        ArrayList<String> toReturn = new ArrayList<>();

        for (String string : arrayList) {
            String[] procString = string.split(",");

            int plus = Integer.parseInt(procString[2]) + 120;
            String line = procString[0] + procString[1] + plus;

            toReturn.add(line);

        }

        return toReturn;
    }
}
