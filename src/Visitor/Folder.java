package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Folder extends StorageElement {
    private List<StorageElement> childrens = new ArrayList<StorageElement>();

    public Folder(String name) {
        super(name);
    }

    public List<StorageElement> getChildrens() {
        return childrens;
    }

    public void addChild(StorageElement element) {
        childrens.add(element);
    }

    @Override
    public Object accept(Visitor visitor, Object... inp) {
        return visitor.visitFolder(this, inp);
    }
}
