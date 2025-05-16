package Exp11;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set FlowLayout with left alignment, hgap=10, vgap=20
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        // Create checkboxes
        JCheckBox javaCheckBox = new JCheckBox("Java");
        JCheckBox pythonCheckBox = new JCheckBox("Python");
        JCheckBox cppCheckBox = new JCheckBox("C++");

        // Add checkboxes to the frame
        frame.add(javaCheckBox);
        frame.add(pythonCheckBox);
        frame.add(cppCheckBox);

        // Make frame visible
        frame.setVisible(true);
    }
}

