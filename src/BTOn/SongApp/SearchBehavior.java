package BTOn.SongApp;

import java.util.List;

public interface SearchBehavior {
    public List<MusicFile> search(List<Album> albums);
}
