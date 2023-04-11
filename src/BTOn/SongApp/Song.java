package BTOn.SongApp;

public class Song {
    private String title;
    private String lyrics;
    private String author;
    private String category;

    public Song() {};

    public Song(String title, String lyrics, String author, String category) {
        this.title = title;
        this.lyrics = lyrics;
        this.author = author;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
}
