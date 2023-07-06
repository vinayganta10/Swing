package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingPasswordField extends JFrame{
    JFrame jf;
    SwingPasswordField(){
        JLabel l = new JLabel("Password");
        JPasswordField jpf = new JPasswordField(10);
        add(l);
        add(jpf);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingPasswordField();
            }
        });
    }
}
