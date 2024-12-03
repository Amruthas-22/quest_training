package com.quest.casestudyyt;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserClass {
    private String username;
    private Map<String, PlayList> playlists;
    private Set<TrackClass> favoriteTracks;

    public UserClass(String username, Map<String, PlayList> playlists) {
        this.username = username;
        this.playlists = new HashMap<>();
        this.favoriteTracks = new HashSet<TrackClass>();
    }

    public String getUsername() {
        return username;
    }

    public Map<String, PlayList> getPlaylists() {
        return playlists;
    }

    public Set<TrackClass> getFavoriteTracks() {
        return favoriteTracks;
    }

    public void createPlaylist(String playlistName) {
        if (playlists.containsKey(playlistName)) {
            System.out.println("A playlist with the name '" + playlistName + "' already exists.");
        } else {
            playlists.put(playlistName, new PlayList(playlistName));
            System.out.println("Playlist '" + playlistName + "' created successfully.");
        }
    }

    public void deletePlaylist(String playlistName) {
        if (playlists.remove(playlistName) != null) {
            System.out.println("Playlist '" + playlistName + "' deleted successfully.");
        } else {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
    }

    public PlayList getPlaylist(String playlistName) {
        PlayList playlist = playlists.get(playlistName);
        if (playlist == null) {
            System.out.println("Playlist '" + playlistName + "' not found.");
        }
        return playlist;
    }

    public void displayAllPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists available.");
        } else {
            System.out.println("Playlists for user '" + username + "':");
            for (String playlistName : playlists.keySet()) {
                System.out.println("- " + playlistName);
                playlists.get(playlistName).displayTracks();
            }
        }
    }

    public void markFavorite(TrackClass track) {
        favoriteTracks.add(track);
        System.out.println("Track " + track.getTitle() + " marked as favorite.");
    }

    public void unmarkFavorite(TrackClass track) {
        if (favoriteTracks.remove(track)) {
            System.out.println("Track " + track.getTitle() + " removed from favorites.");
        } else {
            System.out.println("Track " + track.getTitle() + " is not in favorites.");
        }
    }


    public void displayFavorites() {
        if (favoriteTracks.isEmpty()) {
            System.out.println("No favorite tracks.");
        } else {
            System.out.println("Favorite tracks for user '" + username + "':");
            for (TrackClass track : favoriteTracks) {
                System.out.println(track);
            }
        }
    }

}
