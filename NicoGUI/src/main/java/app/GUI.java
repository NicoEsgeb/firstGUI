package app;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

    //--Declaration of frame object globaly and privatly
    private JFrame frame;
    //--Declaration of panel object globaly and privatly
    private JPanel panel;
    //--Declaration of label object globaly and privatly
    private JLabel label;
    //--Dreclaration of buttons
    private JButton button;
    private JButton button2;
    //--Declaration Button Count variable
    private int buttonCount = 0;

    //----- This method set all the components of the GUI -----
    public GUI(){
        //--This frame object will hold all the components
        frame = new JFrame();
        //--This panel object will hold the buttons
        panel = createPanel();

        //-------Frame Configuration-------
        //--Set Frame Title
        frame.setTitle("The GUI");
        //--Adding Panel to Frame
        frame.add(panel,BorderLayout.CENTER);
        //--Ensuring program closure with Frame closure
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //--Set Frame size
        frame.pack(); //Dinamic Size
    }

    //--------Creation of new Panel and its configuration---------
    private  JPanel createPanel(){
        //--Panel Creation
        JPanel panel = new JPanel();
        //--Setting Panel's Border
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10 ,30));
        //--Setting Button's layout
        panel.setLayout(new GridLayout(0,1)); //Rows grow dinamically

        //--------Create and add Button to Panel---------
        //--Button Creation
        button = new JButton("Add one Click");
        //--Adding action to the button
        button.addActionListener((this));
        //--Adding button to panel
        panel.add(button);

        //--------Create and add Second Button to Panel---------
        //--Button creation
        button2 = new JButton("Delete one click");
        //--Adding action button 
        button2.addActionListener((this));
        //--Adding button to panel
        panel.add(button2);


        //--------Creation and addition of label----------
        //--Creation of label
        label = new JLabel(("Number of clicks: 0"));
        panel.add(label);

        //--------Returning Panel--------
        return panel;
    }

    //----------Method to set the Frame visible-----------
    public void setVisible(){
        frame.setVisible(true);
    }

    //----------Creation of actionListener method-------------
    //--Overriding to ensure that the method was previously declared
    @Override
    //--Definition of actionListener method
    public void actionPerformed(ActionEvent e){
        //------Different action conditions------
        //--Update buttonCount with each click
        if (e.getSource() == button) {
            buttonCount++;
            label.setText("Number of clicks: " + buttonCount);
        } else if (e.getSource() == button2) {
            buttonCount--;
            label.setText("Number of clicks: " + buttonCount);
        }
    }
}
