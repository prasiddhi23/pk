import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample2 extends JFrame {
    SwingExample2() {
        setTitle("Swing");
        setSize(400, 400);
        setLayout(new FlowLayout());

        JButton b1 = new JButton("click");
        add(b1);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello prasiddhi");
            }
        });

        setVisible(true);
        
    }

    public static void main(String[] args) {
        new SwingExample2();
    }
}
