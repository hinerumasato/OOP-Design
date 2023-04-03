package DecoButton;

import javax.swing.JComponent;
import java.awt.BorderLayout;

public class Decorator extends JComponent {
    public Decorator(JComponent c) {
        setLayout(new BorderLayout());
        add("Center", c);
    }
}
