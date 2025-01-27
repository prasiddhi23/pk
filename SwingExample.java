import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class  extends JFrame {
    SwingExample() {
        setTitle("Swing"); 
        setSize(400, 400);
        setLayout(new FlowLayout());

        JButton b1 = new JButton("Test"); 
        add(b1); // Added a missing semicolon

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                System.out.println("hello developers"); 
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) { 
        new SwingExample();
}
}
