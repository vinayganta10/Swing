package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingComboBox extends JFrame {
    private JLabel l;
    JComboBox cb;
    JButton b;
    String[] languages ={"Java","C++","C#","PHP"};
    SwingComboBox(){
        cb = new JComboBox(languages);
        l = new JLabel();
        b = new JButton("Show");
        l.setHorizontalAlignment(JLabel.CENTER);
        add(l);
        add(cb);
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l.setText("Selected: " + cb.getSelectedItem());
            }
        });
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new SwingComboBox();
            }
        });
    }
}
