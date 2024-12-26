package com.nico.calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
    public GUI(){
        //Creating FRAME object that will hold our components
        JFrame frame = new JFrame();

        //Creating PANEL object that will hold my buttons
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));

        //Add pannel to frame and set position as CENTER
        frame.add(panel, BorderLayout.CENTER);

        //Clossing the program when fram's close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        //Setting the title of the GUI (Top name)
        frame.setTitle("Nico GUI");

        //Setting frame size dinamycally according to components added
        frame.pack();

        //Making the fram visible
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
}