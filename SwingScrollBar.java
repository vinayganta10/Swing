package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SwingScrollBar
{
    public SwingScrollBar(){
        JFrame f= new JFrame("Scrollbar Example");
        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(400,100);
        TextArea ta = new TextArea();
        ta.setColumns(100);
        JScrollPane jsp = new JScrollPane(ta);
        final JScrollBar s= new JScrollBar(JScrollBar.VERTICAL,100,300,0,400){
            @Override
            public Dimension getPreferredSize(){
                return new Dimension(super.getPreferredSize().width,ta.getPreferredSize().height);
            }
        };
        //s.setBounds(100,100, 50,100);
        f.add(jsp);
        f.add(label);f.add(s);
        f.setSize(800,800);
        f.setLayout(new FlowLayout(FlowLayout.RIGHT));
        f.setVisible(true);
        s.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical Scrollbar value is:"+ s.getValue());
            }
        });
    }
    public static void main(String args[])
    {
        new SwingScrollBar();
    }}
