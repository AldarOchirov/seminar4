package com.jcourse.ochirov.seminar4;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import static java.lang.String.valueOf;

public class Writer {
    public void writeToFile(List<WordCount> wordCountList, String[] args){
        FileWriter writer = null;
        try {
            writer = new FileWriter(args[1]);
            for (WordCount wordCount : wordCountList) {
                writer.append(wordCount.word);
                writer.append(" ");
                writer.append(valueOf(wordCount.count));
                writer.append(" ");
                writer.append(valueOf(wordCount.count*100.0/wordCountList.size()));
                writer.append("\n");
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
