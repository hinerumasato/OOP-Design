package Composite.FileSystemElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Folder extends FileSystemElement {
    private List<FileSystemElement> childrens = new ArrayList<FileSystemElement>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addElement(FileSystemElement element) {
        childrens.add(element);
    }

    @Override
    public void removeElement(FileSystemElement element) {
        childrens.remove(element);
    }

    @Override
    public void print() {
        System.out.println("Folder: " + name);
    }

    @Override
    public int getSize() {
        int result = 0;
        for (FileSystemElement children : childrens) {
            result += children.getSize();
        }
        return result;
    }

    @Override
    public int countFile() {
        int result = 0;
        for (FileSystemElement children : childrens) {
            result += children.countFile();
        }
        return result;
    }

    @Override
    public FileSystemElement getElement(String name) {
        for (FileSystemElement children : childrens) {
            if(children.getName().equals(name))
                return children;
        }
        return null;
    }

    @Override
    public Iterator<FileSystemElement> createIterator() {
        return new CompositeIterator(childrens.iterator());
    }
}
