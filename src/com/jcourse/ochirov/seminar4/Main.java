package com.jcourse.ochirov.seminar4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WordReader word = new WordReader();
        Map<String, Integer> map = new HashMap<>();
        try {
            map = word.readFile(args);
        } catch (IOException e) {
            System.out.println("IOException!");
        }
        CountSort countSort = new CountSort();
        List<WordCount> wordCountList = countSort.getSortedList(map);
        Writer writer = new Writer();
        writer.writeToFile(wordCountList,args);
    }
}
