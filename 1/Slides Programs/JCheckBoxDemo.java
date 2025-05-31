import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo extends JFrame implements ItemListener {
    JLabel jlab;

    public JCheckBoxDemo() {
        setTitle("JCheckBox Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JCheckBox cb = new JCheckBox("C");
        cb.addItemListener(this);
        add(cb);

        cb = new JCheckBox("C++");
        cb.addItemListener(this);
        add(cb);

        cb = new JCheckBox("Java");
        cb.addItemListener(this);
        add(cb);

        cb = new JCheckBox("Perl");
        cb.addItemListener(this);
        add(cb);

        jlab = new JLabel("Select languages");
        add(jlab);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        JCheckBox cb = (JCheckBox) ie.getItem();
        if (cb.isSelected()) {
            jlab.setText(cb.getText() + " is selected");
        } else {
            jlab.setText(cb.getText() + " is cleared");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JCheckBoxDemo frame = new JCheckBoxDemo();
            frame.setVisible(true);
        });
    }
}
