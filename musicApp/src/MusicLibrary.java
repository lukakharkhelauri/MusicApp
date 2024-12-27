import java.util.*;

public class MusicLibrary {
    private List<Artist> artists;
    private List<Album> albums;
    private List<Music> songs;

    public MusicLibrary() {
        artists = new ArrayList<>();
        albums = new ArrayList<>();
        songs = new ArrayList<>();
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
        for (Album album : artist.getAlbums()) {
            addAlbum(album);
        }
    }

    public void addAlbum(Album album) {
        albums.add(album);
        songs.addAll(album.getMusics());
    }

    public void addMusic(Music music) {
        songs.add(music);
    }

    public void removeArtist(Artist artist) {
        artists.remove(artist);
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
    }

    public void removeMusic(Music music) {
        songs.remove(music);
    }

    public Music searchMusic(String title) {
        for (Music music : songs) {
            if (music.getTitle().equalsIgnoreCase(title)) {
                return music;
            }
        }
        return null;
    }

    public Music giveRandomMusic() {
        if (songs.isEmpty()) {
            return null;
        }
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }

    public void displayLibraryInfo() {
        System.out.println("Music Library:");
        System.out.println("Artists:");
        for (Artist artist : artists) {
            artist.displayInfo();
        }
        System.out.println("All Songs:");
        for (Music song : songs) {
            song.displayInfo();
        }
    }
}
