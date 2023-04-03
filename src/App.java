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

        VectorHeap<Integer> myBinaryHeap = new VectorHeap<>();

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
