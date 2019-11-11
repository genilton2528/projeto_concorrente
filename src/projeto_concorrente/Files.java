package projeto_concorrente;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author genilton
 */
public class Files implements Comparable, Runnable{
    private String name;
    private String size;
    private int start;
    private int end;
    private File[] files;
    private File dirSource;
    private File dirBackup;

    public Files(int start, int end, File[] files, File dirSource, File dirBackup) {
        this.start = start;
        this.end = end;
        this.files = files;
        this.dirSource = dirSource;
        this.dirBackup = dirBackup;
    }        
    
    public Files(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public Files() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void copy(File src, File dst) throws IOException {
        try {
            InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst);           // Transferindo bytes de entrada para saída
            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    public void backupFiles(){
        for (int i = this.start; i <= this.end; i++) {
            try {
                File fileDest = new File(this.dirBackup.getAbsolutePath() + File.separator + this.files[i].getName());
                fileDest.createNewFile();
                this.copy(this.files[i], fileDest);

            } catch (IOException ex) {
                System.err.println(ex.getMessage());
            }
        }
    }

    @Override
    public int compareTo(Object o) {
        Files file = (Files)o;
        
        if (Convert.returnNumbers(this.name) < Convert.returnNumbers(file.getName())) {
            return -1;
        }
        if (Convert.returnNumbers(this.name) > Convert.returnNumbers(file.getName())) {
            return 1;
        }
        return 0;
    }           

    @Override
    public void run() {
        this.backupFiles();
    }
}
