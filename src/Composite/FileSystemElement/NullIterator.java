package Composite.FileSystemElement;

import java.util.Iterator;

public class NullIterator implements Iterator<FileSystemElement> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public FileSystemElement next() {
        return null;
    }
    
}
