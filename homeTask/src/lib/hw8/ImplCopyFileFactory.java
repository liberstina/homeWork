package lib.hw8;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.CopyFileStrategy;
/**
 * Created by Liberstina on 27.03.2015.
 */
public class ImplCopyFileFactory implements CopyFileFactory{

    @Override
    public CopyFileStrategy createSimpleCopyFileStrategy() {



        return new CopyFileStrategy1();
    }

    @Override
    public CopyFileStrategy createBufferedCopyFileStrategy() {
        return new CopyFileStrategy2();
    }

    @Override
    public CopyFileStrategy createChannelsCopyFileStrategy() {
        return new CopyFileStrategy3();
    }

    @Override
    public CopyFileStrategy createFilesCopyFileStrategy() {
        return new CopyFileStrategy4();
    }
}
