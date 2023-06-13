package Visitor;

public interface Visitor {
    public Object visitFile(File file, Object... inp);
    public Object visitFolder(Folder folder, Object... inp);
}
