package com.quest.casestudyyt;

import java.util.*;

public class PlayList {
    private String name;
    private List<TrackClass> tracks;

    public PlayList(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<TrackClass> getTracks() {
        return tracks;
    }
    public void setTracks(List<TrackClass> tracks) {
        this.tracks = tracks;
    }
    public void addTrack(TrackClass track) throws DuplicateTrackException {
        if (tracks.contains(track)) {
            throw new DuplicateTrackException("Track with ID " + track.getId() + " already exists in the playlist.");
        }
        tracks.add(track);
    }
    public void removeTrack(TrackClass track) {
        if (!tracks.remove(track)) {
            System.out.println("Track not found in the playlist.");
        }
    }
    public List<TrackClass> findDuplicates() {
        Set<TrackClass> uniqueTracks = new HashSet<>();
        List<TrackClass> duplicates = new ArrayList<>();
        for (TrackClass track : tracks) {
            if (!uniqueTracks.add(track)) {
                duplicates.add(track);
            }
        }
        return duplicates;
    }
    public List<TrackClass> search(String query) {
        query = query.toLowerCase();
        List<TrackClass> result = new ArrayList<>();
        for (TrackClass track : tracks) {
            if (track.getTitle().toLowerCase().contains(query) || track.getArtist().toLowerCase().contains(query)) {
                result.add(track);
            }
        }
        return result;
    }
    public void displayTracks() {
        if (tracks.isEmpty()) {
            System.out.println("No tracks in the playlist.");
        } else {
            for (TrackClass track : tracks) {
                System.out.println(track);
            }
        }
    }

    public void sortTracksByDuration() {
        tracks.sort(new DurationComparator());
    }

    public void sortTracksByTitle() {
        tracks.sort(new TitleComparator());
    }

    public void sortTracksByRating() {
        tracks.sort(new RatingComparator());
    }

    public void shuffleTracks() {
        Random random = new Random();
        for (int i = tracks.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            TrackClass temp = tracks.get(i);
            tracks.set(i, tracks.get(j));
            tracks.set(j, temp);
        }
    }

    public static PlayList mergePlaylists(PlayList playlist1, PlayList playlist2) {
        PlayList mergedPlaylist = new PlayList("Merged Playlist");
        if (playlist1 != null) {
            mergedPlaylist.getTracks().addAll(playlist1.getTracks());
        }
        if (playlist2 != null) {
            mergedPlaylist.getTracks().addAll(playlist2.getTracks());
        }
        return mergedPlaylist;
    }

}

