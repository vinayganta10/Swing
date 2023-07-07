package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class RadioButtonExample extends JFrame implements ActionListener{
    JRadioButton rb1,rb2;
    JButton b;
    RadioButtonExample(){
        rb1=new JRadioButton("Male");
        rb2=new JRadioButton("Female");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);bg.add(rb2);
        b=new JButton("click");
        b.addActionListener(this);
        add(rb1);add(rb2);add(b);
        setSize(300,300);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e){
        if(rb1.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Male.");
        }
        if(rb2.isSelected()){
            JOptionPane.showMessageDialog(this,"You are Female.");
        }
    }
    public static void main(String args[]){
        new RadioButtonExample();
    }}
