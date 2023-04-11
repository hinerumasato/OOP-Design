package BTOn.SongApp;

public class MusicFile {
    private Song song;
    private String performer;
    private String path;
    private int accessTimes;

    public MusicFile() {};

    public MusicFile(Song song, String performer, String path, int accessTimes) {
        this.song = song;
        this.performer = performer;
        this.path = path;
        this.accessTimes = accessTimes;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getAccessTimes() {
        return accessTimes;
    }

    public void setAccessTimes(int accessTimes) {
        this.accessTimes = accessTimes;
    }

    @Override
    public String toString() {
        return song.getTitle() + ", " + song.getAuthor() + ", " + accessTimes;
    }

    public boolean hasName(String name) {
        return song.getTitle().contains(name);
    }

    public boolean hasAuthor(String author) {
        return song.getAuthor().contains(author);
    }

    public boolean hasPerformer(String performer) {
        return this.performer.contains(performer);
    }

    public boolean hasCategory(String category) {
        return song.getCategory().contains(category);
    }
}
