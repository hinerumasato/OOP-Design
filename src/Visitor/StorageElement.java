package Visitor;

public abstract class StorageElement {
    protected String name;

    public StorageElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Object accept(Visitor visitor);
}
