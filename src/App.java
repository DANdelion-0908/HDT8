package src;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Reader myReader = new Reader();
        
        System.out.println("Colas de prioridad \n");
        System.out.println("Leyendo archivo...");

        new ProgressBar();

        ArrayList<String> xd = myReader.Read("src/procesos.txt"); //prueba

        System.out.println(xd);

    }
}