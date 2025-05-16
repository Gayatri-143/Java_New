package Exp8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterApp {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Counter");
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create label and text field
        JLabel label = new JLabel("Counter");
        JTextField counterField = new JTextField("0", 10);
        counterField.setHorizontalAlignment(JTextField.CENTER);
        counterField.setEditable(false);

        // Create buttons
        JButton countUpBtn = new JButton("Count Up");
        JButton countDownBtn = new JButton("Count Down");
        JButton resetBtn = new JButton("Reset");

        // Add action listeners
        countUpBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(counterField.getText());
                counterField.setText(Integer.toString(value + 1));
            }
        });

        countDownBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(counterField.getText());
                counterField.setText(Integer.toString(value - 1));
            }
        });

        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counterField.setText("0");
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(counterField);
        frame.add(countUpBtn);
        frame.add(countDownBtn);
        frame.add(resetBtn);

        // Make frame visible
        frame.setVisible(true);
    }
}
