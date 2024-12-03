package com.quest.casestudyyt;

import java.util.Comparator;

public class RatingComparator implements Comparator<TrackClass> {
    @Override
    public int compare(TrackClass t1, TrackClass t2) {
        if (t2.getRating() > t1.getRating()) {
            return 1;
        } else if (t2.getRating() < t1.getRating()) {
            return -1;
        } else {
            return 0;
        }
    }

}
