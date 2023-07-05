package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingTextField{
    JFrame f;
    public SwingTextField(){
        f = new JFrame("Demo of swing text fields");
        JTextField tf = new JTextField(10);
        JLabel l = new JLabel("Enter text: ");
        //tf.setBounds(50,100,95,30);
        //l.setBounds(50,150,95,30);//it is a bad practice to use setbounds function.it is always optimal to use layouts which makes it more flexible
        //especially when we move to different screen sizes.
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Writing");
            }
        });
        f.add(l);
        f.add(tf);
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingTextField();
            }
        });
    }
}
