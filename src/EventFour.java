
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class EventFour extends Frame implements MouseMotionListener {
    
    Button b1;
    
    public EventFour() {
        initComponents();
    }

    public void initComponents() {
        setLayout(null);
        b1=new Button("Click Here");
        b1.setBounds(50, 50, 80, 30);
        add(b1);
        addMouseMotionListener(this);
    }

    public static void main(String args[]) {
        EventFour ob = new EventFour();
        ob.setSize(500, 500);
        ob.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x=e.getX();
        int y=e.getY();
        setTitle("Dragged @ : "+x+","+y);
        b1.setLocation(x,y);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

        int x=e.getX();
        int y=e.getY();
        setTitle("Moving @ : "+x+","+y);
    }
}
