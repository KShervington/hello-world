import java.io.*;
import java.util.*;

public class DuplicateCounter {
    private Map<String, Integer> wordCounter = new HashMap<String, Integer>();

    void count(File dataFile){
        try {
            FileInputStream inText = new FileInputStream(dataFile);
            Scanner scnr = new Scanner(inText);
            String currWord;

            while (scnr.hasNext()) {
                currWord = scnr.next();
                Integer val = this.wordCounter.get(currWord);
                this.wordCounter.put(currWord, (val == null) ? 1 : val + 1); // FROM GEEKSFORGEEKS.ORG;
            }
            inText.close();
            scnr.close();
        } catch (IOException x){
            x.printStackTrace();
        }
    }

    void write(File outputFile) throws IOException{
        try {
            FileOutputStream textFile = new FileOutputStream(outputFile);
            PrintWriter wordPrint = new PrintWriter (textFile);

            // FROM STACKOVERFLOW.COM; USER: "Stefan Dollase"
            for (Map.Entry<String, Integer> entry : this.wordCounter.entrySet()) {
                wordPrint.println(entry);
            }

            wordPrint.flush();
            textFile.close();
        } catch (IOException x){
            x.printStackTrace();
        }

    }

    //  MAIN METHOD WAS CREATED HERE ONLY FOR TESTING PURPOSES

    public static void main(String[] args) throws IOException {
        DuplicateCounter var = new DuplicateCounter();

        File textFile = new File("problem2.txt");
        var.count(textFile);

        File outputFile = new File("unique_word_counts.txt");
        var.write(outputFile);

    }
}
