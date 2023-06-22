package pl.epicserwer.czolg.cccc.frames;

import pl.epicserwer.czolg.cccc.panels.MyPanel;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame(){
        super("llalalalsldld");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocation(50,50);


        add(new MyPanel());

        setVisible(true);
    }
}
