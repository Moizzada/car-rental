package UI;

import javax.swing.*;
import java.awt.*;

public class CustomerUI {
    public CustomerUI() {

        JFrame frame = new JFrame("CUSTOMER - UI");

        JPanel topPanel = new JPanel();

        topPanel.setLayout(new BorderLayout(30,15));
        JButton searchButton = new JButton("search");

        topPanel.add(searchButton,BorderLayout.NORTH);
        topPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame.add(topPanel);
//----------------------------------------------------------------------------------
        JPanel crudPanel = new JPanel();
        crudPanel.setLayout(new BoxLayout(crudPanel,BoxLayout.Y_AXIS));


        JButton edit = new JButton("EDIT");
        JButton add = new JButton("ADD");
        JButton delete = new JButton("DELETE");
        JButton back = new JButton("BACK");

        Dimension buttonSize = new Dimension(150,100);
        edit.setPreferredSize(buttonSize);
        add.setPreferredSize(buttonSize);
        delete.setPreferredSize(buttonSize);
        back.setPreferredSize(buttonSize);

        crudPanel.add(edit);
        crudPanel.add(add);
        crudPanel.add(delete);
        crudPanel.add(back);

        frame.add(crudPanel,BorderLayout.EAST);


        // table panel

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new GridLayout(5,6));
        JLabel id = new JLabel("id");
        JLabel name = new JLabel("id");
        JLabel number = new JLabel("id");
        JLabel cnic = new JLabel("id");
        JLabel address = new JLabel("id");
        JLabel refNumber1 = new JLabel("id");



        // frame properties
        frame.setSize(700,500);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}
