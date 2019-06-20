package com.jcourse.ochirov.seminar4;

public class WordCount implements Comparable<WordCount>{
    String word;
    long count;

    public WordCount(String word, long count){
        this.word = word;
        this.count = count;
    }

    public int compareTo(WordCount wordCount) {
        if (count < wordCount.count){
            return 1;
        }
        else{
            if (count > wordCount.count){
                return -1;
            }
            else{
                return word.compareTo(wordCount.word);
            }
        }
    }

    @Override
    public String toString() {
        return "{" +
                "word='" + word + '\'' +
                ", count=" + count +
                '}';
    }
}
