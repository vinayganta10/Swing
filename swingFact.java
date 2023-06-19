import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class swingFact {
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JButton b1 = new JButton("Compute");
    JButton b2 = new JButton("Reset");
    swingFact(){
        JFrame jfrm = new JFrame("A simple frame program");
        jfrm.setSize(290, 170);
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel l1 = new JLabel("Enter a: ");
        l1.setBounds(10,10,50,20);
        JLabel l2 = new JLabel("Result");
        l2.setBounds(10,30,50,20);
        jfrm.add(l1);
        jfrm.add(t1);
        jfrm.add(l2);
        jfrm.add(t2);
        jfrm.add(b1);
        jfrm.add(b2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                if (s.equals(b1.getActionCommand())) {
                    int n = Integer.parseInt(t1.getText());
                    int fact = 1;
                    for (int i = 1; i <= n; i++)
                        fact *= i;
                    t2.setText(" " + fact);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new swingFact();
            }
        });

    }
}
