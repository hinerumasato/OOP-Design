package Visitor;

public class DisplayContentVisitor implements Visitor {

    @Override
    public Object visitFile(File file, Object... inp) {
        String str = "";
        int level = (Integer) inp[0];
        for(int i = 0; i < level; i++)
            str += "   ";
        str += file.getName() + " " + file.getSize() + "Kbs\n";
        return str.toString();
    }

    @Override
    public Object visitFolder(Folder folder, Object... inp) {
        String str = "";
        int level = (Integer) inp[0];
        for(int i = 0; i < level; i++)
            str += "   ";
        str += folder.getName() + "\n";
        for (StorageElement element : folder.getChildrens()) {
            str += element.accept(this, level + 1);
        }
        return str;
    }

}
