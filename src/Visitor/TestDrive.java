package Visitor;

public class TestDrive {
    public static void main(String[] args) {
        File file1 = new File("word.docx" ,1);
        File file2 = new File("excel.xlsx" ,2);
        File file3 = new File("demo.cpp" ,3);

        Folder folder1 = new Folder("document");
        Folder folder2 = new Folder("program");

        folder1.addChild(file1);
        folder1.addChild(file2);

        folder2.addChild(file3);

        Folder allFiles = new Folder("Disk C");
        allFiles.addChild(folder1);
        allFiles.addChild(folder2);

        System.out.println(allFiles.accept(new CountFileVisitor()));
    }
}
