package Composite_Pattern;

import java.util.List;

public class Song extends SongComponent {
    public String songName;
    public Song(String songName) {this.songName = songName;}

    public void addSong(Song song) {}
    public List <Song> nullSongList;
    public List <Song> getSongList() {return nullSongList;}
}
