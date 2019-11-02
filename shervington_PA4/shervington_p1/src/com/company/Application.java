package com.company;

import java.io.File;
import java.io.IOException;

public class Application extends DuplicateRemover {
    public static void main(String[] args) throws IOException {
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        File textFile = new File("problem1.txt");
        duplicateRemover.remove(textFile);

        File outputFile = new File("unique_words.txt");
        duplicateRemover.write(outputFile);
    }
}
