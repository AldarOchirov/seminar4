package com.jcourse.ochirov.seminar4;

import java.io.*;
import java.util.*;

public class WordReader {
    public Map<String, Integer> readFile(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        Reader reader = null;
        try {
            reader = new InputStreamReader(new BufferedInputStream(new FileInputStream(args[0])));
        }catch(FileNotFoundException e){
            System.out.println("Файл не найден!");
        }
        Integer initFreq = 1;
        int readChar = 0;
        while(true){
            try {
                readChar = reader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if (readChar == -1){
                break;
            }
            if (Character.isLetterOrDigit(readChar)){
                str.append((char)readChar);
            }
            else{
                if (str.length() == 0){
                    continue;
                }
                if (map.containsKey(str.toString())){
                    Integer freq = map.get(str.toString());
                    freq = freq + 1;
                    map.put(str.toString(),freq);
                }
                else{
                    map.put(str.toString(), initFreq);
                }
                str.setLength(0);
            }
        }
//        for (Map.Entry entry : map.entrySet()) {
//            System.out.println("Key: " + entry.getKey() + " Value: "
//                    + entry.getValue());
//        }
//

        List<Integer> list = new ArrayList<>(map.values());
//        Collections.sort(list);
//        Collections.reverse(list);
//        System.out.println(list);
        return map;
    }
}
