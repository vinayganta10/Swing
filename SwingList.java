package Swing;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class SwingList extends JFrame{
    private Label l;
    public SwingList(){
        l = new Label();
        String[] cities = {"Newyork", "Denver", "London", "Queens", "Brooklyn"};
        DefaultListModel<String> djl = new DefaultListModel<>();
        for(String i:cities){
            djl.addElement(i);
        }
        JList<String> jl = new JList<>(djl);
        JScrollPane jsp = new JScrollPane(jl);
        jsp.setPreferredSize(new Dimension(120,50));
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(jsp);add(l);
        jl.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                System.out.println(e.getFirstIndex());
                l.setText("Selected");
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                new SwingList();
            }
        });
    }
}
