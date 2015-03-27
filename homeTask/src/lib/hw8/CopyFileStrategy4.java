package lib.hw8;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Liberstina on 27.03.2015.
 */
public class CopyFileStrategy4 implements CopyFileStrategy{
    @Override
    public void copyFile(String s, String s1) throws FileAlreadyPresentsException, FileCopyFailedException {
        if (!new File(s1).exists()) {
            throw new FileAlreadyPresentsException("Error: File is already presented");
        }
        try {
            Path pathSource = Paths.get(s);
            Path pathDestination = Paths.get(s1);
            Files.copy(pathSource, pathDestination);
        } catch (IOException e) {

            e.printStackTrace();
            throw new FileCopyFailedException("Error: Copying file is failed");
        }

    }

    @Override
    public void copyFile(File file, File file1) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(file.getPath(), file1.getPath());
    }
}
