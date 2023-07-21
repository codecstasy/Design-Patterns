package Composite_Pattern_2;

public class Song extends SongComponent {
    private String songName;
    public Song(String songName) {this.songName = songName;}
    public void play() {
        if(songName != null)
            System.out.println("Playing the song: " + songName);
    }
}
