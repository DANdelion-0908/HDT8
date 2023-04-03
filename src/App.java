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

    /**
     * It takes an ArrayList of strings, splits each string into an array of strings, adds 120 to the
     * third element of the array, and then adds the first two elements of the array and the new third
     * element to a new ArrayList of strings
     * 
     * @param arrayList ArrayList of strings that are formatted like this: "name,priority,time"
     * @return The method is returning an ArrayList of Strings.
     */
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
