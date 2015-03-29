package lib.hw8;

import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;

/**
 * Created by Liberstina on 27.03.2015.
 */
public class RunClass {
  public static void main(String[] args) throws FileCopyFailedException, FileAlreadyPresentsException {
    ImplCopyFileFactory copyFF = new ImplCopyFileFactory();


    com.sourceit.hometask.io.CopyFileStrategy simpleCopy = copyFF.createSimpleCopyFileStrategy();
    com.sourceit.hometask.io.CopyFileStrategy bufferCopy = copyFF.createBufferedCopyFileStrategy();
    com.sourceit.hometask.io.CopyFileStrategy channelsCopy = copyFF.createChannelsCopyFileStrategy();
    com.sourceit.hometask.io.CopyFileStrategy filesCopy = copyFF.createFilesCopyFileStrategy();
/*
input data path files
C:\Users\Liberstina\Private\Compile.txt
 */
    String pathMain = "D:\\java.txt"; //for convinient using method for copying
    String pathSimple = "D:\\javaSimple.txt";
    String pathBuff = "D:\\javaBuff.txt";
    String pathChann = "D:\\javaChann.txt";
    String pathFiles = "D:\\javaFiles.txt";

      /*
destination data files
 */
    File txtMain = new File("D:\\java.txt");
    File txtSimple = new File("D:\\javaSimple.txt");
    File txtBuff = new File("D:\\javaBuff.txt");
    File txtChann = new File("D:\\javaChann.txt");
    File txtFiles = new File("D:\\javaFiles.txt");

    try {

      //Copying methods are realized
      //SimpleCopy with timesheet
      long startTimeSimple = System.nanoTime();
      copyFF.createSimpleCopyFileStrategy().copyFile(pathMain, pathSimple);
      long elapsedTimeSimple = System.nanoTime() - startTimeSimple;
      System.out.println("Elapsed Time for Simple copying is " + (elapsedTimeSimple / 1000000000000.0) + " sec");

      //BuffCopy with timesheet
     long startTimeBuff = System.nanoTime();
      copyFF.createBufferedCopyFileStrategy().copyFile(pathMain, pathBuff);
      long elapsedTimeBuff = System.nanoTime() - startTimeBuff;
      System.out.println("Elapsed Time for Buffered copying is " + (elapsedTimeBuff / 1000000000000.0) + " sec");

      //Channel with timesheet
       long startTimeChann = System.nanoTime();
      copyFF.createChannelsCopyFileStrategy().copyFile(pathMain, pathChann);
      long elapsedTimeChann = System.nanoTime() - startTimeChann;
      System.out.println("Elapsed Time for CopyFile copying is " + (elapsedTimeChann / 1000000000000.0) + " sec");

      //CopyFile with timesheet
      long startTimeCopyFile = System.nanoTime();
      copyFF.createFilesCopyFileStrategy().copyFile(pathMain, pathFiles);
      long elapsedTimeCopyFile = System.nanoTime() - startTimeCopyFile;
      System.out.println("Elapsed Time for CopyFile copying is " + (elapsedTimeCopyFile / 1000000000000.0) + " sec");

    } catch (FileAlreadyPresentsException e) {

      System.out.println(e.getMessage());

    }
  }
}
