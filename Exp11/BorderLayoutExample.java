package Exp11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Converter");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // North panel
        JPanel northPanel = new JPanel();
        JLabel enterLabel = new JLabel("Enter the number");
        JTextField inputField = new JTextField(10);
        northPanel.add(enterLabel);
        northPanel.add(inputField);
        frame.add(northPanel, BorderLayout.NORTH);

        // Center panel
        JPanel centerPanel = new JPanel(new GridLayout(1, 3));
        JButton binaryButton = new JButton("Binary");
        JButton octalButton = new JButton("Octal");
        JButton hexButton = new JButton("Hex");
        centerPanel.add(binaryButton);
        centerPanel.add(octalButton);
        centerPanel.add(hexButton);
        frame.add(centerPanel, BorderLayout.CENTER);

        // South panel
        JPanel southPanel = new JPanel();
        JLabel resultLabel = new JLabel("Result");
        JTextField resultField = new JTextField(10);
        resultField.setEditable(false);
        southPanel.add(resultLabel);
        southPanel.add(resultField);
        frame.add(southPanel, BorderLayout.SOUTH);

        // Action listeners for buttons
        binaryButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(inputField.getText());
                resultField.setText(Integer.toBinaryString(num));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        });

        octalButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(inputField.getText());
                resultField.setText(Integer.toOctalString(num));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        });

        hexButton.addActionListener(e -> {
            try {
                int num = Integer.parseInt(inputField.getText());
                resultField.setText(Integer.toHexString(num).toUpperCase());
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        });

        frame.setVisible(true);
    }
}
