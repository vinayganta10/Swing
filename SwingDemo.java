package Swing;

import javax.swing.*;
import java.awt.event.*;

public class SwingDemo {
    SwingDemo(){
        JFrame jf = new JFrame("Button example");
        JButton b = new JButton("Submit");
        final JTextField tf = new JTextField();
        b.setBounds(50,100,95,30);
        tf.setBounds(50,50,150,20);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to swing program");
            }
        });
        jf.add(b);
        jf.add(tf);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);

    }
    public static void main(String[] args) {
        new SwingDemo();
    }
}
