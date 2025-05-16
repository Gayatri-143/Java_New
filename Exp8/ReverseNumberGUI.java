package Exp8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReverseNumberGUI extends JFrame {

    private JTextField inputField;
    private JButton reverseButton;
    private JLabel resultLabel;

    public ReverseNumberGUI() {
        setTitle("Number Reverser");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Create components
        JLabel promptLabel = new JLabel("Enter a number:");
        inputField = new JTextField(15);
        reverseButton = new JButton("Reverse");
        resultLabel = new JLabel("Reversed Number: ");

        // Add action listener
        reverseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reverseNumber();
            }
        });

        // Layout setup
        setLayout(new FlowLayout());
        add(promptLabel);
        add(inputField);
        add(reverseButton);
        add(resultLabel);
    }

    private void reverseNumber() {
        String input = inputField.getText().trim();
        try {
            int number = Integer.parseInt(input);
            int reversed = 0;
            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
            resultLabel.setText("Reversed Number: " + reversed);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ReverseNumberGUI().setVisible(true);
        });
    }
}
