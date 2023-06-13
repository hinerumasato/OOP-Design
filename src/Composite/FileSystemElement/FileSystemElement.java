package Composite.FileSystemElement;

import java.util.Iterator;

public abstract class FileSystemElement {
    protected String name;

    public FileSystemElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public int getSize() {
        throw new UnsupportedOperationException();
    }

    public int countFile() {
        throw new UnsupportedOperationException();
    }

    public FileSystemElement getElement(String name) {
        throw new UnsupportedOperationException();
    }

    public Iterator<FileSystemElement> createIterator() {
        throw new UnsupportedOperationException();
    }

    public void addElement(FileSystemElement element) {
        throw new UnsupportedOperationException();
    }

    public void removeElement(FileSystemElement element) {
        throw new UnsupportedOperationException();
    }
}
