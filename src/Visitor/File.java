package Visitor;

public class File extends StorageElement {
    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }


    @Override
    public Object accept(Visitor visitor, Object... inp) {
        return visitor.visitFile(this, inp);
    }
}
