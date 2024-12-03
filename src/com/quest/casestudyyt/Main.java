package com.quest.casestudyyt;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        UserClass user1 = new UserClass("Alice", new HashMap<>());
        UserClass user2 = new UserClass("Bob", new HashMap<>());

        user1.createPlaylist("Rock Classics");
        user1.createPlaylist("Pop Hits");
        user2.createPlaylist("Jazz Vibes");

        // Add tracks to playlists
        PlayList rockClassics = user1.getPlaylist("Rock Classics");
        if (rockClassics != null) {
            try {
                rockClassics.addTrack(new TrackClass(1, "Fire", "Arthur Brown", 5.55));
                rockClassics.addTrack(new TrackClass(2, "Stairway to Heaven", "Led Zeppelin", 8.02));
                rockClassics.addTrack(new TrackClass(3, "Paranoid", "Black", 6.30));
            } catch (DuplicateTrackException e) {
                System.out.println(e.getMessage());
            }
        }

        PlayList popHits = user1.getPlaylist("Pop Hits");
        if (popHits != null) {
            try {
                popHits.addTrack(new TrackClass(4, "Shape of You", "Ed Sheeran", 4.24));
                popHits.addTrack(new TrackClass(5, "Blinding Lights", "The Weeknd", 3.20));
                popHits.addTrack(new TrackClass(4, "Shape of You", "Ed Sheeran", 4.24)); // Duplicate
            } catch (DuplicateTrackException e) {
                System.out.println(e.getMessage());
            }
        }

        // Display all playlists and tracks for Alice
        System.out.println("\nDisplaying all playlists and tracks for Alice:");
        user1.displayAllPlaylists();

        // Remove a track
        if (rockClassics != null) {
            TrackClass trackToRemove = new TrackClass(3, "Paranoid", "Black", 6.30);
            rockClassics.removeTrack(trackToRemove);
            System.out.println("\nDisplaying 'Rock Classics' after removing 'Hotel California':");
            rockClassics.displayTracks();
        }

        // Find duplicates in 'Pop Hits'
        if (popHits != null) {
            List<TrackClass> duplicates = popHits.findDuplicates();
            System.out.println("\nDuplicate tracks in 'Pop Hits':");
            for (TrackClass track : duplicates) {
                System.out.println(track);
            }
        }

        // Search for tracks by query
        if (rockClassics != null) {
            System.out.println("\nSearching for tracks containing 'Heaven' in 'Rock Classics':");
            List<TrackClass> searchResults = rockClassics.search("Heaven");
            for (TrackClass track : searchResults) {
                System.out.println(track);
            }
        }

        // Test the equals method by comparing two Track objects
        TrackClass track1 = new TrackClass(1, "Fire", "Arthur Brown", 5.55);
        TrackClass track2 = new TrackClass(1, "Fire", "Arthur Brown", 5.55);
        System.out.println("\nComparing track1 and track2: " + track1.equals(track2));

        TrackClass track3 = new TrackClass(6, "Shape of You", "Ed Sheeran", 4.24);
        System.out.println("Comparing track1 and track3: " + track1.equals(track3));

        // Test exception handling
        if (rockClassics != null) {
            try {
                rockClassics.addTrack(new TrackClass(1, "Fire", "Arthur Brown", 5.55));
            } catch (DuplicateTrackException e) {
                System.out.println("\nException: " + e.getMessage());
            }
        }

        // Sort tracks
        if (rockClassics != null) {
            System.out.println("\nSorting 'Rock Classics' by duration:");
            rockClassics.sortTracksByDuration();
            rockClassics.displayTracks();

            System.out.println("\nSorting 'Rock Classics' by title:");
            rockClassics.sortTracksByTitle();
            rockClassics.displayTracks();
        }

        // Shuffle tracks in 'Pop Hits'
        if (popHits != null) {
            System.out.println("\nShuffling tracks in 'Pop Hits':");
            popHits.shuffleTracks();
            popHits.displayTracks();
        }

        // Merge two playlists
        PlayList mergedPlaylist = PlayList.mergePlaylists(user1.getPlaylist("Rock Classics"), user1.getPlaylist("Pop Hits"));
        System.out.println("\nDisplaying merged playlist (Rock Classics + Pop Hits):");
        mergedPlaylist.displayTracks();

        // Rate tracks and display
        if (rockClassics != null) {
            System.out.println("\nRating tracks in 'Rock Classics':");
            rockClassics.getTracks().get(0).setRating(5);
            rockClassics.getTracks().get(1).setRating(4);
//            rockClassics.getTracks().get(2).setRating(3);

            System.out.println("\nSorting 'Rock Classics' by rating:");
            rockClassics.sortTracksByRating();
            rockClassics.displayTracks();
        }

        // Mark  favorite
        user1.markFavorite(track1);
        user1.markFavorite(track2);

        System.out.println("\nDisplaying all favorite tracks for Alice:");
        user1.displayFavorites();

        // Unmark  favorite
        user1.unmarkFavorite(track1);
        System.out.println("\nDisplaying all favorite tracks after unmarking one:");
        user1.displayFavorites();

        // Delete a playlist
        user1.deletePlaylist("Pop Hits");
        user1.displayAllPlaylists();
    }
}
