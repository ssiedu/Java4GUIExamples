
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

//working without LayoutManagers

public class GUIFour {
    public static void main(String args[]){
        Frame f=new Frame();
        f.setVisible(true);
        f.setSize(400,400);//width,height
        
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("Save");

        f.setLayout(null);
        
        l1.setSize(60,30);//w,h
        l1.setLocation(100, 100);//x,y
        
        t1.setSize(100,30);
        t1.setLocation(180,100);
        
        l2.setBounds(100,150,60,30);//x,y,w,h
        t2.setBounds(180,150,100,30);
        
        b1.setBounds(160,210,50,30);
        
        f.add(l1); 
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        
        



        
    }
}
