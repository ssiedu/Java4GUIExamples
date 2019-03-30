
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventOne extends Frame implements ActionListener, TextListener, ItemListener {

    public EventOne(){
        initComponents();
    }

    public void initComponents() {
        setLayout(new FlowLayout());
        ch=new Choice();
        ch.add("java");
        ch.add("python");
        ch.add("dotnet");
        ch.add("linux");
        add(ch);
        t1 = new TextField(10);
        t2 = new TextField(10);
        b1 = new Button("Copy");
        b2 = new Button("Clear");
        b3 = new Button("Exit");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        t1.addTextListener(this);
        ch.addItemListener(this);
    }

    public static void main(String args[]) {
        EventOne ob = new EventOne();
        ob.setSize(400, 400);
        ob.setVisible(true);
    }

    TextField t1, t2;
    Button b1, b2, b3;
    Choice ch;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            String s=t1.getText();
            t2.setText(s);
        }else if(e.getSource()==b2){
            t1.setText("");
            t2.setText("");
            t1.requestFocus();
        }else if(e.getSource()==b3){
            System.exit(0);
        }
        
    }

    @Override
    public void textValueChanged(TextEvent e) {
        t2.setText(t1.getText());
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String s=ch.getSelectedItem();
        
        if(s.equals("java")){
            t1.setText("J2SE,J2EE");
        }else if(s.equals("python")){
            t1.setText("DJango,Panda");
        }else if(s.equals("dotnet")){
            t1.setText("C#,VB.NET");
        }else if(s.equals("linux")){
            t1.setText("UM,ADMIN");
        }
    }

}
