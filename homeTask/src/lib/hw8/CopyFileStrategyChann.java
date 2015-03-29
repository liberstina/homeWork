package lib.hw8;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Created by Liberstina on 27.03.2015.
 */
public class CopyFileStrategyChann implements CopyFileStrategy{

    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {

            if (new File(s1).exists()) {
                throw new FileAlreadyPresentsException("Error: File is already presented");
            }
            try (FileChannel in = new FileInputStream(s).getChannel();
                 FileChannel out = new FileOutputStream(s1).getChannel()) {
                out.transferFrom(in, 0, in.size());
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
