package BTOn.SongApp;

import java.util.ArrayList;
import java.util.List;

public class SearchByPerformer implements SearchBehavior {
    private String performer;

    public SearchByPerformer(String performer) {
        this.performer = performer;
    }

    private List<MusicFile> searchByPerformer(List<Album> albums) {
        List<MusicFile> result = new ArrayList<MusicFile>();
        for(Album album : albums)
            for(MusicFile musicFile : album.getMusicFiles())
                if(musicFile.hasPerformer(performer))
                    result.add(musicFile);
        return result;
    }

    @Override
    public List<MusicFile> search(List<Album> albums) {
        return searchByPerformer(albums);
    }
    
}
