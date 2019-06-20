package com.jcourse.ochirov.seminar4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class CountSort {
    public List<WordCount> getSortedList(Map<String, Integer> map){
        List<WordCount> wordCountList = new ArrayList<WordCount>();
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            WordCount wordCount = new WordCount(entry.getKey(),entry.getValue());
            wordCountList.add(wordCount);
        }
        wordCountList.sort(Comparator.naturalOrder());
        return wordCountList;
    }
}
