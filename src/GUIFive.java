
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

// working with multiple LayoutManagers

public class GUIFive {
    public static void main(String args[]){
        
        Frame f=new Frame();
        f.setVisible(true);
        f.setSize(300,300);//width,height
        
        Label l1=new Label("Name");
        Label l2=new Label("Age");
        Label l3=new Label("Subjects");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        Button b1=new Button("Save");
        Button b2=new Button("Cancel");
        Button b3=new Button("Exit");
        Checkbox c1=new Checkbox("Java");
        Checkbox c2=new Checkbox("Python");
        
        Panel p=new Panel();
        Panel p1=new Panel();
        Panel p2=new Panel();
        
        p.setLayout(new FlowLayout());
        p.add(c1); p.add(c2);
        
        p1.setLayout(new GridLayout(3,2));
        p1.add(l1); p1.add(t1);
        p1.add(l2); p1.add(t2);
        p1.add(l3); p1.add(p);
        
        
        p2.setLayout(new FlowLayout());
        p2.add(b1); p2.add(b2); p2.add(b3);
        
        f.add("North",p1);
        f.add("South",p2);
        
        
        p2.setBackground(Color.pink);
        
        Label l4=new Label("SSI");
        Panel p3=new Panel();
        p3.setLayout(null);
        l4.setBounds(20, 30, 50, 20);
        p3.add(l4);
        
        f.add(p3);
        
        
    }
}
