package Visitor;

public class CountFileVisitor implements Visitor {

    @Override
    public Object visitFile(File file, Object... inp) {
        return 1;
    }

    @Override
    public Object visitFolder(Folder folder, Object... inp) {
        int sum = 0;
        for (StorageElement children : folder.getChildrens()) {
            sum += (Integer) children.accept(this);
        }
        return sum;
    }
    
}
