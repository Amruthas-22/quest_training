package com.quest.casestudyyt;

import java.util.Comparator;

public class DurationComparator implements Comparator<TrackClass> {
    @Override
    public int compare(TrackClass t1, TrackClass t2) {
        return Double.compare(t1.getDuration(), t2.getDuration());
    }


}
