package DecoButton;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DecoWindow extends JFrame implements ActionListener {

    JButton quit;

    public DecoWindow() {
        super("Deco Button");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        JPanel jp = new JPanel();
        getContentPane().add(jp);
        jp.add(new CoolDecorator(new JButton("Cbutton")));
        jp.add(new SlashDecorator(new CoolDecorator(new JButton("Dbutton"))));
        jp.add(new SlashDecorator(new CoolDecorator(new JButton("New Button"))));

        // jp.add( new CoolDecorator(new JButton("Dbutton")));
        jp.add(quit = new JButton("Quit"));
        quit.addActionListener(this);
        setSize(new Dimension(200, 100));
        setVisible(true);
        quit.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }

    public static void main(String[] args) {
        new DecoWindow();
    }

}
