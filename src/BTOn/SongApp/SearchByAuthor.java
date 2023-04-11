package BTOn.SongApp;

import java.util.ArrayList;
import java.util.List;

public class SearchByAuthor implements SearchBehavior {

    private String author;

    public SearchByAuthor(String author) {
        this.author = author;
    }

    private List<MusicFile> searchByAuthor(List<Album> albums) {
        List<MusicFile> result = new ArrayList<MusicFile>();
        for(Album album : albums)
            for(MusicFile musicFile : album.getMusicFiles())
                if(musicFile.hasAuthor(author))
                    result.add(musicFile);
        return result;
    }

    @Override
    public List<MusicFile> search(List<Album> albums) {
        return searchByAuthor(albums);
    }
    
}
