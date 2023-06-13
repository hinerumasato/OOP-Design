package Composite.FileSystemElement;

import java.util.Iterator;

public class DiskDrive {
    private FileSystemElement allFiles;

    public DiskDrive(FileSystemElement allFiles) {
        this.allFiles = allFiles;
    }

    public void print() {
        Iterator<FileSystemElement> iterator = allFiles.createIterator();
        while(iterator.hasNext())
            iterator.next().print();
    }
    
}
