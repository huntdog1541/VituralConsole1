/**
 * Created by David on 10/16/2014.
 */
import javax.swing.*;
import javax.swing.event.DocumentListener;
import javax.swing.event.*;
import javax.swing.text.JTextComponent;
import javax.swing.text.Keymap;
import java.awt.*;
import java.awt.event.*;

public class console extends JFrame implements DocumentListener
{

    JTextArea textArea;
    JTextField entry;

    public console()
    {
        initializeConsole();
    }

    public void initializeConsole()
    {
        setTitle("BASH - Console");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize=new Dimension((int)(screenSize.width/2),(int)(screenSize.height/2));
        int x=(int)(frameSize.width/2);
        int y=(int)(frameSize.height/2);
        setBounds(x, y, frameSize.width, frameSize.height);

        textArea = new JTextArea();
        textArea.setEditable(true);
        entry = new JTextField();

        JScrollPane pane = new JScrollPane(textArea);
        Panel panel = new Panel();
        panel.setLayout(new BorderLayout());
        panel.add(pane, BorderLayout.CENTER);
        panel.add(entry, BorderLayout.NORTH);

        add(panel);

        setVisible(true);

        setTextExample();
        entry.getDocument().addDocumentListener(this);

        InputMap im = entry.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap am =entry.getActionMap();
        im.put(KeyStroke.getKeyStroke("ESCAPE"), APPEND_ACTION);
        am.put(APPEND_ACTION, new UpdateAction());
        addKeyMap();
    }

    public void addKeyMap()
    {
        Keymap parent = textArea.getKeymap();
        Keymap newmap = JTextComponent.addKeymap("KeymapExampleMap", parent);

        KeyStroke ent = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, )
    }

    public void addText(String txt)
    {
        textArea.append(txt);
    }

    public void clearText()
    {
        textArea.setText("");
    }

    public void setTextExample()
    {
        textArea.append("/root $ ");
    }

    public void insertUpdate(DocumentEvent ev) {

    }

    public void removeUpdate(DocumentEvent ev) {

    }

    public void changedUpdate(DocumentEvent ev) {
    }

    class UpdateAction extends AbstractAction
    {
        public void actionPerformed(ActionEvent ev)
        {
            String temp = entry.getText();
            entry.setText("");
            addText(temp);
        }
    }
}
