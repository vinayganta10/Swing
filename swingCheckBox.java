package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swingCheckBox extends JFrame{
    JFrame jf;
    JLabel l1,l2;
    Checkbox c1,c2;
    swingCheckBox(){
        l1= new JLabel();
        l2= new JLabel();
        c1 =new Checkbox("C++");
        c2 = new Checkbox("Java",true);
        l1.setText("C++");
        l2.setText("Java");
        add(c1);
        add(c2);
        add(l1);
        add(l2);
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l1.setText("C++ Checkbox: " + (e.getStateChange()==1?"selected":"not selected"));
            }
        });
        c2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                l2.setText("Java Checkbox: " + (e.getStateChange()==1?"selected":"not selected"));
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new swingCheckBox();
            }
        });
    }
}
