# Java Swing Notes

## Introduction to Java Swing
Java Swing is a set of GUI (Graphical User Interface) components for 
building desktop applications in Java. It provides a rich set of libraries 
to create interactive user interfaces.

## Key Components of Java Swing
1. **JFrame**: The main window or container for a Swing application.
2. **JPanel**: A container that can hold other components.
3. **JButton**: A button that performs an action when clicked.
4. **JLabel**: A non-editable text component for displaying text or 
images.
5. **JTextField**: A text input field for users to enter text.
6. **JTextArea**: A multiline text area for editing larger text content.
7. **JScrollPane**: A scrollable pane used to view a component that is 
larger than the available space.

## Basic Structure of a Swing Application
```java
import javax.swing.*;

public class MySwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add components to the frame
        
        frame.pack();
        frame.setVisible(true);
    }
}

