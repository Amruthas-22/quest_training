package com.quest.casestudyyt;

import java.util.Objects;

public class TrackClass {
    private int id;
    private String title;
    private String artist;
    private double duration;
    private int rating;

    public TrackClass(int id, String title, String artist, double duration) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.rating = 0;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getDuration() {
        return duration;
    }


    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5.");
        }
        this.rating = rating;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TrackClass track = (TrackClass) obj;
        return Objects.equals(id, track.id);
    }

    @Override
    public String toString() {
        return "Track{id='" + id + "', title='" + title + "', artist='" + artist + "', duration=" + duration + ", rating=" + rating + "}";
    }

}


