package com.quest.casestudyyt;

import java.util.Comparator;

public class RatingComparator implements Comparator<TrackClass> {
    @Override
    public int compare(TrackClass t1, TrackClass t2) {
        return Double.compare(t2.getRating(), t1.getRating()); // Descending order
    }
}
