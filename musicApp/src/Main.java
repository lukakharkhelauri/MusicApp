public class Main {
    public static void main(String[] args) {
        Music track1 = new Music("Another One Bites the Dust", 3.5, "Rock");
        Music track2 = new Music("Bohemian Rhapsody", 4.2, "Rock");
        Music track3 = new Music("Till i collapse", 2.8, "Hip-Hop");
        Music track4 = new Music("Rap God", 2.4, "Hip-Hop");

        Album album1 = new Album("Album 1", 2023);
        album1.addMusic(track1);
        album1.addMusic(track2);

        Album album2 = new Album("Album 2", 2021);
        album2.addMusic(track3);
        album2.addMusic(track4);

        Artist artist1 = new Artist("Queen");
        artist1.addAlbum(album1);

        Artist artist2 = new Artist("Eminem");
        artist2.addAlbum(album2);

        MusicLibrary library = new MusicLibrary();
        library.displayLibraryInfo();

        Music searchedMusic = library.searchMusic("Another One Bites the Dust");
        if (searchedMusic != null) {
            System.out.println("Found song:");
            searchedMusic.displayInfo();
        } else {
            System.out.println("Song not found.");
        }

        Music randomSong = library.giveRandomMusic();
        if (randomSong != null) {
            randomSong.play();
            randomSong.stop();
        }

        artist1.displayInfo();
        artist2.displayInfo();
    }
}
