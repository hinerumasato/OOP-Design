package BTOn.SongApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        boolean isFirstSearch = true;
        for(SearchBehavior searchBehavior : searchBehaviors)
            if(isFirstSearch) {
                result.addAll(searchBehavior.search(albums));
                isFirstSearch = false;
            }
            else {
                Album searchedAlbum = new Album();
                List<Album> searchedAlbums = new ArrayList<Album>();
                for(MusicFile musicFile : result)
                    searchedAlbum.addMusicFile(musicFile);
                searchedAlbums.add(searchedAlbum);
                result = searchBehavior.search(searchedAlbums);
            }
        return result;
    }

    public List<MusicFile> sortBy(SortBehavior ... sortBehaviors) {
        List<MusicFile> result = new ArrayList<MusicFile>();
        for(Album album : albums)
            result.addAll(album.getMusicFiles());
        Collections.sort(result, new Comparator<MusicFile>() {

            @Override
            public int compare(MusicFile o1, MusicFile o2) {
                int index = 0;
                int compareResult = 0;

                while(compareResult == 0) {
                    if(sortBehaviors[index] instanceof SortByName)
                        compareResult = o1.getSong().getTitle().compareTo(o2.getSong().getTitle());
                    if(sortBehaviors[index] instanceof SortByAuthor)
                        compareResult = o1.getSong().getAuthor().compareTo(o2.getSong().getAuthor());

                    if(!sortBehaviors[index].isAscending)
                        compareResult *= -1;
                    index++;
                }

                return compareResult;
            }
            
        });
        
        return result;
    }
}
