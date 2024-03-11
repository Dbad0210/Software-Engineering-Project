package java_mysql;

import javax.swing.*;
import Java_GUI_Form.Java_GUI_Form; // Import the Java_GUI_Form class

public class Java_MySQl {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create a new JFrame
                JFrame frame = new JFrame("Java Basketball Stats Tracker");
                
                // Create an instance of your Java_GUI_Form panel
                Java_GUI_Form guiForm = new Java_GUI_Form(); // Use the fully qualified name
                
                // Add the panel to the frame's content pane
                frame.setContentPane(guiForm);
                
                // Set the frame properties
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}