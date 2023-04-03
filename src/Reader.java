package src;

import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Reader {
    
    public ArrayList<String> Read(String file) throws Exception {
        
        ArrayList<String> fileArrayList = new ArrayList<>();
        String fileString = file;

        try {
            FileReader fileReader = new FileReader(fileString);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while((line = bufferedReader.readLine()) != null) {
                fileArrayList.add(line);

            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return fileArrayList;
    }
}
