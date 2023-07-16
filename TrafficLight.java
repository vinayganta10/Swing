package AbstractWindowTool;

import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends Frame implements ItemListener{
    CheckboxGroup c;
    Checkbox c1,c2,c3;
    Color col;
    String s;
    TrafficLight(){
        c = new CheckboxGroup();
        c1 = new Checkbox("Red",c,true);
        c2 = new Checkbox("Yellow",c,false);
        c3 = new Checkbox("Green",c,false);
        add(c1);add(c2);add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        col = Color.RED;
        s = "red";
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawOval(70,70,20,20);
        g.drawOval(70,110,20,20);
        g.drawOval(70,150,20,20);
        //g.drawRect(60,120,200,200);

        g.setColor(col);
        if(col == Color.RED)
            g.fillOval(70,70,20,20);
        else if(col == Color.YELLOW)
            g.fillOval(70,110,20,20);
        else if (col == Color.GREEN) {
            g.fillOval(70,150,20,20);
        }
    }
    public static void main(String[] args) {
        new TrafficLight();
    }
    public void itemStateChanged(ItemEvent ie){
        if(c.getSelectedCheckbox().getLabel() == "Red")
            col = Color.RED;
        else if(c.getSelectedCheckbox().getLabel() == "Yellow")
            col = Color.YELLOW;
        else if(c.getSelectedCheckbox().getLabel() == "Green")
            col = Color.GREEN;
        repaint();
    }
}
