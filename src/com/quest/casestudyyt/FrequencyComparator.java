package com.quest.casestudyyt;

import java.util.Comparator;
import java.util.Map;

public  class FrequencyComparator implements Comparator<Map.Entry<String, Integer>> {
    @Override
    public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {

        int value1 = entry2.getValue();
        int value2 = entry1.getValue();

        if (value1 < value2) {
            return -1;
        } else if (value1 > value2) {
            return 1;
        } else {
            return 0;
        }

    }
}