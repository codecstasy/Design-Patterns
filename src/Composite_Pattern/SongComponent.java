package Composite_Pattern;

import java.util.List;

public abstract class SongComponent {
    public abstract void addSong(Song song);
    public abstract List <Song> getSongList();
}
