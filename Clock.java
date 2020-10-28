import java.awt.*;
import javax.swing.*;

public class Clock extends JFrame { //for applet creation
    JLabel digitalClock;   
    BaseThread bt;
    public Clock(){
        digitalClock =new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        digitalClock.setFont(new Font("Algerian",Font.CENTER_BASELINE,60)); //setting font style and size
        digitalClock.setOpaque(true);
        digitalClock.setBackground(Color.BLACK);
        digitalClock.setForeground(Color.WHITE);
        add(digitalClock);
        setSize(1000, 800); //applet frame size
        setLocationRelativeTo(null);
        bt = new BaseThread(this);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Clock();  //calling constructor
    }
}