/**
 * Created by David on 10/15/2014.
 */
public class File {

    private String currentFileName;
    private String fileParentDirectory;
    private byte[] fileContent;
    private boolean hidden;
    private boolean executable;
    private boolean readable;


    public File()
    {
        hidden = false;
        executable = false;
        readable = true;
    }

    public File(File fileIn)
    {

    }

    public void getFile()
    {

    }
}
