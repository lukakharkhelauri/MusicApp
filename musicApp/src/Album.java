import java.util.*;

public class Album {
    private String name;
    private int releaseYear;
    private List<Music> musics;

    public Album(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musics = new ArrayList<>();
    }

    public void addMusic(Music music) {
        musics.add(music);
    }

    public void removeMusic(Music music) {
        musics.remove(music);
    }

    public List<Music> getMusics() {
        return musics;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Release year: " + releaseYear);
        for (Music music : musics) {
            System.out.println(music);
        }
    }
}
