package BTOn.SongApp;

public abstract class SortBehavior {

    public static final boolean SORT_ASCENDING = true;
    public static final boolean SORT_DESCENDING = false;

    protected boolean isAscending;

    public SortBehavior(boolean isAscending) {
        this.isAscending = isAscending;
    }
}
