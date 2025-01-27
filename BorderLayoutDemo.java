import java.awt.*;

public class BorderLayoutDemo extends Frame { // Fixed 'frame' to 'Frame'

    BorderLayoutDemo() {
        setTitle("Border Layout Example"); // Fixed 'setTitile' to 'setTitle'
        setSize(400, 400);
        setLayout(new BorderLayout()); // Fixed 'BoarderLayout' to 'BorderLayout'
        setVisible(true); // Fixed 'setVissible' to 'setVisible'

        Label l1 = new Label("North"); // Fixed 'Lable' to 'Label'
        add(l1, BorderLayout.NORTH); // Fixed 'BoarderLayout.North' to 'BorderLayout.NORTH'
    }

    public static void main(String arg[]) {
        new BorderLayoutDemo(); // Fixed 'BoarderLayoutDemo' to 'BorderLayoutDemo'
    }
}
