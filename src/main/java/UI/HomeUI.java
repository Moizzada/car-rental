package UI;

import org.carrental.domain.Customer;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class HomeUI {
    public HomeUI() {
        JFrame frame = new JFrame("Car Rental App - HOME");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,3,10,10));
        buttonPanel.setBounds(100,100,200,200);

        JButton customer = new JButton("CUSTOMER");
        JButton vehicle = new JButton("VEHICLE");
        JButton vehicleOwner = new JButton("VEHICLE OWNER");
        JButton booking = new JButton("BOOKING");
        JButton user = new JButton("USER");
        JButton logout = new JButton("LOG OUT");
        buttonPanel.add(customer);
        buttonPanel.add(vehicle);
        buttonPanel.add(vehicleOwner);
        buttonPanel.add(booking);
        buttonPanel.add(user);
        buttonPanel.add(logout);

        customer.addActionListener((event)->{
            frame.dispose();
            new CustomerUI();

        });

        vehicle.addActionListener((event)->{
            frame.dispose();
            new VehicleUI();
        });

        vehicleOwner.addActionListener((event)->{
            frame.dispose();
            new VehicleOwnerUI();
        });

        booking.addActionListener((event)->{
            frame.dispose();
            new BookingUI();
        });

        user.addActionListener((event)->{
            frame.dispose();
            new UserUI();
        });

        logout.addActionListener((event)->{
            frame.dispose();

        });

        frame.add(buttonPanel);

        frame.setSize(700,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,200,200));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




































//        JPanel btnPanel = new JPanel();
//        btnPanel.add(new JButton("1"));
//        btnPanel.add(new JButton("2"));
//        btnPanel.add(new JButton("3"));
//        btnPanel.add(new JButton("4"));
//        btnPanel.add(new JButton("5"));


//        // table here
//        JPanel tablePanel = new JPanel();
//        tablePanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
//        String[][] data = { {"101","Amir","6745"},
//                {"102","Moiz","6745"},
//                {"103","Fahad","6745"},
//                {"104","Mahad","6745"}};
//        String[] column = {"ID","NAME","SALARY"};
//        JTable jt = new JTable(data,column);
//        jt.setBounds(30,40,200,300);
//        JScrollPane sp = new JScrollPane(jt);
//        tablePanel.add(sp);
//
//
//
//        frame.setLayout(new BorderLayout(10,50));
//
//
//        frame.add(btnPanel,BorderLayout.SOUTH);
//        frame.add(tablePanel,BorderLayout.CENTER);
//        frame.add(new JButton("HELLO"),BorderLayout.NORTH);
        // properties of frame here
//        frame.setSize(500,700);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);

    }
}
