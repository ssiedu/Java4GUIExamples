import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventThree extends Frame implements MouseListener {

public EventThree(){
    initComponents();
}    
    
public void initComponents(){
    setLayout(new FlowLayout());
    t1=new TextField(10);
    t2=new TextField(10);
    add(t1); add(t2); 
    t1.addMouseListener(this);
}   

public static void main(String args[]){
    EventThree ob=new EventThree();
    ob.setSize(500, 500);
    ob.setVisible(true);
}    
    TextField t1,t2;

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        t1.setText("EnterName");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        t1.setText("");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        t1.setBackground(Color.yellow);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        t1.setBackground(Color.white);
    }
}
