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

        int nice1 = Integer.parseInt(separatedList.get(2)) + 120;
        int nice2 = Integer.parseInt(separatedList.get(5)) + 120;
        int nice3 = Integer.parseInt(separatedList.get(8)) + 120;
        int nice4 = Integer.parseInt(separatedList.get(11)) + 120;

        VectorHeap<Integer> myBinaryHeap = new VectorHeap<>();

        myBinaryHeap.add(nice1);
        myBinaryHeap.add(nice2);
        myBinaryHeap.add(nice3);
        myBinaryHeap.add(nice4);

        myBinaryHeap.showQueue();
        
        br.close();
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
