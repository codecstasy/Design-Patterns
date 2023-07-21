package Composite_Pattern_2;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        SongComponent song1 = new Song("Jumme ki raat hain");
        SongComponent song2 = new Song("Amaro porano");
        SongComponent song3 = new Song("Hold my hand");
        SongComponent song4 = new Song("Bulbuli tui");

        song1.play();

        Playlist playlist1 = new Playlist("Favourites");
        playlist1.addToPlaylist(song2);
        playlist1.addToPlaylist(song3);

        playlist1.play();
        
        playlist1.removeFromPlaylist(song2);
    }
}
