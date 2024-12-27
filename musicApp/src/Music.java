public class Music extends Playable{
    private String title;
    private double duration;
    private String genre;

    public Music(String title, double duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void play () {
        System.out.println("music has started");
    }

    @Override
    public void stop() {
        System.out.println("music has stopped");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration);
        System.out.println("genre: " + genre);
    }
}
