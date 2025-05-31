import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonDemo extends JFrame implements ActionListener {
    JLabel jlab;

    public JRadioButtonDemo() {
        setTitle("JRadioButton Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JRadioButton b1 = new JRadioButton("Option A");
        b1.addActionListener(this);
        add(b1);

        JRadioButton b2 = new JRadioButton("Option B");
        b2.addActionListener(this);
        add(b2);

        JRadioButton b3 = new JRadioButton("Option C");
        b3.addActionListener(this);
        add(b3);

        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);

        jlab = new JLabel("Choose an option");
        add(jlab);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        jlab.setText("You selected: " + ae.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JRadioButtonDemo frame = new JRadioButtonDemo();
            frame.setVisible(true);
        });
    }
}
