package com.quest.casestudyyt;

import java.util.Comparator;

public class DurationComparator implements Comparator<TrackClass> {
    @Override
    public int compare(TrackClass t1, TrackClass t2) {
        if (t1.getDuration() > t2.getDuration()) {
            return 1;
        } else if (t1.getDuration() < t2.getDuration()) {
            return -1;
        } else {
            return 0;
        }
    }



}
