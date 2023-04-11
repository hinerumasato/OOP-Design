package BTOn.SongApp;

import java.util.ArrayList;
import java.util.List;

public class SearchByName implements SearchBehavior {

    private String name;
    
    public SearchByName(String name) {
        this.name = name;
    }

    private List<MusicFile> searchByName(List<Album> albums) {
        List<MusicFile> result = new ArrayList<MusicFile>();
        for(Album album : albums)
            for(MusicFile musicFile : album.getMusicFiles())
                if(musicFile.hasName(name))
                    result.add(musicFile);
        return result;
    }

    @Override
    public List<MusicFile> search(List<Album> albums) {
        return searchByName(albums);
    }
    
}
