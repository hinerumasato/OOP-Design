package Visitor;

public interface Visitor {
    public Object visitFile(File file);
    public Object visitFolder(Folder folder);
}
