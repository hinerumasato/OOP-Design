package BTOn.SongApp;

import java.util.ArrayList;
import java.util.List;

public class SearchByCategory implements SearchBehavior {
    private String category;

    public SearchByCategory(String category) {
        this.category = category;
    }

    private List<MusicFile> searchByCategory(List<Album> albums) {
        List<MusicFile> result = new ArrayList<MusicFile>();
        for(Album album : albums)
            for(MusicFile musicFile : album.getMusicFiles())
                if(musicFile.hasCategory(category))
                    result.add(musicFile);
        return result;
    } 

    @Override
    public List<MusicFile> search(List<Album> albums) {
        return searchByCategory(albums);
    }
    
}
