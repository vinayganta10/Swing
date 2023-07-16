package Swing;

import javax.swing.*;
import java.awt.*;

public class progressBar extends JFrame{
    int i = 0,num = 0;
    JProgressBar jpb;
    progressBar(){
        jpb = new JProgressBar(0,2000);
        jpb.setValue(0);
        jpb.setBorderPainted(true);
        add(jpb);
        setSize(250,150);
        setLayout(new FlowLayout());
    }
    public void iterate(){
        while(i<=2000){
            jpb.setValue(i);
            i=i+20;
            try{Thread.sleep(150);}catch(Exception e){}
        }
    }
    public static void main(String[] args) {
        progressBar m = new progressBar();
        m.setVisible(true);
        m.iterate();
    }
}

