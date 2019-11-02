import java.io.File;
import java.io.IOException;

public class Application extends DuplicateCounter {
    public static void main (String[] args) throws IOException {
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        File inputFile = new File("problem2.txt");
        duplicateCounter.count(inputFile);

        File outputFile = new File("unique_word_counts.txt");
        duplicateCounter.write (outputFile);
    }
}
