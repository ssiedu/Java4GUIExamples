
//working with BorderLayout (default for a frame)


import java.awt.*;

public class GUIOne {
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
        
        f.add("North",l1);
        f.add("South",t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
/*
    1. Create a container
    2. create components
    3. add components on container
*/
