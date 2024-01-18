package UI;

import org.carrental.service.AuthenticationService;

import javax.swing.*;
import java.awt.*;

public class LoginUI {
        private final AuthenticationService authenticationService = new AuthenticationService();
    public LoginUI() {
        // creating Frame here


        JFrame frame = new JFrame("Rental Car App");

        JTextField usertf = new JTextField("username");
        usertf.setBounds(150,100,200,30);

        JTextField passtf = new JTextField("password");
        passtf.setBounds(150,150,200,30);

        JButton loginBtn = new JButton("LOG IN");
        loginBtn.setBounds(150,300,200,30);


        frame.add(usertf);
        frame.add(passtf);
        frame.add(loginBtn);

        // properties of frame here
        frame.setSize(1500,750);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // check login
        loginBtn.addActionListener((event)->{

            if (authenticationService.checkLogin(usertf.getText() , passtf.getText())){
                frame.dispose();
                new HomeUI();
            }else {
                JOptionPane.showMessageDialog(frame,"Incorrect credentials");
            }

        });
    }
}
