package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> separatedList = new ArrayList<>();
        
        System.out.println("Colas de prioridad \n");
        System.out.println("Leyendo archivo...");
        //new ProgressBar();
        
        BufferedReader br = new BufferedReader(new FileReader("src/procesos.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            separatedList.add(line);
        }

        System.out.println(separatedList);

        ArrayList<String> newArr = priorityArrayList(separatedList);

        orderNums(newArr);
        
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
            String line = procString[0] + "," + procString[1] + "," + plus;

            toReturn.add(line);

        }

        return toReturn;
    }

    private static void orderNums(ArrayList<String> params) {
        VectorHeap<Integer> myHeap = new VectorHeap<>();
        Stack<String> myStack = new Stack<>();
        ArrayList<String> toPrint = new ArrayList<>();

        for (String s : params) {
            String[] line = s.split(",");
            int nice = Integer.parseInt(line[2]);

            myHeap.add(nice);
            myStack.add(s);
        }

        myHeap.showQueue();
        System.out.println("");

        System.out.println("Usuarios ordenados: \n");

        while (myHeap.peek() != null) {
            for (String b : myStack) {
                String[] line = b.split(",");
                int num = Integer.parseInt(line[2]);

                if (myHeap.peek() == num) {
                    myHeap.removeTop();
                    toPrint.add(b);
                }
            }
        }

        for (String print : toPrint) {
            System.out.println(print);
        }
    }
}
