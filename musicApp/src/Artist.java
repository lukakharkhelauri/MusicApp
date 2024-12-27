import java.util.*;

public class Artist {
    private String name;
    private List<Album> albums;

    public Artist(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void displayInfo() {
        System.out.println("Artist: " + name);
        for (Album album : albums) {
            album.displayInfo();
        }
    }
}
