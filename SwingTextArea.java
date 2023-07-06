package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTextArea implements ActionListener {
    JFrame jf;
    public SwingTextArea(){
        jf = new JFrame("TextArea demo");
        JLabel l = new JLabel("Enter textArea");
        JTextArea ta = new JTextArea("Text area",10,10);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400,400);
        jf.add(l);
        jf.add(ta);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingTextArea();
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Writing");
    }
}
