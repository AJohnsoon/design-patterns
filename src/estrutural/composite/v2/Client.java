package src.estrutural.composite.v2;

import javax.swing.*;
import java.awt.*;

public class Client {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JLabel title = new JLabel("TITLE");
        frame.add(title, BorderLayout.NORTH);

        JPanel panel = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Label #1");
        JButton button = new JButton("Button #1");
        JButton button2 = new JButton("Button #2");
        panel.add(label);
        panel.add(button);
        panel.add(button2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400, 200);
        frame.setVisible(true );
    }
}
