import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventFive extends Frame implements WindowListener {
    
    Button b1;
    
    public EventFive() {
        initComponents();
    }

    public void initComponents() {
        setLayout(null);
        b1=new Button("Click Here");
        b1.setBounds(50, 50, 80, 30);
        add(b1);
        addWindowListener(this);
    }

    public static void main(String args[]) {
        EventFive ob = new EventFive();
        ob.setSize(500, 500);
        ob.setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        setTitle("Welcome");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        setTitle("Stop");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        setTitle("Start");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        setBackground(Color.white);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        setBackground(Color.yellow);
    }
}
