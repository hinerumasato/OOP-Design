package Composite.FileSystemElement;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<FileSystemElement> {

    private Stack<Iterator<FileSystemElement>> stack = new Stack<Iterator<FileSystemElement>>();

    public CompositeIterator(Iterator<FileSystemElement> iterator) {
        stack.push(iterator);
    } 

    @Override
    public boolean hasNext() {
        if(!stack.isEmpty()) {
            Iterator<FileSystemElement> iterator = stack.peek();
            if(!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            }
            else return true;
        }
        else return false;
    }

    @Override
    public FileSystemElement next() {
        if(hasNext()) {
            Iterator<FileSystemElement> iterator = stack.peek();
            FileSystemElement element = iterator.next();
            if(element instanceof Folder) {
                stack.push(element.createIterator());
            }
            return element;
        }
        return null;
    }
    
}
