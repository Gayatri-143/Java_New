package Exp8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GenderSelectionGUI {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create radio buttons
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        // Group the radio buttons to allow only one selection
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        // Create a button to show the selected option
        JButton selectButton = new JButton("Select");
        JLabel resultLabel = new JLabel("Please select your gender");

        // Add action listener to the button
        selectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (maleButton.isSelected()) {
                    resultLabel.setText("Selected Gender: Male");
                } else if (femaleButton.isSelected()) {
                    resultLabel.setText("Selected Gender: Female");
                } else {
                    resultLabel.setText("No gender selected");
                }
            }
        });

        // Add components to the frame
        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(selectButton);
        frame.add(resultLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
