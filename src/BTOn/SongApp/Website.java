package BTOn.SongApp;

import java.util.ArrayList;
import java.util.List;

public class Website {
    public List<Album> albums;
    
    public Website() {
        this.albums = new ArrayList<Album>();
    };

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public List<MusicFile> searchBy(SearchBehavior ... searchBehaviors) {
        List<MusicFile> result = new ArrayList<MusicFile>();
        List<Album> searchedAlbums = new ArrayList<Album>();
        boolean isFirstSearch = true;
        for(SearchBehavior searchBehavior : searchBehaviors)
            if(isFirstSearch) {
                result.addAll(searchBehavior.search(albums));
                isFirstSearch = false;
            }
            else {
                Album searchedAlbum = new Album();
                for(MusicFile musicFile : result)
                    searchedAlbum.addMusicFile(musicFile);
                searchedAlbums.add(searchedAlbum);
                result = searchBehavior.search(searchedAlbums);
            }
        return result;
    } 
}
