package pl.epicserwer.czolg.cccc.panels;

import pl.epicserwer.czolg.cccc.buttons.Button;
import pl.epicserwer.czolg.cccc.testArea.TextField;
import pl.epicserwer.czolg.cos.Listener;

import javax.swing.*;

public class MyPanel extends JPanel {
    public MyPanel() {
        super();
        setLayout(null);

        Button button =  new Button("OK",100,50);
        add(button);


        JTextArea textArea = new TextField("",true,300,10,100,200);

        JTextArea jTextArea = new TextField("Hello World!",false,200,50,100,200);


        button.addActionListener(new Listener(textArea,jTextArea));

        add(jTextArea);
        add(textArea);
    }
}
