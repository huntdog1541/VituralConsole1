/**
 * Created by David on 10/14/2014.
 */
public class Kernel {

    private String currentDirectory;
    private String currentFile;
    private FileSystem sys;

    public Kernel()
    {
        sys = new FileSystem();

    }

}
