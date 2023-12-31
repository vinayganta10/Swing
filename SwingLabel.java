package Swing;

import javax.swing.*;
import java.awt.*;

public class SwingLabel extends JFrame {
    JFrame jf;
    SwingLabel(){
        JLabel j1 = new JLabel("first label");
        JLabel j2 = new JLabel("second label");
        j1.setBounds(50,50,100,30);
        j2.setBounds(100,50,100,30);
        add(j1);add(j2);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingLabel();
            }
        });
    }
}


