package com.quest.casestudyyt;

import java.util.Comparator;

public class TitleComparator implements Comparator<TrackClass> {
    @Override
    public int compare(TrackClass t1, TrackClass t2) {
        return t1.getTitle().compareTo(t2.getTitle());
    }
}
