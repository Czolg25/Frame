package pl.epicserwer.czolg.cccc.testArea;

import javax.swing.*;

public class TextField extends JTextArea {

    public TextField(String text,boolean isEditable,int x,int y,int width,int height){
        setText(text);
        setBounds(x,y,width,height);
        setEditable(isEditable);
    }
}
