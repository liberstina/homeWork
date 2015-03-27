package lib.hw8;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;

/**
 * Created by Liberstina on 27.03.2015.
 */
public class CopyFileStrategy2 implements CopyFileStrategy {

    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        if (!new File(s1).exists()) {
            throw new FileAlreadyPresentsException("Error: File is already presented");
        }
        try (BufferedInputStream bufIn = new BufferedInputStream(new FileInputStream(s));
             BufferedOutputStream bufOut = new BufferedOutputStream(new FileOutputStream(s1))) {

            int buffRead;
            while ((buffRead = bufIn.read()) != -1) {
                bufOut.write(buffRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw new FileCopyFailedException("Error: Copying file is failed");
        }
    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(file.getAbsolutePath(), file1.getAbsolutePath());
    }

}
