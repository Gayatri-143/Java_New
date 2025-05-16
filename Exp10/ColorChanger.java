package Exp10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends JFrame implements ActionListener {

    private JComboBox<String> colorComboBox;
    private JPanel mainPanel;

    private String[] colors = { "White", "Red", "Green", "Blue", "Yellow", "Cyan", "Gray" };

    public ColorChanger() {
        setTitle("Background Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center window

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        colorComboBox = new JComboBox<>(colors);
        colorComboBox.addActionListener(this);
        colorComboBox.setSelectedIndex(0);  // Default color is White

        mainPanel.setBackground(Color.WHITE);  // Initial background
        mainPanel.add(colorComboBox, BorderLayout.NORTH);

        add(mainPanel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedColor = (String) colorComboBox.getSelectedItem();

        switch (selectedColor) {
            case "Red": mainPanel.setBackground(Color.RED); break;
            case "Green": mainPanel.setBackground(Color.GREEN); break;
            case "Blue": mainPanel.setBackground(Color.BLUE); break;
            case "Yellow": mainPanel.setBackground(Color.YELLOW); break;
            case "Cyan": mainPanel.setBackground(Color.CYAN); break;
            case "Gray": mainPanel.setBackground(Color.GRAY); break;
            default: mainPanel.setBackground(Color.WHITE); break;
        }
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}
