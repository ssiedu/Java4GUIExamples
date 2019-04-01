import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventTwo extends Frame implements KeyListener {

public EventTwo(){
    initComponents();
}    
    
public void initComponents(){
    setLayout(new FlowLayout());
    t1=new TextField(10);
    t2=new TextField(10);
    add(t1); add(t2); 
    t1.addKeyListener(this);
}   

public static void main(String args[]){
    EventTwo ob=new EventTwo();
    ob.setSize(500, 500);
    ob.setVisible(true);
}    
    TextField t1,t2;

    @Override
    public void keyTyped(KeyEvent e) {
     
        char ch=e.getKeyChar();
        if(ch=='X' || ch=='x'){
            System.exit(0);
        }
                
        
        
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int code=e.getKeyCode();
        if(code==KeyEvent.VK_F1){
            String s1=t1.getText();
            String s2=s1.toUpperCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_F2){
            String s1=t1.getText();
            String s2=s1.toLowerCase();
            t1.setText(s2);
        }else if(code==KeyEvent.VK_ESCAPE){
            t1.setText("");
        }else if(code==KeyEvent.VK_ENTER){
            t2.setText(t1.getText());
        }
        
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
