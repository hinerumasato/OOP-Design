package Composite.FileSystemElement;

import java.util.Iterator;

public class File extends FileSystemElement {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + ", size = " + getSize());
    }

    @Override
    public int countFile() {
        return 1;
    }

    public FileSystemElement getElement() {
        return this;
    }

    @Override
    public Iterator<FileSystemElement> createIterator() {
        return super.createIterator();
    }
}
