package Composite_Pattern_2;

import java.util.ArrayList;

public class Playlist extends SongComponent {
    private String playlistName;
    private ArrayList<SongComponent> playlistComponents = new ArrayList<SongComponent>();
    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }
    public void addToPlaylist(SongComponent songComponent) {
        this.playlistComponents.add(songComponent);
    }
    public void removeFromPlaylist(SongComponent songComponent) {
        this.playlistComponents.remove(songComponent);
    }
    public ArrayList<SongComponent> seePlaylist() {
        return this.playlistComponents;
    }
    public void play() {
        if(playlistName != null) {
            System.out.println("Playing the playlist: " + playlistName);
        }
    }
}
