/**
 * Created by David on 10/14/2014.
 */
import java.util.*;


public class bash {

    private String currentDirectory;
    private String currentFile;
    private ArrayList<String> history;
    private String[] currentCommand;

    public bash()
    {
        history = new ArrayList<String>();
        currentCommand = new String[100];
        currentDirectory = new String("/root");
        currentFile = new String("curFile");
        this.startBash();
    }

    private void startBash()
    {
        this.printPrompt();
        String input = new String();
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        this.parseText(input);

    }

    private void printPrompt()
    {
        System.out.print(currentDirectory + " $ ");
    }

    private void parseText(String text)
    {
        String delims = "[ ]+";
        String tokens[] = text.split(delims);

    }
}
