//Changing Layout to Flow

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class GUITwo {
    public static void main(String args[]){
           
        //step-1 (create container)
        Frame f=new Frame();
        f.setVisible(true);
        f.setSize(500,400);//width,height
        
        //step-2 (create components)
        
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("Save");
        
        //step-3 (add the components on container)
        
        //changing Layout from Border to Flow
        
        FlowLayout fL=new FlowLayout();
        f.setLayout(fL);
        
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        
        
        
    }
}
