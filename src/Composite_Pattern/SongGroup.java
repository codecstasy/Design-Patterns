package Composite_Pattern;

import java.util.List;

public class SongGroup extends SongComponent {
    List <Song> songList;
    public void addSong(Song song) {
        songList.add(song);
    }
    public List <Song> getSongList() {
        return songList;
    }
}
