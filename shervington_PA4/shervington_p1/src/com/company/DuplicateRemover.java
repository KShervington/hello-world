package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
    private Set<String> uniqueWords = new HashSet<String>();

    void remove(File dataFile){
        try {
            FileInputStream inText = new FileInputStream(dataFile);
            Scanner scnr = new Scanner(inText);

            while (scnr.hasNext()) {
                this.uniqueWords.add(scnr.next());
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

            for (String output : this.uniqueWords) {
                wordPrint.println (output);
            }

            wordPrint.flush();
            textFile.close();
        } catch (IOException x){
            x.printStackTrace();
        }

    }

    //  MAIN METHOD WAS CREATED HERE ONLY FOR TESTING PURPOSES

    public static void main(String[] args) throws IOException {
        DuplicateRemover var = new DuplicateRemover();

        File textFile = new File("problem1.txt");
        var.remove(textFile);

        File outputFile = new File("unique_words.txt");
        var.write(outputFile);
    }
}
