package BTOn.SongApp;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private String publishedDate;
    private String publisher;
    private List<MusicFile> musicFiles;

    public Album() {
        this.musicFiles = new ArrayList<MusicFile>();
    }

    public Album(String title, String publishedDate, String publisher) {
        this.title = title;
        this.publishedDate = publishedDate;
        this.publisher = publisher;
        this.musicFiles = new ArrayList<MusicFile>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<MusicFile> getMusicFiles() {
        return musicFiles;
    }

    public void setMusicFiles(List<MusicFile> musicFiles) {
        this.musicFiles = musicFiles;
    }

    public void addMusicFile(MusicFile musicFile) {
        this.musicFiles.add(musicFile);
    }

    public boolean hasMusicName(String name) {
        for(MusicFile musicFile : musicFiles)
            if(musicFile.getSong().getTitle().contains(name))
                return true;
        return false;
    }

    public MusicFile findMusicFileByName(String name) {
        for(MusicFile musicFile : musicFiles)
            if(musicFile.getSong().getTitle().contains(name))
                return musicFile;
        return null;
    }

    
}
