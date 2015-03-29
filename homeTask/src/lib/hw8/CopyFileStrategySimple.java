package lib.hw8;

/**
 * Created by Liberstina on 17.03.2015.
 */
import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;


public class CopyFileStrategySimple implements CopyFileStrategy {
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        if(new File(s1).exists()){
            throw new FileAlreadyPresentsException("Error: File is already presented");
        }
        try (FileInputStream in = new FileInputStream(s);
             FileOutputStream out = new FileOutputStream(s1)) {
            int read;
            for (; (read = in.read()) != -1; ) {//endless loop of reading
                out.write(read);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new FileCopyFailedException("Error: Copying file is failed");
        }
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException,FileCopyFailedException {
        copyFile(file.getAbsolutePath(), file1.getAbsolutePath());
    }
}