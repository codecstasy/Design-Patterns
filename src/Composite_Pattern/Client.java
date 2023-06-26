package Composite_Pattern;

public class Client {
    public static void main(String[] args) throws NullPointerException {
        Song song1 = new Song("Tere Naina");
        Song song2 = new Song("Hello");
        Song song3 = new Song("Dure Kothao");
        Song song4 = new Song("Dhinka Chika");
        SongComponent songGroup1 = new SongGroup();
        songGroup1.addSong(song1);
        songGroup1.addSong(song2);
        songGroup1.addSong(song3);
        songGroup1.addSong(song4);
        songGroup1.getSongList();


//        SongComponent songGroup2 = new SongGroup();
//        songGroup2.addSong(song1);
//        songGroup2.addSong(song1);
//        songGroup2.addSong(song1);
//        songGroup2.addSong(song1);
//        songGroup2.getSongList();
    }
}
