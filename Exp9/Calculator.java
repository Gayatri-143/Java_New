package Exp9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private double firstNumber, secondNumber, result;
    private String operator;

    public Calculator() {
        setTitle("Calculator");
        setSize(400, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Text field
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        add(textField, BorderLayout.NORTH);

        // Buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "%", "x²", "√", "x³"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            switch (command) {
                case "C":
                    textField.setText("");
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    firstNumber = Double.parseDouble(textField.getText());
                    operator = command;
                    textField.setText("");
                    break;
                case "=":
                    secondNumber = Double.parseDouble(textField.getText());
                    switch (operator) {
                        case "+": result = firstNumber + secondNumber; break;
                        case "-": result = firstNumber - secondNumber; break;
                        case "*": result = firstNumber * secondNumber; break;
                        case "/": 
                            if (secondNumber == 0) {
                                textField.setText("Error: Divide by 0");
                                return;
                            }
                            result = firstNumber / secondNumber;
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    break;
                case "%":
                    result = Double.parseDouble(textField.getText()) / 100;
                    textField.setText(String.valueOf(result));
                    break;
                case "x²":
                    result = Math.pow(Double.parseDouble(textField.getText()), 2);
                    textField.setText(String.valueOf(result));
                    break;
                case "√":
                    result = Math.sqrt(Double.parseDouble(textField.getText()));
                    textField.setText(String.valueOf(result));
                    break;
                case "x³":
                    result = Math.pow(Double.parseDouble(textField.getText()), 3);
                    textField.setText(String.valueOf(result));
                    break;
                default:
                    textField.setText(textField.getText() + command);
            }
        } catch (NumberFormatException ex) {
            textField.setText("Error");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
