package UI;

import javax.swing.*;
import java.awt.*;

public class VehicleUI {
    public VehicleUI() {

        JFrame frame = new JFrame("Vehicle - UI");

        JPanel left = new JPanel();
        left.setBackground(Color.green);
        JPanel right = new JPanel();
        right.setBackground(Color.black);

        frame.setSize(1500,750);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }
}
