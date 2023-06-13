package Composite.FileSystemElement;

public class TestDrive {
    public static void main(String[] args) {
        FileSystemElement file1 = new File("word.docx" ,1);
        FileSystemElement file2 = new File("excel.xlsx" ,2);
        FileSystemElement file3 = new File("demo.cpp" ,3);

        FileSystemElement folder1 = new Folder("document");
        FileSystemElement folder2 = new Folder("program");

        folder1.addElement(file1);
        folder1.addElement(file2);

        folder2.addElement(file3);

        FileSystemElement allFiles = new Folder("Disk C");
        allFiles.addElement(folder1);
        allFiles.addElement(folder2);

        DiskDrive diskDrive = new DiskDrive(allFiles);
        diskDrive.print();
    }
}
