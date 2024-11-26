package com.quest.assignment_Vars;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        String[] arr = {"java","python","kotlin","java","python","kotlin","c"};
        HashMap<String,Integer> map = new HashMap<>();
        for (String lang: arr) {
            map.put(lang,map.getOrDefault(lang,0)+1);

        }
//        for(Map.Entry<String,Integer>  entry)
    }
}
