package Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileLogger implements Logger {

    private String fileName;
    public FileLogger(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void log(String msg) {
        try {
            File file = new File(fileName);
            Writer out = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream(file, true)));
            out.write(msg + "\n");
            out.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
