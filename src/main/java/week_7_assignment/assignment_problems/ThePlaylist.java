import java.util.Arrays;

class Playlist {
    private final String[] songs;
    private int songCount;

    public Playlist(int capacity) {
        this.songs = new String[capacity];
        this.songCount = 0;
    }

    public boolean addSong(String song) {
        if (songCount < songs.length) {
            songs[songCount++] = song;
            return true;
        }
        return false;
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }

    public int getSongCount() {
        return songCount;
    }
}

public class ThePlaylist {
    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked";

        System.out.println("Copy[0]: " + copy[0]);
        System.out.println("Original Playlist[0]: " + p.getSongs()[0]); // Song A
        System.out.println("Song count: " + p.getSongCount()); // 2
    }
}